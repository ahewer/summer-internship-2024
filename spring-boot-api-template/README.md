# Summer Internship API template

## Introduction

In the previous projects, we always used tests to run our implemented logic.

This time, however, we want to integrate logic into a web service that exposes a RESTful API.
To this end, we use an API-First approach.

## How to use this template

### Creating the API specification

Modify [api/service.yaml](api/service.yaml) to represent your wanted API.
If you are new to OpenAPI, please have a look at [https://support.smartbear.com/swaggerhub/docs/en/get-started/openapi-3-0-tutorial.html](https://support.smartbear.com/swaggerhub/docs/en/get-started/openapi-3-0-tutorial.html)

### Generating the API code

Run the gradle task **copyGeneratedApi** to add the API to your project code.
Implement the generated interfaces.
Have a look at [./src/main/kotlin/example/api/ExampleApiService.kt](./src/main/kotlin/example/api/ExampleApiService.kt)
and [src/main/kotlin/example/service/ExampleApiServiceImpl.kt](src/main/kotlin/example/service/ExampleApiServiceImpl.kt)
for an example.

### Starting the application

Use the gradle task **bootRun** to launch the application.
It can then be accessed via [http://localhost:8000](http://localhost:8000)
