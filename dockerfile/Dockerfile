FROM java:8
VOLUME /tmp
WORKDIR /var/lib/jenkins/workspace/SamplePipeline
ADD target/SampleApp-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]
EXPOSE 8080 
 