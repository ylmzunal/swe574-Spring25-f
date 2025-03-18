# Simple Dockerfile for Cloud Run
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy the JAR file
COPY target/*.jar app.jar

# Create a script to run the application with proper health check and port configuration
RUN echo '#!/bin/sh\n\
echo "Starting application..."\n\
echo "PORT environment variable is set to: $PORT"\n\
echo "Current directory: $(pwd)"\n\
echo "JAR file exists: $(ls -la app.jar)"\n\
echo "Spring profile: prod"\n\
\n\
# Run with explicit config to avoid database connection\n\
java -Djava.security.egd=file:/dev/./urandom \\\n\
     -Dserver.port=${PORT:8080} \\\n\
     -Dserver.address=0.0.0.0 \\\n\
     -Dspring.profiles.active=prod \\\n\
     -Dspring.main.web-application-type=servlet \\\n\
     -Dspring.main.allow-bean-definition-overriding=true \\\n\
     -Dspring.datasource.url="" \\\n\
     -Dspring.datasource.username="" \\\n\
     -Dspring.datasource.password="" \\\n\
     -Dspring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration,org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration,org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration \\\n\
     -jar /app/app.jar\n' > /app/startup.sh && chmod +x /app/startup.sh

# Expose the port
EXPOSE 8080

# Set the port as an environment variable
ENV PORT=8080
ENV SPRING_PROFILES_ACTIVE=prod

# Run the application with the startup script
CMD ["/app/startup.sh"]