# Use a single-stage build adapted for your context structure
FROM --platform=linux/amd64 eclipse-temurin:17-jdk

# Set the working directory
WORKDIR /app

# Copy the JAR file (your workflow builds this with 'mvn clean package' before docker build)
COPY target/*.jar app.jar

# Create directory for file uploads
RUN mkdir -p uploads

# Set environment variables for Spring Boot
ENV SPRING_PROFILES_ACTIVE=prod

# Optimize JVM startup for containers
ENV JAVA_TOOL_OPTIONS="-XX:InitialRAMPercentage=70 -XX:MaxRAMPercentage=70 -XX:+UseContainerSupport -XX:+TieredCompilation -XX:TieredStopAtLevel=1 -Djava.security.egd=file:/dev/./urandom"

# Expose port 8080 (Cloud Run standard)
EXPOSE 8080

# Run the application - use PORT environment variable which is set by Cloud Run
CMD ["sh", "-c", "java -Dserver.port=${PORT} -Dspring.profiles.active=${SPRING_PROFILES_ACTIVE} -jar app.jar"]