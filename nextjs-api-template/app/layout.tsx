import { Inter } from "next/font/google";
import "@/app/components/globals.css";
import { Metadata } from "next";
import { AntdRegistry } from '@ant-design/nextjs-registry';
import React from "react";

const inter = Inter({ subsets: ['latin'] })

export const metadata: Metadata = {
  title: "Example Service",
  description: "Example template for API-First",
}

export default function RootLayout({ children }: { children: React.ReactNode }) {
  return (
    <html lang="en">
      <body className={`${inter.className} antialiased`}>
        <AntdRegistry>{children}</AntdRegistry>
      </body>
    </html>
  )
}
