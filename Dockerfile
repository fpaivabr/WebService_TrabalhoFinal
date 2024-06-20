# Use a imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie o arquivo pom.xml e outros arquivos de configuração necessários
COPY pom.xml .

# Baixe as dependências necessárias
RUN ./mvnw dependency:go-offline -B

# Copie o restante do código da aplicação
COPY src ./src

# Compila o projeto
RUN ./mvnw package -DskipTests

# Expõe a porta que a aplicação Spring Boot irá rodar
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "target/DevMobile_TrabalhoFinal-0.0.1-SNAPSHOT.jar"]
