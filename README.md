## Ticket Tracker Application
The Ticket Tracker Application is a robust solution designed to streamline issue resolution and customer support for organizations. It enables effective management of customer tickets, ensuring faster response times and improved customer satisfaction.

## Features
User-friendly Interface: Intuitive and accessible UI for both customers and support staff.
Issue Management: Seamless creation, updating, and tracking of tickets.
Data Security: Ensures secure storage and management of ticket information.
Efficient Workflow: Simplifies resolution workflows for quicker ticket handling.

## Technologies Used

# Backend:
Java
Spring Boot

# Frontend:
HTML5
CSS

# Database:
H2 Database


## Setup and Installation

Clone the Repository:
git clone https://github.com/your-repository/ticket-tracker-app.git  

Navigate to the Project Directory:

cd ticket-tracker-app  

# Set Up the Database:

Create a MySQL database named ticket_tracker.
Import the provided SQL file (schema.sql) to set up the necessary tables.

# Configure Database Properties:

Update the application.properties file in the src/main/resources directory with your MySQL credentials.

# properties

spring.datasource.url=jdbc:mysql://localhost:3306/ticket_tracker  
spring.datasource.username=your_username  
spring.datasource.password=your_password  

# Run the Application:

Use your preferred IDE or run the following command in the terminal:

mvn spring-boot:run  

# Access the Application:

Open your browser and navigate to http://localhost:8080.
