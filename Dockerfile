FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=test_javarush_com_bot
ENV BOT_TOKEN=7666727994:AAFigbx5dTXIwGfOIi6X_TDQoeTnC03hDJg
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/app.jar"]