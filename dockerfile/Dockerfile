FROM java:8
VOLUME /tmp
ENV pipeline_ws /var/lib/jenkins/workspace/SamplePipeline
ADD $pipeline_ws/target/SampleApp-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]
EXPOSE 8080 
 