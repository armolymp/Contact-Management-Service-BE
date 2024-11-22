# Contact Management System - Backend

This is the **Backend** for the **Contact Management System**. It is built using **Spring Boot** and provides **RESTful API** endpoints for managing contacts (Create, Read, Update, Delete). The backend uses **Spring Data JPA** to interact with an **H2 in-memory database**.

---

## Technologies Used
- **Spring Boot**: Backend framework for building RESTful APIs.
- **Spring Data JPA**: For database interaction.
- **H2 Database**: In-memory database for easy setup and testing.
- **Spring Web**: For creating REST APIs.
- **Lombok**: For reducing boilerplate code (optional).
- **Spring Security**: Optional (for future authentication needs).

---

## Setup and Installation

### 1. Clone the Repository
To get started, clone this repository:

```bash
git clone https://github.com/armolymp/Contact-Management-Service-BE.git
```

## Building Instructions

### Maven
```bash
mvn clean install
```

## Running Instructions

### Maven
```bash
mvn spring-boot:run
```

KEY = PMAT-01JDA4E8H84X51TVKSKVGEHXDF

## POSTMAN COLLECTION - https://api.postman.com/collections/20449299-ca2eecb7-a12c-4d9a-807a-53d5924ffe3b?access_key=<PLACEHOLDER_FOR_POSTMAN_KEY>

## API Endpoints

The backend exposes the following **RESTful API endpoints** for managing contacts.

---

### 1. **POST /contacts**: Add a new contact

- **Description**: Creates a new contact in the database.
- **Request**:
    - **Headers**:
      ```json
      {
        "Content-Type": "application/json"
      }
      ```
    - **Body**:
      ```json
      {
        "firstName": "John",
        "lastName": "Doe",
        "email": "john.doe@example.com",
        "phoneNumber": "1234567890"
      }
      ```
- **Response**:
    - **Status Code**: `201 Created`
    - **Body**:
      ```json
      {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe",
        "email": "john.doe@example.com",
        "phoneNumber": "1234567890"
      }
      ```

---

### 2. **GET /contacts**: Fetch all contacts

- **Description**: Retrieves a list of all contacts.
- **Request**: No body required.
- **Response**:
    - **Status Code**: `200 OK`
    - **Body**:
      ```json
      [
        {
          "id": 1,
          "firstName": "John",
          "lastName": "Doe",
          "email": "john.doe@example.com",
          "phoneNumber": "1234567890"
        },
        {
          "id": 2,
          "firstName": "Jane",
          "lastName": "Doe",
          "email": "jane.doe@example.com",
          "phoneNumber": "0987654321"
        }
      ]
      ```

---

### 3. **GET /contacts/{id}**: Fetch a specific contact by ID

- **Description**: Retrieves the details of a specific contact by their ID.
- **Request**:
    - Replace `{id}` in the URL with the contact's ID.
- **Response**:
    - **Status Code**: `200 OK`
    - **Body**:
      ```json
      {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe",
        "email": "john.doe@example.com",
        "phoneNumber": "1234567890"
      }
      ```

---

### 4. **PUT /contacts/{id}**: Update a contact

- **Description**: Updates the details of an existing contact.
- **Request**:
    - Replace `{id}` in the URL with the contact's ID.
    - **Headers**:
      ```json
      {
        "Content-Type": "application/json"
      }
      ```
    - **Body**:
      ```json
      {
        "firstName": "John",
        "lastName": "Smith",
        "email": "john.smith@example.com",
        "phoneNumber": "9876543210"
      }
      ```
- **Response**:
    - **Status Code**: `200 OK`
    - **Body**:
      ```json
      {
        "id": 1,
        "firstName": "John",
        "lastName": "Smith",
        "email": "john.smith@example.com",
        "phoneNumber": "9876543210"
      }
      ```

---

### 5. **DELETE /contacts/{id}**: Delete a contact

- **Description**: Deletes a specific contact by their ID.
- **Request**:
    - Replace `{id}` in the URL with the contact's ID.
- **Response**:
    - **Status Code**: `204 No Content`
    - **Body**: No body is returned.

---

### Notes

- **Base URL**: Ensure the backend server is running at `http://localhost:8080` for all requests.
- Replace `{id}` in the URL with the actual contact ID for endpoints like `GET /contacts/{id}`, `PUT /contacts/{id}`, and `DELETE /contacts/{id}`.
- For `POST` and `PUT` requests, ensure the `Content-Type` is set to `application/json`.




