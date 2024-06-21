# NextJS template for API-First

## API configuration

Copy your API specification yaml file to [api/service.yaml](api/service.yaml).
After that, run from the console the following command:

    gradle copyGeneratedApi

This command will invoke the OpenAPI generator to create the needed client code for your NextJS application.
You must repeat this step when you changed the API.

## Environment configuration

Please have a look at [.env.development](.env.development) to configure URL of your Kotlin API.
The default configuration should be sufficient if you did not modify the [API backend](../spring-boot-api-template)

## Starting point

Have a look at [app/example/page.tsx](app/example/page.tsx) to see how the API is used.

## Running

Invoke 

    npm run dev

to start a development server.
