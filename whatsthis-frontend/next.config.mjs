/** @type {import('next').NextConfig} */
const nextConfig = {
    eslint: {
        ignoreDuringBuilds: true,
    },
    output: 'standalone',
    env: {
        NEXT_PUBLIC_API_URL: process.env.NEXT_PUBLIC_API_URL
    },
    async rewrites() {
        return [
            {
                source: '/api/:path*',
                destination: 'http://${VM_IP}:8080/api/:path*',
            },
        ];
    }
};

export default nextConfig;
