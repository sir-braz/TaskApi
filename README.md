# Task Management API

The Task Management API is a comprehensive platform for creating and managing task lists. 

## Prerequisites

Before using the API, ensure you meet the following prerequisites:

- **Java JDK 11**: Make sure you have Java JDK 11 or later installed.
- **MySQL Database**: Configure a MySQL database to store tasks and user details.

## Database Configuration

The Task Management API relies on a MySQL database. You can configure the database by specifying the connection details in the `application.properties` file as follows:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/taskmanagementdb?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false&allowPublicKeyRetrieval=true
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
```

Replace `your_mysql_username` and `your_mysql_password` with your actual MySQL credentials.

## Project Compilation and Execution

To compile and run the project, use Apache Maven. Execute the following command in the project's root directory:

```bash
mvn spring-boot:run
```

The API will be accessible at `http://localhost:8080`.

## API Endpoints

The Task Management API offers the following endpoints to manage tasks:

### Tasks

- `POST /api/tasks`: Create a new task.
- `GET /api/tasks`: List all tasks.
- `GET /api/tasks/{id}`: Retrieve details of a specific task by ID.
- `PUT /api/tasks/{id}`: Update an existing task by ID.
- `DELETE /api/tasks/{id}`: Delete a task by ID.
- `PUT /api/tasks/{id}/complete`: Mark a task as completed by ID.


## Dockerization

If you prefer to run the application within a Docker container, a Dockerfile is included in the project's root directory. You can build and run a Docker image of the application with the following commands:

```bash
docker build -t taskmanagementapi .
docker run -p 8080:8080 taskmanagementapi
```

The application will be accessible at `http://localhost:8080`.

## Testing

Unit tests are available to ensure the reliability of the API. Run the tests using the following command:

```bash
./mvnw test
```

## Pending Tasks

The following tasks are pending for the Task Management API:

- [x] Create a base project with Spring Initializr.
- [x] Configure the project with the necessary dependencies.
- [x] Implement the core entities (Task).
- [x] Develop the controller, service, and repository layers.
- [x] Complete API documentation.
- [x] Dockerize the application with Dockerfile and Docker Compose

