# Docker Containerization Hands-On

## Overview
This project demonstrates containerization of Java Spring Boot applications using Docker and Docker Compose.

## Commands

### Building Docker Image
```bash
docker build -t spring-boot-app .
```

### Running Container
```bash
docker run -p 8080:8080 spring-boot-app
```

### Multi-Container Deployment with Docker Compose
```bash
docker-compose up --build
```
