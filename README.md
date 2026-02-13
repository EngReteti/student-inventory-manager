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

## 📷 System Gallery (Proof of Work)

| ID | Verification Stage | Visual Proof (Click to enlarge) |
| :--- | :--- | :--- |
| **1** | **Database Persistence** | <img src="1000290051.jpg" width="300"> |
| **2** | **Security Gate (SHA-256)** | <img src="1000290055.jpg" width="300"> |
| **3** | **System Report Engine** | <img src="1000290056.jpg" width="300"> |
| **4** | **Data Integrity Check** | <img src="1000290057.jpg" width="300"> |
| **5** | **n-Tier Architecture** | <img src="1000288995.jpg" width="300"> |
| **6** | **Persistence Validation** | <img src="1000290051.jpg" width="300"> |
| **7** | **Final Verified Report** | <img src="IMG_20260213_040900.jpg" width="500"> |

> **Note:** All visuals verified and finalized on February 13, 2026.

## ✅ Project Status: MISSION ACCOMPLISHED
