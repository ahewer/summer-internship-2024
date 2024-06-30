# Summer Internship Employee Management API

## Introduction

We will now implement an API for an employee management software.
We will use the **Employee Report** Kata as a starting point.

## Project details

### API specification

The file [api/service.yaml](api/service.yaml) contains the API.
If you are new to OpenAPI, please have a look at [https://support.smartbear.com/swaggerhub/docs/en/get-started/openapi-3-0-tutorial.html](https://support.smartbear.com/swaggerhub/docs/en/get-started/openapi-3-0-tutorial.html)

### Generating the API code

Run the gradle task **copyGeneratedApi** to add the API to your project code.
Implement the generated interfaces.

You can have a look at [./src/main/kotlin/employee/service/EmployeesApiServiceImpl.kt](./src/main/kotlin/employee/service/EmployeesApiServiceImpl.kt)
for a starting point.

### Starting the application

Use the gradle task **bootRun** to launch the application.
It can then be accessed via [http://localhost:8000](http://localhost:8000)

## Exercise 1
The client needs functionality for adding and listing employees.
Data for an employee should consist of 

- First name
- Last name
- Age
- Gender

This data has already been created in the initial API specification.

Implement the missing logic in [./src/main/kotlin/employee/service/EmployeesApiServiceImpl.kt](./src/main/kotlin/employee/service/EmployeesApiServiceImpl.kt)
You can use the existing in-memory database.

## Exercise 2
The client wants to retrieve the employee data in ascending order with respect to age.
Please modify the **listEmployees** method to implement that wanted functionality.

## Exercise 3
The client wants to avoid adding employees that have already been saved to the database.
To this end, we assume that the combination of first name and last name is always unique to identify an employee.

Please modify the **addEmployee** method to throw an EmployeeAlreadyExists exception if the employee was already added.
The exception is already present in the project.

## Exercise 4
The client wants a new API operation **listSundayWorkers** that should retrieve all employees that are 18 years or older.
With this data, the client can plan sunday shifts.

### Part A
We have to modify the API specification to contain a new response model.
Open [api/service.yaml](api/service.yaml) and scroll down to **components/schemas**.
Add a new response model:

    ListSundayWorkersResponseModel:
      title: Response model for retrieve sunday workers operation
      type: array
      items:
        $ref: '#/components/schemas/Employee'

This response will be used to return the data.

### Part B
After having a response model available, we can proceed by adding the new operation.
In [api/service.yaml](api/service.yaml), scroll to **paths**.
Add the following operation:

    /sunday/workers:
     get:
       tags:
         - employee
       summary: Lists all sunday workers
       description: Use this operation receive all registered employees that are allowed to work on sunday.
       operationId: listSundayWorkers
       responses:
         '200':
           description: Operation succeeded, workers are returned.
           content:
             application/json:
               schema:
                 $ref: '#/components/schemas/ListSundayWorkersResponseModel'

This operation will allow the client to obtain the wanted data.

### Part C
Run the gradle task **copyGeneratedApi** copy the new API to your project code.
Implement the missing logic in [./src/main/kotlin/employee/service/EmployeesApiServiceImpl.kt](./src/main/kotlin/employee/service/EmployeesApiServiceImpl.kt)

## Bonus Exercise 1
The client plans to occasionally host **Ladys' Night Events**.
For such events, the client needs to obtain a list of employees that are female and are 21 or older.

Add the new response mode, the GET operation, and logic implementation to your project.

## Bonus Exercise 2
The client is interested in the statistics of the registered employees.
The following data is needed:

- amount of male workers
- amount of female workers
- workers above 18
- workers below 18
- average age of the work force
 
Add the new response mode, the GET operation, and logic implementation to your project.
