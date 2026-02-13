
I encountered and resolved several engineering hurdles during the development of this system:

| Challenge | Solution |
| :--- | :--- |
| **Data Volatility** | Migrated from temporary `ArrayList` storage to a persistent **MariaDB SQL** infrastructure, ensuring data survives system restarts. |
| **Security Risks** | Replaced plain-text credential checking with a **SHA-256 hashing** gate and administrative session control. |
| **Data Integrity** | Implemented a custom **Regex-based sanitization** layer to prevent SQL injection and ensure 100% accurate contact information. |
| **Code Scalability** | Refactored the codebase from a monolithic structure into a **Decoupled n-tier Architecture** (Presentation, Service, DAO) for professional separation of concerns. |


---

## 🛠 Technical Challenges & Solutions (The Engineering Process)

I resolved several critical hurdles by applying structured engineering principles:

| Challenge | The "How" (Solution Process) |
| :--- | :--- |
| **Data Volatility** | **How:** I integrated the MariaDB JDBC driver and refactored the Service Layer to execute SQL `INSERT` and `SELECT` queries instead of relying on local `ArrayList` objects, ensuring data persistence across sessions. |
| **Security Risks** | **How:** I implemented a dedicated `AuthService` that intercepts the application flow, requiring a 256-bit hashed password verification before the `Main` menu is initialized, effectively creating a secure gate. |
| **Data Integrity** | **How:** I developed a validation utility using Regular Expressions (Regex) to filter input buffers; this ensures that only properly formatted emails and 10-digit phone numbers are committed to the database. |
| **Code Scalability** | **How:** I decoupled the logic by creating a 3-tier structure: the `Main` class handles the UI, `StudentService` handles the logic, and `DatabaseManager` handles the raw SQL connection, making the system modular. |

