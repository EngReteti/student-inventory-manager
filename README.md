# Student & Inventory Management System 🚀

A robust, layered Java backend system designed for high data integrity and clean code standards. This project serves as a foundational real-world system for managing student records and secure teacher authentication.

## 🏗️ System Architecture
The project follows a **Layered Architecture** to ensure a separation of concerns:
* **Model Layer**: Defines data structures using Encapsulation.
* **Service Layer**: Implements business logic and security validation.
* **Data Layer**: Powered by MariaDB for reliable, persistent storage.

## 🌟 Key Features
* **Secure Authentication**: Implements SHA-256 password hashing to ensure credentials are never stored in plain text.
* **Data Sanitization**: Built-in logic to handle input buffering and encoding mismatches.
* **Full CRUD**: Manage student inventory, grades, and academic averages through a color-coded CLI.

## 🛡️ Security Implementation
To prevent data breaches, I implemented one-way cryptographic hashing. By using the SHA-256 algorithm, the system ensures that even in the event of a database leak, user passwords remain secure and unreadable.

## 📖 How to Run
1. Ensure MariaDB is running with the \`school\` database.
2. Navigate to the project folder: \`cd student-manager\`
3. Compile & Run: \`mvn clean compile exec:java\`
