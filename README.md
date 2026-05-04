# Expense-Tracker-System-Java-PostgreSQL-
# Project Description

Expense Tracker System is a Java-based console application that helps users manage their daily expenses efficiently.
The project uses Java (JDBC) for backend logic and PostgreSQL as the database to store and retrieve data.


# Features

-  Connect Java application with PostgreSQL database
-  Add transactions (income & expense)
-  View all transactions
-  Organized database structure (users & transactions)
-  Simple and beginner-friendly project

# Technologies Used

- Java (JDK 8+)
- JDBC (Java Database Connectivity)
- PostgreSQL
- pgAdmin

# Database Schema

Users Table

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(100)
);

Transactions Table

CREATE TABLE transactions (
    id SERIAL PRIMARY KEY,
    user_id INT REFERENCES users(id),
    amount DOUBLE PRECISION,
    category VARCHAR(50),
    type VARCHAR(10),
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

---

# How to Run the Project

1. Clone Repository

git clone https://github.com/your-username/expense-tracker.git
cd expense-tracker

---

2. Add PostgreSQL Driver

Download:

postgresql-42.7.3.jar

Place it inside the project folder.

---

3. Compile Java Files

javac -cp ".;postgresql-42.7.3.jar" *.java

---

4. Run the Application

java -cp ".;postgresql-42.7.3.jar" Main

---

# Database Configuration

Update "DBConnection.java" with your credentials:

String url = "jdbc:postgresql://localhost:5432/your_database_name";
String user = "postgres";
String password = "your_password";

---

# Sample Output

Expense Tracker Started...
Database Connected Successfully!

Transaction Added!
Transaction Added!

All Transactions:
1 | 1 | 1000 | Salary | income
2 | 1 | 200 | Food | expense

---

# Future Enhancements

- 🔐 User Login System
- 📊 Total Income & Expense Calculation
- 🖥 GUI using Java Swing
- 🌐 Web-based version

---

# Author

Manoj Kumar
B.Tech CSE Student
Interested in Full Stack Development 🚀
