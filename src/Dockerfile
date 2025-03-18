# Use a single-stage build adapted for your context structure
FROM --platform=linux/amd64 eclipse-temurin:17-jdk

# Set the working directory
WORKDIR /app

# Copy the JAR file (your workflow builds this with 'mvn clean package' before docker build)
COPY target/*.jar app.jar

# Create directory for file uploads
RUN mkdir -p uploads

# Set environment variables
ENV PORT=8080
ENV SPRING_PROFILES_ACTIVE=prod
ENV JAVA_TOOL_OPTIONS="-XX:+TieredCompilation -XX:TieredStopAtLevel=1"

# Expose port 8080 (Cloud Run standard)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-Dserver.port=${PORT}", "-jar", "app.jar"]