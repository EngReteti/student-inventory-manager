-- Database Initialization
CREATE DATABASE IF NOT EXISTS student_inventory_db;
USE student_inventory_db;

-- Table for Student Management
CREATE TABLE IF NOT EXISTS students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL, -- UNIQUE constraint for data integrity
    course VARCHAR(100)
);

-- Table for Inventory Management
CREATE TABLE IF NOT EXISTS inventory (
    id INT AUTO_INCREMENT PRIMARY KEY,
    item_name VARCHAR(100) NOT NULL,
    quantity INT DEFAULT 0,
    price DECIMAL(10, 2) DEFAULT 0.00 -- Added for financial reporting
);
