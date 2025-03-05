
FROM maven:latest
WORKDIR /app
COPY pom.xml /app
COPY . /app
RUN mvn clean package
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]