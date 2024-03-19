# Use a base image with JDK 8 and Maven installed
FROM maven:3.8.4-openjdk-8 AS build

# Set the working directory in the container
WORKDIR /app

RUN apt-get update && \
    apt-get install -y wget && \
    wget -O /tmp/mysql.deb https://dev.mysql.com/get/mysql-apt-config_0.8.18-1_all.deb && \
    echo "mysql-apt-config mysql-apt-config/select-server select mysql-8.0" | debconf-set-selections && \
    DEBIAN_FRONTEND=noninteractive dpkg -i /tmp/mysql.deb && \
    apt-get update && \
    apt-get install -y mysql-server mysql-client

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

# Copy MySQL configuration file
COPY medwaypath-dal/src/main/resources/application-dev.properties application.properties

# Expose the port your app runs on and sql
EXPOSE 8080 3306

# Command to run the application
CMD ["sh", "-c", "mysqld_safe & java -jar app.jar"]
