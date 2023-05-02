FROM openjdk:17
EXPOSE 9091
ADD target/devopstask.jar devopstask.jar
ENTRYPOINT ["java","-jar","/devopstask.jar"]