# Database Integration

## Introduction

Our previous API implementation only used an in-memory database for storing and querying employee data.
In the current project, we will integrate the postgres database into our API.

## Docker-Compose

Use the [docker-compose.yaml](./docker-compose.yaml) file to start the database:

    docker-compose up

## Exercise 1

- Modify your build.gradle.kts to contain the needed dependencies for the postgres database
- Adapt application.yaml to establish a database connection from within your application
- Make sure that the database schema is never dropped, but updated on each launch of your application

## Exercise 2

- Create an entity that represents an employee, make sure to also introduce a technical database ID
- Create a simple repository for managing the employees

## Exercise 3

- Swap out the employee map with the employee repository
- Adjust the remaining logic of your application to use the repository instead
