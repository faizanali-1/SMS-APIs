# SMS-APIs (Student Management System)

A Spring Boot REST API built to manage student records, demonstrating backend development using Java, Spring Boot, and PostgreSQL.

---

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- REST APIs

---

## Features
- Create, read, update, and delete student records
- RESTful API design
- Layered architecture (Controller, Service, Repository)
- Database integration using JPA and PostgreSQL
- APIs tested using Postman

---

## API Endpoints

| Method | Endpoint | Description |
|------|---------|-------------|
| POST | /api/students | Create a new student |
| GET | /api/students | Get all students |
| GET | /api/students/{id} | Get student by ID |
| PUT | /api/students/{id} | Update student |
| DELETE | /api/students/{id} | Delete student |

---

## How to Run

1. Clone the repository
git clone https://github.com/faizanali-1/SMS-APIs.git


2. Configure database in `application.properties`

3. Run the project
mvn spring-boot:run


API will be available at:
http://localhost:8080/api/students


---

## Testing
All APIs have been tested using Postman to verify correct functionality.

---

## Future Improvements
- Add validation and global exception handling
- Implement JWT authentication
- Add Swagger/OpenAPI documentation

---

## Author
Faizan Ali  
Java Backend Developer  

GitHub: https://github.com/faizanali-1  
LinkedIn: https://linkedin.com/in/your-link
