# ==========================================
# STAGE 1: BUILD APLIKASI MENJADI .JAR
# ==========================================
FROM eclipse-temurin:17-jdk AS builder
WORKDIR /app

# Salin script Maven Wrapper dan pom.xml terlebih dahulu (memanfaatkan cache layer)
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw

# Download dependensi
RUN ./mvnw dependency:go-offline

# Salin seluruh source code dan kompilasi menjadi file .jar
COPY src ./src
RUN ./mvnw clean package -DskipTests

# ==========================================
# STAGE 2: RUNTIME RINGAN UNTUK PRODUKSI
# ==========================================
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Salin file .jar hasil kompilasi dari Stage 1
COPY --from=builder /app/target/*.jar app.jar

# Buka port 8080
EXPOSE 8080

# Jalankan aplikasi Spring Boot!
ENTRYPOINT ["java", "-jar", "app.jar"]