FROM openjdk:8-jdk-alpine
ADD ./shtp-0.0.1.jar shtp-0.0.1.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","/shtp-0.0.1.jar"]
