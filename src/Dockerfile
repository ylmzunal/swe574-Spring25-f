# Simple Dockerfile for Cloud Run
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy the JAR file
COPY target/*.jar app.jar

# Set environment variables
ENV PORT=8080
ENV SPRING_PROFILES_ACTIVE=prod

# Expose the port
EXPOSE 8080

# Run the application directly
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", \
     "-Dserver.port=${PORT:8080}", \
     "-Dserver.address=0.0.0.0", \
     "-Dspring.profiles.active=prod", \
     "-Dspring.main.web-application-type=servlet", \
     "-Dspring.main.allow-bean-definition-overriding=true", \
     "-Dspring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration,org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration,org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration", \
     "-jar", "/app/app.jar"]