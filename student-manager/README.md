# Student Management System 🎓
A robust Java-based backend application for managing student records, featuring secure authentication and relational database integration.

## 🚀 Features
* **Secure Authentication**: Implements SHA-256 password hashing to ensure teacher credentials are never stored in plain text.
* **Student Management**: Full CRUD operations for managing student inventories, grades, and averages.
* **Relational Database**: Powered by MariaDB for reliable data storage and retrieval.
* **Interactive CLI**: A user-friendly command-line interface with color-coded feedback.

## 🛡️ Security Implementation
In this project, I moved beyond basic authentication to implement cryptographic security. By hashing passwords with SHA-256, the system protects sensitive teacher data against potential database leaks, adhering to modern backend development best practices.

## 📖 How to Run
1. Ensure MariaDB is running and the \`school\` database is configured.
2. Compile the project: \`mvn clean compile\`
3. Run the application: \`mvn exec:java\`
