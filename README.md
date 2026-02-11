# Student & Inventory Management System 🚀

An enterprise-grade Java backend solution engineered for high data integrity, secure teacher authentication, and persistent record management. This project represents a complete evolution from basic procedural logic to a fully decoupled, database-driven architecture.

---

## 🏗️ System Architecture
The project is built on a **Layered (n-tier) Architecture** to ensure a strict separation of concerns, facilitating easier maintenance and testing:
* **Presentation Layer**: An interactive, color-coded CLI providing an intuitive user experience.
* **Service Layer**: Encapsulates business logic, including academic calculations and SHA-256 security hashing.
* **Data Access Layer (DAO)**: Robust integration with **MariaDB** for permanent storage, utilizing optimized SQL queries for high performance.

## 🌟 Professional Feature Set
* **Cryptographic Security**: Implementation of SHA-256 hashing ensures that user credentials remain protected with one-way encryption.
* **Data Persistence**: Full integration with MariaDB, moving beyond volatile memory to reliable, structured storage.
* **Input Sanitization**: Advanced logic to handle input buffering and encoding mismatches, preventing data corruption.
* **Real-time Analytics**: Automated calculation of student performance metrics and academic reporting.

## 📈 The Development Journey (Milestones)
This project documents my growth in software engineering through an iterative lifecycle:
- [x] **Phase 1: Foundations**: Designed core Student models using strict **Encapsulation**.
- [x] **Phase 2: Database Migration**: Transitioned from temporary ArrayLists to **MariaDB** persistent storage.
- [x] **Phase 3: Connection Optimization**: Implemented **HikariCP** for efficient database connection pooling.
- [x] **Phase 4: Security Hardening**: Integrated cryptographic hashing and environment variable protection (.env) for sensitive credentials.
- [x] **Phase 5: Visual Documentation**: Finalized a comprehensive 7-point visual verification suite to prove system functionality.

## 📸 System Gallery (Visual Verification)

| Feature | Visual Preview |
| :--- | :--- |
| **Secure Login** | ![Login](assets/login.jpg) |
| **Command Center** | ![Menu](assets/menu.jpg) |
| **Performance Analytics** | ![Reporting](assets/report.jpg) |
| **Search Engine** | ![Search](assets/search.jpg) |
| **Data Persistence** | ![Persistence](assets/persistence.jpg) |
| **GitHub Synchronization** | ![Sync](assets/sync.jpg) |
| **System Exit** | ![Exit](assets/exit.jpg) |

---

## 🛠️ Technology Stack
* **Language**: Java (JDK 8+)
* **Build Tool**: Maven
* **Database**: MariaDB
* **Security**: SHA-256 Hashing
* **Environment Management**: Dotenv for Java

## 📖 How to Run
1. Ensure **MariaDB** is active with a database named `school`.
2. Navigate to the core module: `cd student-manager`
3. Execute the application: `mvn clean compile exec:java`

