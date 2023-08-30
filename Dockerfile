FROM openjdk:11
EXPOSE:8082
ADD target/Jenkins-automation.jar Jenkins-automation.jar
ENTRYPOINT ["java","-jar","/Jenkins-automation.jar"]