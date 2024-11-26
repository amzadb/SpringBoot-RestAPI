# SpringBoot-RestAPI

This is a demo Spring Boot application that provides a REST API for handling payloads.
This `README.md` file provides clear instructions on how to clone the repository, build and run the application, and interact with the API using both curl commands and Postman.

## Prerequisites

- Java 8 or later
- Maven
- Git

## Getting Started

### Clone the Repository

```sh
git clone https://github.com/amzadb/SpringBoot-RestAPI.git
cd SpringBoot-RestAPI
```

### Build the Application
```sh
mvn clean install
```

### Run the Application
```sh
mvn spring-boot:run
```

The application will start on http://localhost:8080

## API Endpoints
1. **/api/nocontent <br> Method: GET <br> Description: Returns HTTP 204 No Content. <br> Curl Command:** <br>
```sh
curl -X GET http://localhost:8080/api/nocontent -H "Authorization: Bearer valid-token"
```
