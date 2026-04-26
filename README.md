# 📚 Library Management System

A console-based Library Management System built with Java, demonstrating core Object-Oriented Programming concepts such as abstract classes, inheritance, and polymorphism.

---

## 🚀 Features

- Add books to the library
- Register users as **Students** or **Teachers**
- Issue books to users with availability tracking
- Return books and maintain return history
- Borrow limits enforced per user type:
  - Students → up to **3 books**
  - Teachers → up to **5 books**

---

## 🛠️ Tech Stack

- **Language:** Java
- **Concepts:** OOP, Abstract Classes, Inheritance, Polymorphism, Collections

---

## 📁 Project Structure

```
LibraryManagement/
│
├── Main.java          # Entry point, console menu
├── Library.java       # Core logic — add, issue, return books
├── Book.java          # Book entity with availability tracking
├── User.java          # Abstract base class for all users
├── Student.java       # Student user (max 3 books)
└── Teacher.java       # Teacher user (max 5 books)
```

---

## ▶️ How to Run

### Prerequisites
- Java JDK 17 or above installed
- A terminal or any Java IDE (IntelliJ IDEA, Eclipse, VS Code)

### Steps

**1. Clone the repository**
```bash
git clone https://github.com/your-username/LibraryManagement.git
cd LibraryManagement
```

**2. Compile the files**
```bash
javac LibraryManagement/*.java
```

**3. Run the program**
```bash
java LibraryManagement.Main
```

---

## 📖 Usage

Once running, you will see a menu:

```
Welcome to the Library Management System
Please choose a valid Option:
1. Add Book
2. View Books
3. Add User
4. Issue Book
5. Return Book
6. Exit
```

Follow the prompts to manage books and users.

---

## 🧠 OOP Concepts Applied

| Concept | Where Used |
|---|---|
| Abstract Class | `User.java` |
| Inheritance | `Student`, `Teacher` extend `User` |
| Polymorphism | `borrowBook()` overridden per user type |
| Encapsulation | Private fields with getters/setters in `Book` |
| Collections | `ArrayList` for books, users, borrow history |

---

## 👨‍💻 Author

**Sharan**  
Beginner Backend Developer | Java Enthusiast  
[GitHub](https://github.com/your-username)
