# SpringBoot-RestAPI

This is a demo Spring Boot application that provides a REST API for handling payloads.<br><br>
This `README.md` file provides clear instructions on how to clone the repository, build and run the application, and interact with the API using both curl commands and Postman.

## Prerequisites
- Java 8 or later
- Maven
- Git

## Getting Started

### Clone the Repository
```
git clone https://github.com/amzadb/SpringBoot-RestAPI.git
cd SpringBoot-RestAPI
```

### Build the Application
```
mvn clean install
```

### Run the Application
```
mvn spring-boot:run
```

The application will start on http://localhost:8080

## API Endpoints
1. **<code>/api/nocontent</code>**
   * Method: GET
   * Description: Returns HTTP 204 No Content.
   * Curl Command:
     ```
       curl -X GET http://localhost:8080/api/nocontent -H "Authorization: Bearer valid-token"
     ```

2. **<code>/api/echo</code>**
   * Method: POST
   * Description: Returns HTTP 200 and the original payload.
   * Sample Payload:
     ```
       {
         "RecordType": "xxx",
         "DeviceId": "357370040159770",
         "EventDateTime": "2014-05-12T05:09:48Z",
         "FieldA": 68,
         "FieldB": "xxx",
         "FieldC": 123.45
       }
     ```
   * Curl Command:
     ```
       curl -X POST http://localhost:8080/api/echo \
            -H "Authorization: Bearer valid-token" \
            -H "Content-Type: application/json" \
            -d '{
               "RecordType": "xxx",
               "DeviceId": "357370040159770",
               "EventDateTime": "2014-05-12T05:09:48Z",
               "FieldA": 68,
               "FieldB": "xxx",
               "FieldC": 123.45
            }'
     ```

3. **<code>/api/device</code>**
   * Method: POST
   * Description: Returns HTTP 200 and only the <code>DeviceId</code> field
   * Sample Payload:
     ```
         {
           "RecordType": "xxx",
           "DeviceId": "357370040159770",
           "EventDateTime": "2014-05-12T05:09:48Z",
           "FieldA": 68,
           "FieldB": "xxx",
           "FieldC": 123.45
         }
     ```
   * Curl Command:
     ```
         curl -X POST http://localhost:8080/api/device \
              -H "Authorization: Bearer valid-token" \
              -H "Content-Type: application/json" \
              -d '{
                 "RecordType": "xxx",
                 "DeviceId": "357370040159770",
                 "EventDateTime": "2014-05-12T05:09:48Z",
                 "FieldA": 68,
                 "FieldB": "xxx",
                 "FieldC": 123.45
              }'
     ```

## Using Postman
1. **<code>/api/nocontent</code>**
   * Method: GET
   * URL: http://localhost:8080/api/nocontent
   * Headers:
      * Authorization: <code>Bearer valid-token</code>
      
2. **<code>/api/echo</code>**
   * Method: POST
   * URL: http://localhost:8080/api/echo
   * Headers:
      * Authorization: <code>Bearer valid-token</code>
      * Content-Type: <code>application/json</code>
    * Body:
      ```
        {
           "RecordType": "xxx",
           "DeviceId": "357370040159770",
           "EventDateTime": "2014-05-12T05:09:48Z",
           "FieldA": 68,
           "FieldB": "xxx",
           "FieldC": 123.45
        }
      ```
3. **<code>/api/device</code>**
   * Method: POST
   * URL: http://localhost:8080/api/device
   * Headers:
      * Authorization: <code>Bearer valid-token</code>
      * Content-Type: <code>application/json</code>
   * Body:
     ```
        {
           "RecordType": "xxx",
           "DeviceId": "357370040159770",
           "EventDateTime": "2014-05-12T05:09:48Z",
           "FieldA": 68,
           "FieldB": "xxx",
           "FieldC": 123.45
        }
     ```
### Notes:
* Ensure that the Authorization header is set correctly with the value <code>Bearer valid-token</code>.
* The application uses an in-memory H2 database, which is configured in the <code>application.properties</code> file.
