# Use a base image with JDK 8 and Maven installed
FROM maven:3.8.4-openjdk-8 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the rest of the application
COPY . .

# Build the application
RUN mvn -B clean install

# Use a lightweight base image with JRE 8
FROM openjdk:8-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the compiled app from the build stage
COPY --from=build /app/medwaypath-specifications/target/*.jar app.jar

# Install MySQL
RUN apk add --no-cache mysql mysql-client

# Copy MySQL configuration file
COPY medwaypath-dal/src/main/resources/application-dev.properties application.properties

# Copy the MySQL initialization script
COPY init.sql /docker-entrypoint-initdb.d/

# Expose the port your app runs on and sql
EXPOSE 8080 3306

# Command to run the application
CMD ["sh", "-c", "mysqld_safe & java -jar app.jar"]
