/** @type {import('next').NextConfig} */
const nextConfig = {
    eslint: {
        ignoreDuringBuilds: true,
    },
    output: 'standalone',
    env: {
        NEXT_PUBLIC_API_URL: 'https://backend-260519333154.us-central1.run.app'
    },
    async rewrites() {
        return [
            {
                source: '/api/:path*',
                destination: 'https://backend-260519333154.us-central1.run.app/api/:path*',
            },
        ];
    }
};

export default nextConfig;
