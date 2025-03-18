# Use a two-stage build to optimize the image size and startup time
FROM --platform=linux/amd64 eclipse-temurin:17-jdk-alpine as build
WORKDIR /workspace/app

# Copy maven executable and pom.xml
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Build dependency layer
RUN ./mvnw dependency:go-offline -B

# Copy the source code
COPY src src

# Build the application
RUN ./mvnw package -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

# Create the actual image
FROM --platform=linux/amd64 eclipse-temurin:17-jre-alpine
VOLUME /tmp
ARG DEPENDENCY=/workspace/app/target/dependency

# Copy the exploded application to the container
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app

# Create directory for file uploads
RUN mkdir -p /app/uploads

# Set environment variables
ENV PORT=8080
ENV SPRING_PROFILES_ACTIVE=prod

# Expose port 8080 (Cloud Run standard)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-cp", "/app:/app/lib/*", "dev.swe573.whatsthis.WhatsthisApplication", "--server.port=${PORT}"]