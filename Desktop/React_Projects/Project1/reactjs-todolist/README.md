# Todo Application - Full Stack

A simple full-stack todo application built using **React** for the frontend and **Spring Boot** for the backend. This project is deployed on **Render** and integrates with a **PostgreSQL database** hosted on **Neon**.

## Features

- **User Authentication**: Secure login and registration system using JWT tokens.
- **CRUD Operations**: Create, Read, Update, and Delete todos.
- **Database Integration**: PostgreSQL database hosted on Neon for storing todos.

## Technologies Used

- **Frontend**: 
  - React.js

- **Backend**: 
  - Spring Boot
  - Spring Data JPA
  - JWT Authentication

- **Database**: 
  - PostgreSQL

- **Containerization**: 
  - Docker (for building and deploying the app)

- **Deployment**: 
  - Backend deployed on Render
  - Frontend deployed on Netlify
  - Database deployed on Neon


### Clone the Repository

```bash
git clone https://github.com/likhithraj005/todo_springboot_react.git

### Installation

**Frontend Setup**
Navigate to the 04-frontend-react/todo-app directory:

```bash
cd 04-frontend-react/todo-app


Install the dependencies:

```bash
npm install

Run the React application locally:

```bash
npm start

The frontend will be available at: https://todo-spring.netlify.app

**Backend Setup (Spring Boot)**

Navigate to the 03-rest-api-full-stack-h2 directory:

```bash
cd 03-rest-api-full-stack-h2

Set up the PostgreSQL database and configure the connection settings in the application.properties file (found in src/main/resources).

Run the Spring Boot application:

```bash
./mvnw spring-boot:run

Building the Docker Image
In the root of your project, create a Dockerfile for the backend (03-rest-api-full-stack-h2)

The backend will be available at: https://todo-deployment-latest.onrender.com


