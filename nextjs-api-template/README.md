# NextJS template for API-First

## Recommended IDE

You may use Visual Studio Code to open the project.

## API configuration

Copy your API specification yaml file to [api/service.yaml](api/service.yaml).
After that, run from the console the following command:

    gradle copyGeneratedApi

This command will invoke the OpenAPI generator to create the needed client code for your NextJS application.
You must repeat this step when you changed the API.

## Environment configuration

Please have a look at [.env.development](.env.development) to configure URL of your Kotlin API.
The default configuration should be sufficient.

## Starting point

Have a look at [app/example/page.tsx](app/example/page.tsx) to see how the API is used.

## Running

Invoke 

    npm run dev

to start a development server.

## Exercise 1

We need to create a data structure that represents an employee in the UI.

Create the file EmployeeModel.ts in [app/example](./app/example).
Add the following code to create the contract model of an employee:

    export interface EmployeeModel {
        name: string;
        firstName: string;
        age: number;
        gender: string;
    }

In TypeScript, each data structure that has these fields counts as an EmployeeModel.

## Exercise 2 

The second task will revolve around generating the client code for the API.
Copy your API specification to [api/service.yaml](api/service.yaml).
Afterwards, run the following Gradle Task:

    gradle copyGeneratedApi

This operation will generate the folder [app/api](./app/api) that contains the code for communicating with the
employee management API.
Go to the file [app/example/page.tsx](./app/example/page.tsx) and replace its content with:

    "use client"

    import {Configuration, EmployeeApi} from "@/app/api";

    const apiConfiguration = new Configuration({
            basePath: process.env.NEXT_PUBLIC_API_URL,
        });

    const api = new EmployeeApi(apiConfiguration);

    export default function EmployeeTable() {

    };

This action prepares us for the next exercise.

## Exercise 3

Let's turn to the UI description. We are going to use the Table component of AntDesign.

Modify the EmployeeTable function in [app/example/page.tsx](./app/example/page.tsx) to return the following:

    return (
        <Flex style={{
            margin: "24px 16px",
            padding: 0,
        }}>
            <Table pagination={{ position: ["bottomCenter"] }} bordered={true}
                   style={{ tableLayout: "auto", width: "100%" }} columns={null}
                   dataSource={null} loading={false} />
        </Flex>

    );

Make sure to add the following imports in line 4:

    import {Flex, Table} from "antd";

Now, run 

    npm run dev

and navigate to [http://localhost:3000](http://localhost:3000)

You should see an empty table.

## Exercise 4

We will now add the columns to the table.
Add the following code before the return statement:

    const columns: TableColumnsType<EmployeeModel> = [
        {
            title: "First Name",
            dataIndex: "firstName",
            key: "firstName",
        },
        {
            title: "Last Name",
            dataIndex: "lastName",
            key: "lastName",
        },
        {
            title: "Age",
            dataIndex: "age",
            key: "age",
        },
        {
            title: "Gender",
            dataIndex: "gender",
            key: "gender",
        },
    ];

Make sure to add the needed imports as well:

    import {Flex, Table, TableColumnsType} from "antd";
    import {EmployeeModel} from "@/app/example/EmployeeModel";

Change the line 

    style={{ tableLayout: "auto", width: "100%" }} columns={null}

into 

    style={{ tableLayout: "auto", width: "100%" }} columns={columns}

You will observe that the table now shows column headers, but is still empty.

## Exercise 5

Next, we will add a data source for the table.
Add the following state in the function:

    const [employeeData, setEmployeeData] = useState<EmployeeModel[]>([]);

Again, make sure to add the necessary imports:

    import {useState} from "react";

Finally, add the data source to the table by replacing the line

    dataSource={null} loading={false} />

with

    dataSource={employeeData} loading={false} />

This causes the table to be re-rendered when the data source has changes.

## Exercise 6

In the final task, we will invoke the service API to retrieve the employee data.
Add the following code before the return statement:

    api.listEmployees().then((result: any) => {
        setEmployeeData(result.data)
    })

Make sure that your service is running.
Then, refresh the page in your browser.

## Bonus Exercise 1

Copy the folder [app/example](./app/example) to [app/sunday](./app/sunday).
Modify for this new page the API call to retrieve the sunday workers instead of all employees.
Add the following menu entry

    {
        key: "/sunday",
        icon: <ClusterOutlined />,
        label: <Link href="/sunday">Sunday</Link>,
    },

to [app/components/sidebar/sidebar.tsx](./app/components/sidebar/sidebar.tsx)

## Bonus Exercise 2

Also add the ladies' night table view.

## Bonus Exercise 3

Currently, we have to manually refresh the page to retrieve the latest data from the service.
Add a background process that refreshes the data every 10 seconds.

