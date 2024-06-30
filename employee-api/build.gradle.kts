import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.openapitools.generator.gradle.plugin.tasks.GenerateTask

plugins {
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.spring") version "1.9.22"
    kotlin("plugin.jpa") version "1.9.22"
    id("org.springframework.boot") version "3.2.4"
    id("io.spring.dependency-management") version "1.1.4"
    id("org.openapi.generator") version "7.3.0"
}

version = "1.0.0"
group = "employee"
val apiVersion = "1.0.0"

val apiTemplateDir = "${projectDir}/api-template"
val buildDir = file(layout.buildDirectory.asFile)
val apiDescription = "${projectDir}/api/service.yaml"
val srcDir = file("${layout.projectDirectory.asFile}${relativeSourcePath()}")
val resourcesDir = file("${layout.projectDirectory.asFile}/src/main/resources")

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}


tasks.withType<KotlinCompile> {
    dependsOn("copyGeneratedApi")
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "21"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.register<GenerateTask>("generateServiceApi") {
    group = "build"

    inputs.file(file(apiDescription))

    generatorName.set("kotlin-spring")
    templateDir.set(apiTemplateDir)
    inputSpec.set(apiDescription)
    outputDir.set("$buildDir/generated")
    val basePackage = "${project.group}"
    configOptions.set( mapOf(
        "modelMutable" to "false",
        "serviceInterface" to "true",
        "useSpringBoot3" to "true",
        "modelPackage" to "$basePackage.api.model",
        "basePackage" to basePackage,
        "apiPackage" to "$basePackage.api",
        "configPackage" to "$basePackage.config",
        "useTags" to "true"
    ) )
}

tasks.register("copyGeneratedApi") {
    group = "build"

    dependsOn("generateServiceApi")

    doLast{

        copy{
            from(file("$buildDir/generated/${relativeSourcePath()}")) {
                exclude("**/ApiUtil.kt")
                exclude("**/Application.kt")
                exclude("**/HealthApi.kt")
                exclude("**/HealthApiClient.kt")
                exclude("**/Exceptions.kt")
            }
            into(file("$srcDir"))
        }

        copy{
            from("$buildDir/generated/src/main/resources") {
                exclude("**/application.yaml")
            }
            into(resourcesDir)
        }

    }
}


fun relativeSourcePath() = "/src/main/kotlin/${group.toString().replace('.', '/')}"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.3.0")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("jakarta.validation:jakarta.validation-api")
    implementation("jakarta.annotation:jakarta.annotation-api:2.1.0")

    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(module = "mockito-core")
    }
    testImplementation("io.mockk:mockk:1.13.10")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")

}

tasks.withType<Test> {
    useJUnitPlatform()
}
