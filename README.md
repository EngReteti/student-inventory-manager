# Student & Inventory Management System 🚀

An enterprise-grade Java backend solution engineered for high data integrity, secure administrative authentication, and persistent record management.

## 🏗 Technical Architecture
I implemented a **Layered (n-tier) Architecture** to ensure a professional separation of concerns:
* **Presentation Layer**: A color-coded, interactive CLI providing an intuitive administrative user experience.
* **Service Layer**: Manages business logic, including complex academic data and cryptographic security protocols.
* **Data Access Layer (DAO)**: Optimized **MariaDB** integration for permanent, reliable storage using structured SQL queries.

## 🌟 Key Features & Growth
* **Cryptographic Security**: Integrated SHA-256 hashing to ensure user credentials are never stored in plain text.
* **Data Persistence**: Transitioned from volatile memory-based storage to a robust MariaDB infrastructure.
* **Professional Sanitization**: Custom logic to handle input buffering and encoding mismatches, ensuring 100% data integrity.

## 📈 My Development Journey
1. **Phase 1: Foundations**: Designed initial Java models using strict **Encapsulation**.
2. **Phase 2: Database Migration**: Engineered the move to permanent **MariaDB** storage.
3. **Phase 3: Connection Efficiency**: Implemented **HikariCP** for high-performance pooling.
4. **Phase 4: Security Hardening**: Added cryptographic protection for sensitive credentials.
5. **Phase 5: Visual Verification**: Completed a 7-point visual suite for system reporting.

## 🚀 How to Run (Step-by-Step)
### 1. Clone the Repository
```bash
git clone https://github.com/EngReteti/student-inventory-manager.git
cd student-inventory-manager
```
### 2. Prerequisites
Ensure MariaDB is running and `mariadb-java-client-3.1.2.jar` is present.
### 3. Clean and Build
```bash
rm -rf bin && mkdir bin
javac -d bin student-manager/src/main/java/com/school/*.java student-manager/src/main/java/com/school/**/*.java
```
### 4. Launch the System
```bash
java -cp "bin:mariadb-java-client-3.1.2.jar" com.school.Main
```
### 5. Administrative Access
* **Username**: admin
* **Password**: university2026

## 📷 System Gallery (Proof of Work)

| ID | Verification Stage | Visual Proof (Click to enlarge) |
| :--- | :--- | :--- |
| **1** | **Database Persistence** | ![DB](assets/persistence.jpg) |
| **2** | **Security Gate (SHA-256)** | ![Security](assets/login.jpg) |
| **3** | **Main Menu Interface** | ![Menu](assets/menu.jpg) |
| **4** | **System Report Engine** | ![Report](assets/report.jpg) |
| **5** | **Data Search Logic** | ![Search](assets/search.jpg) |
| **6** | **Synchronization Flow** | ![Sync](assets/sync.jpg) |
| **7** | **Session Termination** | ![Exit](assets/exit.jpg) |

> **Note:** All visuals verified and finalized on February 13, 2026.

## ✅ Project Status: MISSION ACCOMPLISHED
