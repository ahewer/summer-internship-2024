FROM azul/zulu-openjdk:21-jre-headless-latest
LABEL description="Employee Management"

RUN addgroup --system --gid 10001 app && adduser --system --uid 10001 --gid 10001 appuser

COPY app.jar /home/appuser/app.jar
RUN chown -R root:app /etc/ssl/private/ && \
    chmod g+r /etc/ssl/private/ && \
    chown -R appuser:app /home/appuser/app.jar

WORKDIR /home/appuser
# Run as non-root
USER 10001
CMD ["java", "-Djava.awt.headless=true", "-jar", "/home/appuser/app.jar"]
