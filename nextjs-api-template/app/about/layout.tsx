"use client"

import { Layout, theme, ConfigProvider } from "antd";
import Sidebar from "@/app/components/sidebar/sidebar";

const {Content} = Layout;
export default function About({ children }: { children: React.ReactNode }) {

  // sets theme based on browser settings or uses "light" as default
  return (
      <Layout hasSider>
        <Sidebar />
        <Layout >
          <Content>
            {children}
          </Content>
        </Layout>
      </Layout>
  );
};
