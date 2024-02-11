FROM openjdk:17-jdk
ADD target/sprintbootimage_1.jar sprintbootimage_1.jar
EXPOSE 8080
CMD ["java","-jar","/sprintbootimage_1.jar"]