# Simple Dockerfile for Cloud Run
FROM --platform=linux/amd64 eclipse-temurin:17-jdk

WORKDIR /app

# Copy the jar file
COPY target/*.jar app.jar

# Create logging directory
RUN mkdir -p logs && chmod 777 logs

# For debugging
RUN echo "Contents of /app:" && ls -la /app

# Expose the port
EXPOSE 8080

# Create a startup script
RUN echo '#!/bin/sh\n\
echo "Starting Spring Boot application..."\n\
echo "Java version:"\n\
java -version\n\
echo "Current directory:"\n\
pwd\n\
echo "Directory contents:"\n\
ls -la\n\
echo "Starting application with port: $PORT"\n\
exec java -jar /app/app.jar --server.port=$PORT\n\
' > /app/start.sh && chmod +x /app/start.sh

# Use the startup script
CMD ["/app/start.sh"]