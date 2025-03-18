# Simple Dockerfile for Cloud Run
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy the jar file
COPY target/*.jar app.jar

# Create required directories
RUN mkdir -p logs && chmod 777 logs

# Create empty env.properties file (required by @PropertySource annotation)
RUN echo "# Default properties file - will be overridden by environment variables" > /app/env.properties

# Expose the port
EXPOSE 8080

# Simplified startup script
RUN echo '#!/bin/sh\n\
echo "=== DEBUGGING INFORMATION ==="\n\
echo "Java version:"\n\
java -version\n\
echo "Environment variables:"\n\
printenv | grep SPRING\n\
printenv | grep JWT\n\
printenv | grep PORT\n\
echo "Working directory contents:"\n\
ls -la /app\n\
\n\
echo "=== STARTING APPLICATION ==="\n\
echo "Starting Spring Boot with PORT=$PORT"\n\
\n\
exec java \\\n\
    -Dspring.profiles.active=prod \\\n\
    -Dserver.port=$PORT \\\n\
    -Dlogging.level.root=DEBUG \\\n\
    -Dlogging.level.org.springframework=DEBUG \\\n\
    -jar /app/app.jar\n\
' > /app/start.sh && chmod +x /app/start.sh

# Use the startup script
CMD ["/app/start.sh"]