# CSV Import

So far, we only added individual employees.
The client also wants to import employees in bulk.
To this end, the [CSV](https://en.wikipedia.org/wiki/Comma-separated_values) format shall be used.

## Exercise 1

We need to modify our API to accept files as input.
Add the following snippet under paths to your API specification:

    /csv:
      post:
        tags:
          - employee
        summary: This operation will send a file to be imported
        description: Use this operation to upload a file
        operationId: submitFile
        responses:
          '204':
            description: operation succeeded, the import request was submitted
        requestBody:
          content:
            multipart/form-data:
              schema:
                type: object
                required:
                  - file
                properties:
                  file:
                    type: string
                    format: binary
              encoding:
                file:
                  contentType: application/octet-stream
          required: true
          description: Body containing everything related to a file import request.

Run the gradle task copyGeneratedApi to get the new API implementation

# Exercise 2

We now need to read the CSV file and import the employees.
To this end, implement the method employee.service.EmployeesApiServiceImpl#submitFile

Individual tasks:

1. Read the file content
2. Parse the CSV file
3. Add the individual employees

Use the [example file](./employees.csv) as test data.

Hint: You can access the content of the file via 

        file.getContentAsString(Charset.defaultCharset())
