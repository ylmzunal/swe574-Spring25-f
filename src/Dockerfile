# Use the smallest possible base image
FROM --platform=linux/amd64 eclipse-temurin:17-jre-alpine

# Set the working directory
WORKDIR /app

# Copy the JAR file
COPY target/*.jar app.jar

# Create directory for file uploads
RUN mkdir -p uploads

# Debug log what's in the current directory
RUN ls -la

# Expose port 8080 (Cloud Run standard)
EXPOSE 8080

# Run the application - use PORT environment variable which is set by Cloud Run
CMD exec java -jar app.jar