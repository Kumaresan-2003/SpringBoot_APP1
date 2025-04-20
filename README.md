
# 📝 Note-Taking App

A simple note-taking web application built using **Spring Boot**, **MySQL**, **Spring Data JPA**, and **Lombok** on the backend, and **HTML**, **JavaScript**, and **Bootstrap** on the frontend.

---

## 📂 Project Structure

```
note-taking-app/
├── src/
│   └── main/
│       ├── java/com/example/noteapp/
│       │   ├── controller/
│       │   ├── model/
│       │   ├── repository/
│       │   ├── service/
│       │   └── NoteAppApplication.java
│       └── resources/
│           ├── static/
│           │   └── index.html
│           └── application.properties
└── pom.xml
```

---

## ⚙️ Technologies Used

### ✅ Backend
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Lombok

### ✅ Frontend
- HTML
- JavaScript (Vanilla)
- Bootstrap 5

---

## 🛠️ Features

- Create a new note
- View all saved notes
- Delete notes
- Responsive UI using Bootstrap
- CORS support for frontend-backend integration

---

## 🔧 Setup Instructions

### 📦 Prerequisites
- Java 17+
- Maven
- MySQL server

---

## 🚀 Backend Setup

1. **Clone the repo**:
   ```bash
   git clone https://github.com/yourusername/note-taking-app.git
   cd note-taking-app
   ```

2. **Create a MySQL database**:
   ```sql
   CREATE DATABASE note_app;
   ```

3. **Update `application.properties`** with your MySQL credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/note_app
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```

4. **Run the application**:
   ```bash
   ./mvnw spring-boot:run
   ```

---

## 🌐 Frontend Setup

The frontend is located in:
```
src/main/resources/static/index.html
```

Once the backend is running, simply open `index.html` in your browser, or access it through:

```
http://localhost:8080/index.html
```

---

## ✅ API Endpoints

| Method | Endpoint          | Description         |
|--------|-------------------|---------------------|
| GET    | `/api/notes`      | Get all notes       |
| POST   | `/api/notes`      | Create a new note   |
| DELETE | `/api/notes/{id}` | Delete a note by ID |

---

## 🔐 CORS Handling

CORS is enabled globally in the backend using:
```java
@CrossOrigin(origins = "*")
```
Modify this to allow specific origins in production.

---

## 📸 Screenshots

_You can add screenshots here if you'd like for visual reference._
![Screenshot 2025-04-20 134110](https://github.com/user-attachments/assets/0f846001-6e54-404a-a062-e35b03d8b04b)
![Screenshot 2025-04-20 134049](https://github.com/user-attachments/assets/e32fd484-5663-4168-aa00-1dcb89feb5df)
![Screenshot 2025-04-20 134110](https://github.com/user-attachments/assets/0512706c-acb7-4bc6-b87e-8f03a1ed1464)


---




