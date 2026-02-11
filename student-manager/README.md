# Student & Inventory Management System 🚀

A robust, layered Java backend system designed for high data integrity and clean code standards. This project serves as a foundational real-world system for managing student records, featuring permanent database storage and secure teacher authentication.

## 🏗️ System Architecture
The project follows a **Layered Architecture** to ensure a separation of concerns:
* **Model Layer**: Defines data structures using Encapsulation.
* **Service Layer**: Implements business logic and security validation.
* **Data Layer**: Powered by **MariaDB** for reliable, persistent storage.

## 🌟 Key Features
* **Secure Authentication**: Implements SHA-256 password hashing.
* **Data Sanitization**: Built-in logic to handle input buffering and encoding mismatches.
* **Full CRUD**: Manage student inventory, grades, and academic averages through a color-coded CLI.

## 🛡️ Security Implementation
To prevent data breaches, I implemented one-way cryptographic hashing. By using the SHA-256 algorithm, the system ensures that even in the event of a database leak, user passwords remain secure and unreadable.

## 📖 How to Run
1. Ensure MariaDB is running with the `school` database.
2. Navigate to the project folder: `cd student-manager`.
3. Compile & Run: `mvn clean compile exec:java`.

## 📸 System Gallery

| Feature | Preview |
| :--- | :--- |
| **Secure Authentication** | ![Auth](1000287954.jpg) |
| **Academic Reporting** | ![Reporting](1000287954.jpg) |
| **Command Interface** | ![CLI](1000287955.jpg) |
| **Database Search** | ![Search](1000287956.jpg) |
| **Deployment Success** | ![Build](1000287957.jpg) |
| **Data Persistence** | ![Persistence](persistence.jpg) |
| **Cloud Synchronization** | ![Sync](sync.jpg) |

