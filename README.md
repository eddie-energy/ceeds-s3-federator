# ceeds-s3-federator

S3 federation service. Java 21 / Spring Boot backend.

## Stack
- Java 21, Spring Boot 3.5 (web, data-jpa, actuator)
- PostgreSQL + Flyway migrations
- Lombok, MapStruct, springdoc OpenAPI
- errorprone + NullAway, Jacoco, Jib

## Layout
- `s3-federator/` — backend Gradle module
- `frontend/` — Vue app (added later)

## Build & run
```sh
# local Postgres
(cd s3-federator/env && cp .env .env.local)   # fill in DB creds
docker compose -f s3-federator/env/docker-compose.yaml up -d postgres

# build
./gradlew :s3-federator:build

# run (set s3-federator.db.* or use application-local.yaml)
./gradlew :s3-federator:bootRun
```

- Health: http://localhost:8080/actuator/health
- Swagger UI: http://localhost:8080/swagger-ui.html
