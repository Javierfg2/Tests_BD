# Utiliza una imagen base de OpenJDK
FROM openjdk:19

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR en el directorio de trabajo del contenedor
COPY Spark_client.jar /app/Spark_client.jar

# Expone el puerto en el que tu aplicación escucha (ajústalo según sea necesario)
EXPOSE 4567

# Define el comando para ejecutar tu aplicación
ENTRYPOINT ["java", "-jar", "Spark_client.jar"]
