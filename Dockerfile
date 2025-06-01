FROM maven:3.8.7-openjdk-11 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests


FROM openjdk:11
WORKDIR /app
COPY --from=build /app/target/labfaker.jar labfaker.jar
EXPOSE 8080
LABEL authors="xaraxx"
CMD ["java", "-jar", "labfaker.jar"]