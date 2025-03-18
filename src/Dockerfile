# Use a full JDK image for better compatibility
FROM --platform=linux/amd64 eclipse-temurin:17-jdk

# Set the working directory
WORKDIR /app

# Copy the JAR file
COPY target/*.jar app.jar

# Create directory for file uploads
RUN mkdir -p uploads

# Debug log files
RUN ls -la /app

# Expose port 8080 (Cloud Run standard)
EXPOSE 8080

# Create a startup script
RUN echo '#!/bin/sh' > /app/start.sh && \
    echo 'echo "Starting Spring Boot application on port $PORT"' >> /app/start.sh && \
    echo 'echo "Java version: $(java -version)"' >> /app/start.sh && \
    echo 'echo "Using the following JVM options: -Dserver.port=$PORT -Dspring.profiles.active=prod"' >> /app/start.sh && \
    echo 'java -Dserver.port=$PORT -Dspring.profiles.active=prod -jar app.jar' >> /app/start.sh && \
    chmod +x /app/start.sh

# Run the application with explicit server port
CMD ["sh", "-c", "/app/start.sh"]