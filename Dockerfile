FROM openjdk:8
EXPOSE 8080
ADD target/springboot-docker-sample.jar springboot-docker-sample.jar
ENTRYPOINT ["java","-jar","/springboot-docker-sample.jar"]