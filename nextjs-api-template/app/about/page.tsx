"use client"

import {Tabs, theme, Typography} from "antd";


const { Title } = Typography;

export default function About() {

    const {
        token: { colorBgContainer, borderRadiusLG },
    } = theme.useToken();

    return (
        <Typography style={{
            margin: "24px 16px",
            padding: "10px",
            background: colorBgContainer,
            borderRadius: borderRadiusLG,
        }}>
            <Title>Welcome to the API Template React App</Title>

            <div style={{textAlign: "center"}}>
            <Tabs
                centered={true}
                defaultActiveKey="1"
                items={[
                    {
                        label: 'Tab 1',
                        key: '1',
                        children: <div>Tab 1</div>
                    },
                    {
                        label: 'Tab 2',
                        key: '2',
                        children: <div>Tab 2</div>
,
                    },
                ]}
            />
            </div>

        </Typography>
    );
};
