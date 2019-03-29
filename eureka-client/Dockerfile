FROM frolvlad/alpine-oraclejre8:slim
VOLUME /tmp
ADD ./target/eureka-client-0.0.1-SNAPSHOT.jar app.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8763