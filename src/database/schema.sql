-- This creates the 'students' table to store data
CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    course VARCHAR(100)
);

-- This creates the 'inventory' table for your manager
CREATE TABLE inventory (
    item_id INT PRIMARY KEY,
    item_name VARCHAR(100) NOT NULL,
    quantity INT DEFAULT 0
);

