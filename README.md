# NBA Player API

A RESTful API built with Spring Boot and PostgreSQL for managing NBA player data. Supports full CRUD operations —
create, read, update, and delete players.

## Tech Stack

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Docker Compose (PostgreSQL)**
- **Maven**

## Getting Started

### Prerequisites

- Java 17+
- Docker and Docker Compose
- Maven

### Database Setup

Start the PostgreSQL database using Docker Compose:

```bash
docker-compose up -d
```

This will spin up a PostgreSQL container with the following configuration:

- **Database:** nbadatabase
- **Username:** myuser
- **Password:** mypassword
- **Port:** 5432

### Running the Application

```bash
mvn spring-boot:run
```

The API will start on `http://localhost:8080`.

## API Endpoints

| Method | Endpoint                  | Description                      |
|--------|---------------------------|----------------------------------|
| GET    | `/api/v1/nba-player`      | Retrieve all NBA players         |
| GET    | `/api/v1/nba-player/{id}` | Retrieve a specific player by ID |
| POST   | `/api/v1/nba-player`      | Add a new NBA player             |
| PUT    | `/api/v1/nba-player/{id}` | Update a player's association    |
| DELETE | `/api/v1/nba-player/{id}` | Remove a player by ID            |

## Example Requests

### Add a Player

```json
POST /api/v1/nba-player
Content-Type: application/json

{
"name": "Luka Dončić",
"association": "Dallas Mavericks",
"position": "Point Guard"
}
```

### Get All Players

```
GET /api/v1/nba-player
```

### Get Player by ID

```
GET /api/v1/nba-player/1
```

### Update Player Association

```json
PUT /api/v1/nba-player/1
Content-Type: application/json

{
"association": "New York Knicks"
}
```

### Delete a Player

```
DELETE /api/v1/nba-player/6
```

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/project/nbaplayerapi/
│   │       ├── NbaPlayer.java              # Entity class
│   │       ├── NbaPlayerRepository.java    # JPA Repository
│   │       ├── NbaPlayerService.java       # Business logic
│   │       └── NbaPlayerController.java    # REST Controller
│   └── resources/
│       └── application.properties          # Database configuration
├── docker-compose.yml                      # PostgreSQL Docker setup
```

## What I Learned

- Setting up a Spring Boot project from scratch independently
- Running a PostgreSQL database locally using Docker Compose
- Connecting a Java application to PostgreSQL using Spring Data JPA
- Building a RESTful API with full CRUD functionality
- Structuring a Spring Boot application using the Controller, Service, and Repository pattern
- Mapping HTTP methods (GET, POST, PUT, DELETE) to endpoints using Spring annotations
- Using JPA annotations to define entities and manage database schema

## Known Limitations

- No authentication
- No input validation or custom error handling yet (invalid requests may return generic 500 errors)
- Entities are exposed directly in requests and responses
- No automated tests

## Author

Hafez Sam — [github.com/hsmsam](https://github.com/hsmsam)
