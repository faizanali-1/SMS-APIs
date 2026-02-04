#  Student Management System (SMS APIs)

A **production-style RESTful API** built using **Spring Boot** for managing student records.
This project demonstrates clean architecture, layered design, and real-world backend development practices.

---

##  Project Overview

**SMS-APIs** is a backend application that allows CRUD operations on student data.
It follows industry-standard architecture using **Controller → Service → Repository** layers and integrates with a relational database.

This project is designed to showcase backend engineering skills for recruiters and developers.

---

##  Tech Stack

| Technology             | Purpose                   |
| ---------------------- | ------------------------- |
| **Java**               | Core programming language |
| **Spring Boot**        | Backend framework         |
| **Spring Data JPA**    | Database access layer     |
| **PostgreSQL / MySQL** | Database                  |
| **Maven**              | Build tool                |
| **REST APIs**          | Communication             |
| **Postman**            | API Testing               |

---

##  Features

✔ Create Student
✔ View All Students
✔ View Student by ID
✔ Update Student
✔ Delete Student
✔ Layered Architecture
✔ DTO Pattern for data transfer
✔ Clean code structure
✔ Database integration with JPA

---

## 📂 Project Structure (Professional Architecture)

```
SMS-APIs
│── src
│   └── main
│       ├── java
│       │   └── com.faizan.sms
│       │       ├── controller
│       │       │     └── StudentController.java
│       │       │
│       │       ├── service
│       │       │     ├── StudentService.java
│       │       │     └── impl
│       │       │          └── StudentServiceImpl.java
│       │       │
│       │       ├── repository
│       │       │     └── StudentRepository.java
│       │       │
│       │       ├── entity
│       │       │     └── Student.java
│       │       │
│       │       ├── dto
│       │       │     └── StudentDTO.java
│       │       │
│       │       ├── exception
│       │       │     ├── ResourceNotFoundException.java
│       │       │     └── GlobalExceptionHandler.java
│       │       │
│       │       └── APIsApplication.java
│       │
│       └── resources
│             └── application.properties
│
└── pom.xml
```

---

## 🔗 API Endpoints

| Method     | Endpoint             | Description       |
| ---------- | -------------------- | ----------------- |
| **POST**   | `/api/students`      | Add new student   |
| **GET**    | `/api/students`      | Get all students  |
| **GET**    | `/api/students/{id}` | Get student by ID |
| **PUT**    | `/api/students/{id}` | Update student    |
| **DELETE** | `/api/students/{id}` | Delete student    |

---

##  How to Run the Project

### 1️ Clone Repository

```
git clone https://github.com/faizanali-1/SMS-APIs.git
```

### 2️ Configure Database

Update `application.properties`:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/sms_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3️ Run Application

```
mvn spring-boot:run
```

App runs at:

```
http://localhost:8080
```

---

##  API Testing

Use **Postman** or browser:

Example:

```
GET http://localhost:8080/api/students
```

---

##  Future Improvements

* JWT Authentication
* Swagger API Documentation
* Validation (Hibernate Validator)
* Logging (SLF4J)
* Dockerization

---

##  Author

**Faizan Ali**
Backend Developer | Spring Boot | Java
GitHub: [https://github.com/faizanali-1](https://github.com/faizanali-1)
Email: [faizanali.software@gmail.com]
---

⭐ If you like this project, give it a star!
