FROM openjdk:11
EXPOSE 8080
ADD labfaker-0.0.1-SNAPSHOT.jar labfaker-0.0.1-SNAPSHOT.jar
LABEL authors="xaraxx"

ENTRYPOINT ["java", "-jar", "labfaker-0.0.1-SNAPSHOT.jar"]