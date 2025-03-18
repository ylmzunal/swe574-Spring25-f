# Simple Dockerfile for Cloud Run
FROM --platform=linux/amd64 eclipse-temurin:17-jdk

WORKDIR /app

# Copy the jar file
COPY target/*.jar app.jar

# Extract JAR contents for inspection
RUN mkdir -p extracted && \
    cd extracted && \
    jar -xf ../app.jar && \
    echo "Extracted JAR file structure:" && \
    find . -name "*.class" | grep -i whatsthis

# Create required directories
RUN mkdir -p logs && chmod 777 logs

# Create empty env.properties file (required by @PropertySource annotation)
RUN echo "# Default properties file - will be overridden by environment variables" > /app/env.properties

# For debugging
RUN echo "Contents of /app:" && ls -la /app

# Expose the port
EXPOSE 8080

# Create a startup script with extensive debugging
RUN echo '#!/bin/sh\n\
echo "=== DEBUGGING INFORMATION ==="\n\
echo "Java version:"\n\
java -version\n\
echo "Environment variables:"\n\
env | sort\n\
echo "Working directory:"\n\
pwd && ls -la\n\
echo "Checking class existence:"\n\
find /app/extracted -name "WhatsthisApplication.class"\n\
\n\
echo "=== STARTING APPLICATION ==="\n\
echo "Starting with port: $PORT"\n\
\n\
# Explicitly specify the main class and classpath\n\
exec java -cp /app/app.jar \\\n\
    -Dspring.profiles.active=prod \\\n\
    -Dserver.port=$PORT \\\n\
    -Dlogging.level.root=DEBUG \\\n\
    -Dlogging.level.org.springframework=DEBUG \\\n\
    org.springframework.boot.loader.JarLauncher\n\
' > /app/start.sh && chmod +x /app/start.sh

# Use the startup script
CMD ["/app/start.sh"]