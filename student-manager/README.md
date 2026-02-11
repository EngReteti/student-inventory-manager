Student Inventory Manager (Smart GUI Edition)
​Project Objective
​A high-performance student management system utilizing Java and MariaDB, engineered and deployed entirely within a mobile Linux environment. This project demonstrates advanced data persistence, graphical interface integration, and proactive error handling.
​Technical Architecture
​Database: MariaDB (SQL) for persistent record storage and retrieval.
​Build System: Maven for dependency management and automated build lifecycles.
​Smart Logic: Engineered backend validation to handle SQL exceptions and prevent duplicate data entry.
​Deployment: X11/Fluxbox desktop environment configured on Android via Termux.
​Visual Development Gallery
​Mobile Workspace Setup: Initializing the Termux environment for Java development.
​Core Architecture: Managing a 10-file Java source structure within a Maven project.
​Build Automation: Verified "BUILD SUCCESS" through the Maven compilation lifecycle.
​GUI Desktop Interface: Configuring the Fluxbox window manager for graphical support.
​Smart Menu Execution: Launching the application with active database validation.
​Database Persistence Verification: [NEW SUCCESS] Real-time data retrieval showing saved records (Fib Bill, Rea Gun, Amos) directly from MariaDB.
​Professional Cloud Sync: [NEW SUCCESS] Finalizing the project with a secure Git push to the remote repository.
​How to Run
​To execute this project in a similar mobile-Linux environment:
​Initialize MariaDB: Ensure the database service is active.
​Start Desktop Server: Run vncserver -localhost no in Termux.
​Launch Graphical Interface: Within the desktop terminal, execute:
mvn clean compile exec:java -Dexec.mainClass="com.school.StudentGUI
