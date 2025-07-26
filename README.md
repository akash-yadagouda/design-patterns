# Design Patterns in Java (Spring Boot)

This repository contains implementations of popular design patterns in Java using Spring Boot.  
Each pattern is implemented as a separate standalone Spring Boot project inside this repository.

## 📁 Projects

### 1. Observer Pattern
**Location**: `observer-pattern-demo`  
**Description**: Demonstrates the Observer Pattern using a real-time example — sending email and SMS notifications when a user registers.  
**Technologies**: Spring Boot, Java

> Run the project and POST to `/api/users/register` with a user payload to trigger notifications.

---

## 🚀 How to Run Any Project

1. Navigate to the subproject directory (e.g., `observer-pattern-demo`)
2. Run the Spring Boot app:
   ```bash
   ./mvnw spring-boot:run
