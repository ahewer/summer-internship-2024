/** @type {import('next').NextConfig} */

const nextConfig = {
    output: "standalone",
    basePath: process.env.NEXT_PUBLIC_BASE_PATH,
    async redirects() {
        return [
            {
                source: "/",
                destination: "/example",
                permanent: true
            }
        ];
    },
};

export default nextConfig;
