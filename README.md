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

### 1️⃣ Database Persistence Logic
![Database Proof](1000290051.jpg)
*Visualizing the MariaDB connection and architectural flow.*

### 2️⃣ Cryptographic Security Gate
![Security Proof](1000290055.jpg)
*Verification of the SHA-256 administrative authentication.*

### 3️⃣ System Report Generation
![Report Proof](1000290056.jpg)
*Verification of the internal data reporting engine.*

### 4️⃣ Data Integrity Verification
![Integrity Proof](1000290057.jpg)
*Validating the sanitization of academic records.*

### 5️⃣ N-Tier Architecture Flow
![Architecture Proof](1000288995.jpg)
*Evidence of decoupled logic across Presentation and Service layers.*

### 6️⃣ Persistence Layer Validation
![Persistence Proof](1000290051.jpg)
*Verified data retention after system restart.*

### 7️⃣ Final System Visual Verification (Verified)
![Final Proof](IMG_20260213_040900.jpg)
*7-point verified enrollment report as of February 13, 2026.*

## ✅ Project Status: MISSION ACCOMPLISHED
