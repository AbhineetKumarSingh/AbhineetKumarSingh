FROM openjdk:17

COPY target/WelcomeApi_Docker.jar /usr/app/

WORKDIR /usr/app/

EXPOSE 8082

ENTRYPOINT [ "java","-jar","WelcomeApi_Docker.jar"]