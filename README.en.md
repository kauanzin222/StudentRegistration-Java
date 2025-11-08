# Student Registration - Full-Stack Project with Java and Spring Boot

An educational project developed to demonstrate the fundamental concepts of a Full-Stack application, connecting a backend built with **Java** and **Spring Boot** to a simple frontend using **HTML, CSS, and JavaScript with jQuery**.

The system consists of a form for registering students, who are then listed in a table on the same page. It is the ideal project for anyone beginning to understand how the frontend and backend "talk" to each other through a REST API.

![Application Screenshot](/student-frontend/images/desktopResult.png)

---

## 🎯 Key Project Learnings

This repository is not just functional code, but a study tool. By exploring it, you will understand in practice:

### Backend Concepts (Java & Spring Boot)

1.  **Creating a Web Server:** How Spring Boot, with very little configuration, starts a web server (embedded Tomcat) ready to receive requests.
2.  **REST Architecture:** What a REST API is and how it acts as a "bridge" between the client (browser) and the server.
3.  **Controllers and Endpoint Mapping:**
    *   Using `@RestController` to define a class that will respond to web requests.
    *   Using `@GetMapping` to create endpoints that **deliver** data (e.g., listing all courses and students).
    *   Using `@PostMapping` to create endpoints that **receive** data to create a new resource (e.g., registering a new student).
4.  **Handling JSON Data:**
    *   How Spring Boot (with the Jackson library) automatically converts Java objects into JSON text to send to the frontend.
    *   How the `@RequestBody` annotation does the reverse, converting the JSON text sent by the frontend into a ready-to-use Java object.
5.  **CORS (`@CrossOrigin`):** Why the "Cross-Origin Resource Sharing" error occurs and how this simple annotation solves the problem, allowing our frontend (running on `file://` or another domain) to access the backend API (running on `localhost:8080`).
6.  **Spring Boot Project Structure:** The basic package organization (`models`, `resources`) and the role of the `pom.xml` file in managing project dependencies with Maven.

### Frontend Concepts (HTML, JS, jQuery)

1.  **Consuming an API with AJAX:** How to use jQuery's `$.ajax` and `$.getJSON` to make HTTP requests to the backend.
2.  **Asynchronous Requests:** Understanding that JavaScript does not "freeze" while waiting for the server's response. The code inside the `success` callback is only executed when the response arrives.
3.  **Dynamic DOM Manipulation:**
    *   How to populate a `<select>` element (for courses) with data from the API.
    *   How to dynamically add new rows (`<tr>`) and cells (`<td>`) to a table each time a new student is registered or the page is loaded.
4.  **Data Serialization (`JSON.stringify`):** The importance of converting a JavaScript object into a JSON-formatted string before sending it in the body (`data`) of a `POST` request.
5.  **User Interaction:** Capturing form data, using plugins (jQuery Mask) to improve user experience, and clearing the form after a successful submission.

---

## 🚀 Technologies Used

### Backend
*   **Java 21**
*   **Spring Boot 3**
*   **Spring Web:** To create the REST API endpoints.
*   **Spring Boot DevTools:** For automatic backend live reload.
*   **Maven:** For dependency management.

### Frontend
*   **HTML5**
*   **CSS3**
*   **Bootstrap 5:** For quick styling and responsiveness.
*   **JavaScript (ES6)**
*   **jQuery:** To simplify DOM manipulation and AJAX calls.
*   **jQuery Mask Plugin:** To apply masks to form fields (e.g., phone).

---

## 📂 Project Structure

```
StudentRegistration-Java/
├── student-backend/      # Spring Boot project folder
│   ├── src/main/java/
│   │   └── com/abutua/student_backend/
│   │       ├── models/         # Classes representing data (e.g., Student, Course)
│   │       └── resources/      # REST API Controllers (e.g., StudentController)
│   └── pom.xml             # Maven configuration file
│
└── student-frontend/     # Frontend project folder
    ├── css/
    │   └── style.css
    ├── js/
    │   ├── script.js         # Main frontend logic
    │   ├── jquery-3.6.0.min.js
    │   └── jquery.mask.min.js
    └── index.html          # Web page structure
```