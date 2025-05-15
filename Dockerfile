FROM openjdk:11
EXPOSE 8080
ADD labfaker.jar labfaker.jar
LABEL authors="xaraxx"

ENTRYPOINT ["java", "-jar", "labfaker.jar"]