FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy the JAR file
COPY target/*.jar app.jar

# Expose the port
EXPOSE 8080

# Set the port as an environment variable
ENV PORT=8080

# Run the application
CMD ["java", "-Dserver.port=${PORT}", "-jar", "/app/app.jar"] 