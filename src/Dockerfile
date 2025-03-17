# Use OpenJDK 17 as the base image
FROM eclipse-temurin:17-jdk

# Set the working directory
WORKDIR /app

# Copy Maven files to resolve dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the entire project and build it
COPY . .
RUN mvn clean package -DskipTests

# Expose port 8080
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/backend-0.0.1-SNAPSHOT.jar"]