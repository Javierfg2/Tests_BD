# Utiliza una imagen base de OpenJDK
FROM openjdk:19

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR en el directorio de trabajo del contenedor
COPY HazelcastServerBien.jar /app/HazelcastServerBien.jar

# Expone el puerto en el que tu aplicación escucha (ajústalo según sea necesario)
EXPOSE 5701

# Define el comando para ejecutar tu aplicación
ENTRYPOINT ["java", "-jar", "HazelcastServerBien.jar"]
