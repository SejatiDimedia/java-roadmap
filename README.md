# Java & Spring Boot Backend Roadmap 🚀

Repositori ini adalah jurnal belajar, dokumentasi latihan, dan kumpulan proyek portofolio perjalanan belajar **Java Backend & Spring Boot**.

Berpedoman pada metodologi pembelajaran aktif dengan AI:
- **70% Waktu**: Eksplorasi mandiri, mengetik kode dari nol, dan menghadapi kendala (*productive struggle*).
- **30% Waktu**: Interaksi dengan AI sebagai mentor, reviewer kode, dan partner diskusi arsitektur.
- **Prinsip Utama**: Tidak meng-commit kode yang belum dipahami secara tuntas.

---

## 🗺️ Roadmap & Progress Tracker

| Tahap | Topik Utama | Target Waktu | Status |
| :---: | :--- | :---: | :---: |
| **01** | **Dasar Java**: Sintaks, Tipe Data, Memory Model (Stack/Heap), String Pool, Array, Method | 4-6 Minggu | 🟢 Completed |
| **02** | **OOP**: Class & Object, Encapsulation, Record, Inheritance, Polymorphism, Interface & Loose Coupling | 3-4 Minggu | 🟢 Completed |
| **03** | **Java Lanjutan**: Collections (List/Set/Map), Exception Handling, Lambda & Stream API, Generics | 4 Minggu | 🟢 Completed |
| **04** | **Pendukung Backend**: Git Workflow, Maven (`pom.xml`), RDBMS & SQL (`JOIN`, PK/FK), Konsep JDBC | 3-4 Minggu | 🟢 Completed |
| **05** | **Spring Boot Inti**: Inversion of Control (IoC), Dependency Injection (DI), REST Controller, Service Layer | 6-8 Minggu | 🟡 In Progress |
| **06** | **Security & Testing**: Spring Security + JWT, Unit & Integration Testing (JUnit 5, Mockito) | 4-5 Minggu | ⚪ Not Started |
| **07** | **Production Ready**: Containerization (Docker), Caching (Redis), Message Broker, CI/CD | Bertahap | ⚪ Not Started |

---

## 📂 Struktur Repositori & Log Belajar

```text
.
├── 01-dasar-java/                  # Latihan sintaks, memory model, exception, & stream API
│   ├── VerifikasiPassword.java        # Sesi 1: Perbandingan memori (== vs .equals()) & String Pool
│   ├── ManajemenDataSiswa.java        # Sesi 2: Implementasi List, Set (anti-duplikat), & Map
│   ├── BankTransfer.java              # Sesi 3: Defensive validation & custom exception throwing
│   └── FilterTransaksi.java           # Sesi 4: Record, Stream API (filter, map, mapToDouble, sum)
├── 02-oop/                         # Implementasi OOP & Arsitektur Service
│   ├── ManajemenBukuApp.java          # Sesi 5: Mini Project integrasi OOP + Collections + Stream
│   └── NotificationApp.java           # Sesi 6: Loose Coupling & Polimorfisme via Interface
├── 03-java-lanjutan/               # Collections lanjutan, Generics, build tools (Maven/Gradle)
├── 04-backend-prerequisites/       # Latihan query SQL, JDBC, simulasi REST client
│   ├── SqlSchemaPractice.sql          # Sesi 8: Relasi tabel PK/FK, INSERT, & INNER JOIN
│   └── JdbcConceptDemo.java           # Sesi 8: Alur pipa JDBC & mapping ResultSet ke Java Record
├── 05-spring-boot-core/            # Project dasar REST API dengan Spring Boot & JPA
│   ├── IocSimulationDemo.java         # Sesi 9: Simulasi Inversion of Control & Constructor DI
│   └── belajar-spring/                # Sesi 10: Live Spring Boot 3.x Project (REST API)
│       ├── pom.xml                        # Maven configuration & starter-web
│       └── src/main/java/com/sejatidimedia/belajar_spring/
│           ├── BelajarSpringApplication.java  # Main entry point & embedded Tomcat runner
│           ├── HelloController.java           # @RestController & JSON response mappings
│           └── ProfilService.java             # @Service layer with business logic & DI
├── 06-security-testing/            # Implementasi JWT auth & automated testing
├── 07-cloud-microservices/         # Konfigurasi Docker, Redis, CI/CD pipelines
├── doc_belajar_java.md             # Kumpulan prompt mentor AI & pedoman belajar
└── README.md
```

---

## 🛠️ Tech Stack & Tools

- **Language:** Java 17 / 21 (LTS)
- **Framework:** Spring Boot 3.x
- **Build Tool:** Maven / Gradle
- **Database:** PostgreSQL / MySQL
- **Version Control:** Git & GitHub (Conventional Commits)
- **Docs & Testing:** Swagger/OpenAPI, JUnit 5, Mockito

---

## 📝 Catatan Komitmen

1. Menulis kode sendiri (*no blind copy-pasting*).
2. Menggunakan pesan commit yang deskriptif dan konsisten mengikuti [Conventional Commits](https://www.conventionalcommits.org/).
3. Melakukan review berkala terhadap konsep-konsep yang masih lemah (*spaced repetition*).
