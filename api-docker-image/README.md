# Docker Image for API

## Introduction

We want to create a Docker image for the employee management service.

## Needed Modifications

Copy the [Dockerfile](./Dockerfile) to your project.

Modify the build.gradle.kts file by adding the following lines:


    tasks.register("buildImage") {
        dependsOn("copyGeneratedApi")
        dependsOn(tasks.bootJar)

        doLast {
            val jarFile = file("$buildDir/libs/${project.name}-$version.jar")
            val dockerFile = layout.projectDirectory.file("Dockerfile").asFile

            val dockerDir = file("$buildDir/docker")
            dockerDir.delete()
            dockerDir.mkdirs()
            val targetJar = file("$dockerDir/app.jar")
            val targetDockerfile = file("$dockerDir/Dockerfile")

            jarFile.copyTo(targetJar, overwrite = true)
            dockerFile.copyTo(targetDockerfile, overwrite = true)
            println("docker build --tag employee-api:latest .")

            exec {
                commandLine("docker build --tag employee-api:latest .".split(" "))
                workingDir(dockerDir)
            }
        }
    }
