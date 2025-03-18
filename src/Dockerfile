# Use OpenJDK 17 for amd64
FROM --platform=linux/amd64 eclipse-temurin:17-jdk

# Set the working directory
WORKDIR /app

# Copy the JAR file
COPY target/*.jar app.jar

# Create directory for local file storage if needed
RUN mkdir -p uploads

# Expose port 8080 (Cloud Run standard)
EXPOSE 8080

# Run the application with production profile
CMD ["java", "-jar", "app.jar", "--spring.profiles.active=prod"]