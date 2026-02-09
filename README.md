# Student & Inventory Management System 🚀

A robust, layered Java backend system designed for high data integrity and clean code standards. This project serves as a foundational real-world system for managing student records and warehouse inventory.

## 🏗️ System Architecture
The project follows a **Layered Architecture** to ensure a separation of concerns:
- **Model Layer**: Defines the data structures (`Student`, `Inventory`) using Encapsulation.
- **Repository Layer**: Provides an interface-driven contract for CRUD operations.
- **Service Layer**: Implements business logic and data validation rules.



## 🌟 Key Features
- **Data Validation**: Prevents invalid entries, such as negative inventory counts or empty student names.
- **OOP Excellence**: Utilizes private fields, constructors, and public accessors to protect data state.
- **Interface-Driven Design**: Decouples logic from implementation, making the system easy to extend.

## 📈 Roadmap & Progress
- [x] **Level 1: System Foundation**
  - [x] Database Schema Design (SQL).
  - [x] Student Management Module.
  - [x] Inventory Management Module.
  - [x] Integration Testing in `Main.java`.
- [x] **Level 2: Persistence & Connectivity** (Next)
  - [x] Connect to MySQL/PostgreSQL via JDBC.
  - [ ] Implement Database Transactions.

## 🚀 How to Run
1. Clone the repository.
2. Compile and run `Main.java` to see the validation and integration tests in action.
   
