# Simple Dockerfile for Cloud Run
FROM --platform=linux/amd64 eclipse-temurin:17-jdk

WORKDIR /app

# Copy the jar file
COPY target/*.jar app.jar

# Create logging directory to see if this helps
RUN mkdir -p logs
RUN chmod 777 logs

# For debugging
RUN echo "Contents of /app:" && ls -la /app

# Expose the port
EXPOSE 8080

# Simple command that forces the port to 8080 regardless of environment
CMD ["java", "-jar", "/app/app.jar", "--server.port=8080"]