FROM openjdk:11
EXPOSE:8082
ADD target/jenkins-automation.jar jenkins-automation.jar
ENTRYPOINT ["java","-jar","/jenkins-automation.jar"]