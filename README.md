# 🎓 Student & Inventory Management System

## 🎯 Project Impact & Objective
This project is an enterprise-focused backend solution designed to streamline academic record-keeping. The core mission was to solve **data volatility** by migrating from temporary in-memory storage to a persistent **MariaDB** infrastructure. This ensures that administrative data is not only saved indefinitely but is also protected by a secure authentication layer.



## 💡 Key Technical Solutions
* **Database Persistence**: Optimized MariaDB integration to handle permanent storage of academic and inventory records.
* **Cryptographic Security**: Implemented a secure login system to prevent unauthorized administrative access.
* **Data Integrity**: Built custom validation logic to ensure high-quality, sanitized input for all records.

## 🛠 Tech Stack & Engineering Tools
* **Language**: Java (JDK 17+)
* **Database**: MariaDB
* **Architecture**: Layered (N-Tier) Design
* **Version Control**: Git & GitHub

## 🚀 How to Run (Direct Deployment)

### 1. Get the Code
```bash
git clone https://github.com/EngReteti/student-inventory-manager.git
cd student-inventory-manager
```

### 2. Environment Setup
Ensure MariaDB is running on your system and the `mariadb-java-client-3.1.2.jar` is present in the project directory.

### 3. Build & Execute
```bash
# Compile all source files
javac -d bin student-manager/src/main/java/com/school/*.java student-manager/src/main/java/com/school/**/*.java

# Launch the administrative portal
java -cp "bin:mariadb-java-client-3.1.2.jar" com.school.Main
```

### 4. Admin Access
* **Username**: admin
* **Password**: university2026

## 📷 System Gallery (Visual Proof of Work)

| Unit | System Component | Visual Verification |
| :--- | :--- | :--- |
| **01** | **Persistence Layer** | ![DB](assets/persistence.jpg) |
| **02** | **Secure Auth Gate** | ![Login](assets/login.jpg) |
| **03** | **Command Interface** | ![Menu](assets/menu.jpg) |
| **04** | **Master Reporting** | ![Report](assets/report.jpg) |
| **05** | **Dynamic Search** | ![Search](assets/search.jpg) |
| **06** | **Database Sync** | ![Sync](assets/sync.jpg) |
| **07** | **System Exit** | ![Exit](assets/exit.jpg) |



## ⚠️ Challenges & Technical Solutions
* **Challenge: Unstable Data States**
    * *Solution*: Engineered a JDBC bridge to MariaDB, ensuring data persistence across system reboots.
* **Challenge: Security Vulnerabilities**
    * *Solution*: Added an authentication interceptor to safeguard administrative functions from unauthorized users.
