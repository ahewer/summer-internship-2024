"use client"

import { Configuration, ExampleApi } from "@/app/api";
import {useState} from "react";
import {Button} from "antd";
import Title from "antd/es/typography/Title";

const apiConfiguration = new Configuration({
    basePath: process.env.NEXT_PUBLIC_API_URL,
});

const api = new ExampleApi(apiConfiguration);

export default function Example() {

    const [message, setMessage] = useState<string>("");

    async function onClick() {
        let result = await api.example()
        setMessage(result.data.message)
    }

    return (
        <div>
            <Button onClick={onClick}>Click me</Button>
            <Title>{message}</Title>
        </div>
    );
};
