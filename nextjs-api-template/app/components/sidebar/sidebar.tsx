"use client"

import { usePathname } from 'next/navigation';
import { useState } from "react";
import {
    ClusterOutlined, QuestionCircleFilled
} from "@ant-design/icons";
import { Layout, Menu, Button } from "antd";
import Link from "next/link";

const { Sider } = Layout;

export default function Sidebar() {

    const [collapsed, setCollapsed] = useState(false);
    const pathname = usePathname();

    return (
        <Sider collapsible collapsed={collapsed} onCollapse={(value) => setCollapsed(value)} style={{
            overflow: "auto",
            height: "100vh",
            position: "sticky",
            top: 0,
            left: 0
        }}>
            <div style={{ textAlign: "center" }}>
                <Link href="/example">
                    <Button
                        type="link"
                        style={{
                            margin: "15px 0px 15px 0px",
                            color: "white",
                            fontWeight: "bold",
                            fontSize: "1.5em"
                        }}>
                        {!collapsed ? "Example" : ""}
                    </Button>
                </Link>
            </div>

            <Menu
                theme="dark"
                mode="inline"
                defaultSelectedKeys={["/example"]}
                selectedKeys={[pathname]}
                items={[
                    {
                        key: "/example",
                        icon: <ClusterOutlined />,
                        label: <Link href="/example">Example</Link>,
                    },
                    {
                        key: "/about",
                        icon: <QuestionCircleFilled />,
                        label: <Link href="/about">About</Link>,
                    },
                ]}
            />
        </Sider>
    );
};
