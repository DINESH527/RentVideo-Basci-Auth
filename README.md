# RentVideo-Basci-Auth

RentVideo is a RESTful API built using Spring Boot that allows users to register, authenticate, and manage video rentals. The system uses MySQL for data persistence and Spring Security with Basic Authentication for secure access.

---

## 🚀 Features

### 👤 User Management
- User Registration
- Password encryption using BCrypt
- Role-based access control
- Roles:
  - CUSTOMER
  - ADMIN

### 🔐 Authentication & Authorization
- Basic Authentication
- Secure endpoints based on roles
- ADMIN can manage videos
- CUSTOMER can view videos

### 🎥 Video Management
- Add videos (ADMIN only)
- Update videos (ADMIN only)
- Delete videos (ADMIN only)
- View all videos (CUSTOMER & ADMIN)

### 💾 Database
- MySQL database integration
- Automatic table creation using Hibernate

---

## 🛠️ Technologies Used

- Java 17+ / Java 25
- Spring Boot 3
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL
- Maven / Gradle
- IntelliJ IDEA
- Postman (for testing)

---

## 📁 Project Structure

rentvideo
│
├── src/main/java/com/example/rentvideo
│ ├── controller
│ ├── entity
│ ├── repository
│ ├── service
│ ├── security
│ └── RentVideoApplication.java
│
├── src/main/resources
│ └── application.properties
│
├── pom.xml
└── README.md

---


📡 API Endpoints

🔓 Public Endpoints

Register User


POST /api/auth/register


Request Body:

{
  "email": "admin@gmail.com",
  "password": "admin123",
  "firstName": "Admin",
  "lastName": "User",
  "role": "ADMIN"
}


🔒 Private Endpoints (Basic Auth required)

Get All Videos

GET /api/videos

Authorization:

Basic Auth
Username: admin@gmail.com
Password: admin123

Add Video (ADMIN only)

POST /api/videos
{
  "title": "Inception",
  "director": "Christopher Nolan",
  "genre": "Sci-Fi",
  "available": true
}


Update Video (ADMIN only)

PUT /api/videos/{id}



Delete Video (ADMIN only)

DELETE /api/videos/{id}

---

🔐 Security

-- Password stored using BCrypt encryption

-- Basic Authentication used

-- Role-based authorization enforced

---

🧪 Testing

Use Postman to test endpoints.

---

⚙ Database Configuration

spring.datasource.url=jdbc:mysql://localhost:3306/rentvideo

spring.datasource.username=root
spring.datasource.password=your-password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

---

▶ How to Run the Project

1.Clone the repository : https://github.com/DINESH527/RentVideo-Basci-Auth.git.

2.Open in IntelliJ IDEA

3.Configure database in application.properties

4.Run GroceryApplication.java






