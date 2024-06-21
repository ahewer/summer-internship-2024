"use client"

import { Layout } from "antd";
import Sidebar from "@/app/components/sidebar/sidebar";

const {Content} = Layout;
export default function Dashboard({ children }: { children: React.ReactNode }) {

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
