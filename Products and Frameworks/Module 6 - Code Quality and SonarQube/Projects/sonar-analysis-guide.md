# Code Quality & SonarQube Hands-On Guide

## Overview
This guide covers static code analysis, clean code principles, SonarQube architecture, and Maven plugin integration for Java Full Stack applications.

## 1. SonarQube Architecture
- **Web Server**: Provides dashboard interface for reviewing code smells, bugs, and security vulnerabilities.
- **Compute Engine**: Processes code analysis reports.
- **Search Server**: Elasticsearch engine powering search queries.
- **Database**: PostgreSQL / H2 storing scan results and quality gate metrics.

## 2. Maven pom.xml Integration

Add the SonarQube plugin to `pom.xml`:

```xml
<plugin>
    <groupId>org.sonarsource.scanner.maven</groupId>
    <artifactId>sonar-maven-plugin</artifactId>
    <version>3.10.0.2594</version>
</plugin>
```

## 3. Running SonarQube Analysis

Execute the Maven goal:

```bash
mvn clean verify sonar:sonar \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=YOUR_SONAR_TOKEN
```

## 4. Quality Gates & Code Metrics
- **Cyclomatic Complexity**: Measures control flow complexity.
- **Code Duplication**: Detects duplicated lines and blocks.
- **Code Smells & Vulnerabilities**: Identifies maintainability issues and security risks.
