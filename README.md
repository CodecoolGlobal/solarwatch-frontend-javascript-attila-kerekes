Solar Watch Application
The Solar Watch Application is a web application designed to provide users with information about sunrise and sunset times for different cities. This README file provides an overview of the application's structure, functionality, and deployment instructions.

Table of Contents
Features
Technologies Used
Getting Started
Prerequisites
Installation
Usage
Contributing
License
Features
Sunrise/Sunset Data: Retrieve sunrise and sunset times for a specified city and date.
City Management: Add, update, and delete cities to track sunrise and sunset times.
User Authentication: User registration and login with role-based access control.
Technologies Used
Spring Boot: Backend framework for building RESTful APIs and handling business logic.
React.js: Frontend library for building interactive user interfaces.
JWT (JSON Web Tokens): Authentication mechanism for securing API endpoints.
OpenWeatherMap API: External API used to fetch geolocation data and sunrise/sunset times.
Behance: Source for UI/UX design inspiration.
HTML/CSS: Frontend styling and structure.
Getting Started
Prerequisites
Before running the application, make sure you have the following software installed on your machine:

Java Development Kit (JDK)
Node.js
npm (Node Package Manager)
Installation
Clone the repository:

bash
Copy code
git clone https://github.com/your-username/solar-watch.git
Navigate to the project directory:

bash
Copy code
cd solar-watch
Install backend dependencies:

bash
Copy code
# Using Maven
mvn install
Install frontend dependencies:

bash
Copy code
# Using npm
npm install
Usage
Start the backend server:

bash
Copy code
mvn spring-boot:run
Start the frontend development server:

bash
Copy code
npm start
Open your web browser and navigate to http://localhost:3000 to access the application.
