# Student & Inventory Management System 🚀

A high-performance Java backend engineered for absolute data integrity and professional security standards. This project demonstrates the evolution of a real-world system from basic logic to a robust, MariaDB-persistent infrastructure.

## 🏗️ Technical Architecture
The system utilizes a strictly decoupled **Layered Architecture** to ensure maintainability:
* **Presentation Layer**: Color-coded, interactive CLI for intuitive user navigation.
* **Service Layer**: Handles complex business logic, including academic grade averaging and SHA-256 security hashing.
* **Data Access Layer (DAO)**: Powered by **MariaDB** for permanent, secure storage with optimized SQL queries.

## 🌟 Professional Features
* **Advanced Security**: Implements cryptographic SHA-256 hashing to ensure user credentials are never stored in plain text.
* **Data Integrity**: Built-in sanitization logic to handle input buffering and prevent encoding mismatches.
* **Automated Reporting**: Real-time generation of student performance metrics and academic averages.

## 📈 Iterative Growth & Milestones
I built this system through a disciplined, step-by-step development lifecycle:
- [x] **Initial Logic**: Established core Student objects and encapsulation.
- [x] **Database Integration**: Migrated from temporary memory to persistent **MariaDB** storage.
- [x] **Performance Optimization**: Implemented **HikariCP** for efficient database connection pooling.
- [x] **Security Hardening**: Integrated SHA-256 hashing and Environment Variable protection for credentials.
- [x] **Full System Gallery**: Documented proof-of-work through a comprehensive visual verification suite.

## 📸 System Gallery (Proof of Work)

| Feature | Visual Preview |
| :--- | :--- |
| **Teacher Authentication** | ![Login](assets/login.jpg) |
| **Smart Navigation Menu** | ![Menu](assets/menu.jpg) |
| **Academic Analytics** | ![Reporting](assets/report.jpg) |
| **Dynamic Record Search** | ![Search](assets/search.jpg) |
| **Database Persistence** | ![Persistence](assets/persistence.jpg) |
| **Cloud Synchronization** | ![Sync](assets/sync.jpg) |
| **Graceful Shutdown** | ![Exit](assets/exit.jpg) |

## 📖 Deployment Instructions
1. Ensure a **MariaDB** instance is active with the `school` database schema.
2. Navigate to: `cd student-manager`
3. Execute the build: `mvn clean compile exec:java`

