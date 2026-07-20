# Cognizant Digital Nurture 5.0 - Java Full Stack Engineer
## Deep Skilling Handbook: Complete Theory & Hands-On Master Guide

---

## 📘 Table of Contents

1. [Engineering Concepts](#-engineering-concepts)
   - [Module 1: Design Patterns and Principles](#module-1-design-patterns-and-principles)
   - [Module 2: Data Structures and Algorithms](#module-2-data-structures-and-algorithms)
2. [💻 Programming Languages](#-programming-languages)
   - [Module 3: PL/SQL Programming](#module-3-plsql-programming)
   - [Module 4: Test Driven Development & Logging Framework](#module-4-test-driven-development--logging-framework)
3. [🚀 Products and Frameworks](#-products-and-frameworks)
   - [Module 5: Spring Core and Maven](#module-5-spring-core-and-maven)
   - [Module 6: Spring Data JPA with Spring Boot & Hibernate](#module-6-spring-data-jpa-with-spring-boot--hibernate)
   - [Module 6B: Code Quality and SonarQube](#module-6b-code-quality-and-sonarqube)
   - [Module 7: Spring REST using Spring Boot 3](#module-7-spring-rest-using-spring-boot-3)
   - [Module 8: Microservices with Spring Boot 3 & Spring Cloud](#module-8-microservices-with-spring-boot-3--spring-cloud)
   - [Module 9: Single Page Application Framework - React](#module-9-single-page-application-framework---react)
   - [Module 10: Application Debugging](#module-10-application-debugging)
4. [☁️ Platforms & GenAI & Git](#%EF%B8%8F-platforms--genai--git)
   - [Module 11: Version Control - GIT](#module-11-version-control---git)
   - [Module 12: DevOps and CI/CD](#module-12-devops-and-cicd)
   - [Module 13: Containerization using Docker](#module-13-containerization-using-docker)
   - [Module 14: Agile Methodology](#module-14-agile-methodology)
   - [Module 15: Cloud Fundamentals (AWS)](#module-15-cloud-fundamentals-aws)
   - [Module 16: Gen AI Fundamentals & GitHub Copilot](#module-16-gen-ai-fundamentals--github-copilot)

---

# 📘 Engineering Concepts

## Module 1: Design Patterns and Principles

### 1. SOLID Principles
- **SRP (Single Responsibility Principle)**: A class should have one, and only one, reason to change.
- **OCP (Open/Closed Principle)**: Software entities should be open for extension, but closed for modification.
- **LSP (Liskov Substitution Principle)**: Derived classes must be substitutable for their base classes without altering program correctness.
- **ISP (Interface Segregation Principle)**: Clients should not be forced to depend upon interfaces that they do not use.
- **DIP (Dependency Inversion Principle)**: High-level modules should not depend on low-level modules; both should depend on abstractions.

### 2. Commonly Used Design Patterns (GoF)
- **Creational**: Singleton (e.g., Logger, DbConnection), Factory Method, Builder Pattern.
- **Structural**: Adapter, Decorator, Proxy.
- **Behavioral**: Observer, Strategy, Command Pattern.
- **Architectural**: Model-View-Controller (MVC), Dependency Injection (DI).

---

## Module 2: Data Structures and Algorithms

### 1. Analysis of Algorithms & Complexity
- **Asymptotic Notations**:
  - $\mathcal{O}(1)$ Constant time
  - $\mathcal{O}(\log n)$ Logarithmic time (Binary Search)
  - $\mathcal{O}(n)$ Linear time (Array Traversal)
  - $\mathcal{O}(n \log n)$ Linearithmic time (Merge Sort, Quick Sort)
  - $\mathcal{O}(n^2)$ Quadratic time (Bubble Sort, Insertion Sort)

### 2. Searching & Sorting Algorithms
- **Linear Search**: Checks each element sequentially ($\mathcal{O}(n)$).
- **Binary Search**: Requires sorted array; divides search interval in half ($\mathcal{O}(\log n)$).
- **Quick Sort**: Divide-and-conquer using pivot element ($\mathcal{O}(n \log n)$ average).
- **Merge Sort**: Stable divide-and-conquer sorting algorithm ($\mathcal{O}(n \log n)$ worst-case).

---

# 💻 Programming Languages

## Module 3: PL/SQL Programming

### Key Concepts
- **Block Structure**: Anonymous vs Named Blocks (`DECLARE`, `BEGIN`, `EXCEPTION`, `END;`).
- **Control Structures**: `IF-THEN-ELSE`, `CASE`, `FOR LOOP`, `WHILE LOOP`.
- **Exception Handling**: Predefined (`NO_DATA_FOUND`, `TOO_MANY_ROWS`) and User-Defined Exceptions.
- **Cursors**: Implicit vs Explicit Cursors (`OPEN`, `FETCH`, `CLOSE`, `%FOUND`, `%NOTFOUND`, `%ROWCOUNT`).
- **Stored Procedures & Functions**: Reusable PL/SQL subprograms with `IN`, `OUT`, and `IN OUT` parameters.
- **Triggers**: Database events firing `BEFORE`, `AFTER`, or `INSTEAD OF` `INSERT`, `UPDATE`, or `DELETE`.

---

## Module 4: Test Driven Development & Logging Framework

### 1. TDD & JUnit 5
- **Red-Green-Refactor Cycle**:
  1. Write failing unit test (**Red**).
  2. Write minimal production code to pass test (**Green**).
  3. Refactor code for cleanliness (**Refactor**).
- **AAA Pattern**: Arrange, Act, Assert.
- **Advanced Features**: Parameterized Tests (`@ParameterizedTest`, `@ValueSource`), Execution Order (`@TestMethodOrder`), Timeout (`@Timeout`).

### 2. Mockito & SLF4J / Lombok
- **Mockito**: Mocking dependencies (`@Mock`, `@InjectMocks`, `when().thenReturn()`, `verify()`).
- **SLF4J**: Parameterized logging (`LOGGER.info("User id: {}", userId)`).
- **Lombok**: Boilerplate reduction (`@Data`, `@Getter`, `@Setter`, `@NoArgsConstructor`, `@AllArgsConstructor`, `@Builder`, `@Slf4j`).

---

# 🚀 Products and Frameworks

## Module 5: Spring Core and Maven

### Key Concepts
- **Maven**: Build tool managing project lifecycle (`compile`, `test`, `package`, `clean`, `install`) and dependencies via `pom.xml`.
- **Spring IoC & Dependency Injection**: Control inversion where Spring container manages bean creation and injects dependencies via Constructor or Setter injection.
- **Bean Configuration**: XML-based (`ClassPathXmlApplicationContext`) and Annotation-based (`@Component`, `@Autowired`, `@Qualifier`, `@Configuration`, `@Bean`).
- **Spring AOP**: Aspect-Oriented Programming for cross-cutting concerns (logging, security, transaction management) using Aspects, Joinpoints, and Pointcuts.

---

## Module 6: Spring Data JPA with Spring Boot & Hibernate

### Key Concepts
- **Entity Mapping**: `@Entity`, `@Table`, `@Id`, `@GeneratedValue(strategy = GenerationType.IDENTITY)`, `@Column`.
- **Relationships**: `@OneToMany`, `@ManyToOne`, `@JoinColumn`, `@ManyToMany`.
- **Repositories**: `JpaRepository<T, ID>` providing `findAll()`, `findById()`, `save()`, `deleteById()`.
- **Query Methods**: Derived query methods (`findByName`, `findByDepartmentName`), `@Query` JPQL queries, and `@NamedQuery`.
- **Pagination & Sorting**: `Pageable`, `PageRequest.of(page, size, Sort.by(field))`, `Page<T>`.
- **Auditing**: `@EnableJpaAuditing`, `@CreatedDate`, `@LastModifiedDate`, `@EntityListeners(AuditingEntityListener.class)`.

---

## Module 6B: Code Quality and SonarQube

### Key Concepts
- **Clean as You Code**: Continuous code inspection catching issues early in development.
- **SonarQube Architecture**: Web Server, Compute Engine, Search Server (Elasticsearch), Database.
- **Quality Gates**: Pass/Fail criteria based on test coverage, cyclomatic complexity, code duplication, and security vulnerabilities.

---

## Module 7: Spring REST using Spring Boot 3

### Key Concepts
- **REST Architecture**: Representational State Transfer using standard HTTP verbs (`GET`, `POST`, `PUT`, `DELETE`).
- **Spring REST Controllers**: `@RestController`, `@RequestMapping`, `@GetMapping`, `@PostMapping`, `@PathVariable`, `@RequestBody`.
- **Validation**: `@Valid`, `@NotNull`, `@Size`, `@Min`, `@NotBlank`.
- **Global Exception Handling**: `@ControllerAdvice` / `@RestControllerAdvice` extending `ResponseEntityExceptionHandler` to return uniform JSON errors (`400 Bad Request`, `404 Not Found`).
- **Security & JWT**: Spring Security configuration, `/authenticate` Basic Auth, signed JWT token generation (`io.jsonwebtoken`), and `JwtAuthorizationFilter` for Bearer token validation.

---

## Module 8: Microservices with Spring Boot 3 & Spring Cloud

### Key Concepts
- **Microservices Architecture**: Splitting monolithic applications into decentralized, independently deployable services (`account`, `loan`).
- **Service Discovery**: **Eureka Discovery Server** (`@EnableEurekaServer` on port `8761`) and Eureka Discovery Clients (`@EnableDiscoveryClient`).
- **API Gateway**: **Spring Cloud Gateway** (port `9090`) for centralized routing, discovery locator, and global logging filters (`GlobalFilter`).

---

## Module 9: Single Page Application Framework - React

### Key Concepts
- **SPA (Single Page Application)**: Web app interacting with user by dynamically rewriting current web page rather than loading entire new pages from server.
- **React Components**: Functional components (`const Component = () => {}`) and Class components (`class Component extends React.Component`).
- **Props vs State**:
  - **Props**: Immutable data passed down from parent components.
  - **State**: Mutable component data managed internally (`useState` hook or `this.state`).
- **Hooks**: `useState` for state management, `useEffect` for lifecycle & side effects (REST API fetching with Fetch/Axios).

---

## Module 10: Application Debugging

### Key Concepts
- **VS Code Debugger**: Setting line breakpoints, conditional breakpoints, watch expressions, step controls (`F10` Step Over, `F11` Step Into).
- **Chrome DevTools**: React Developer Tools extension, inspecting DOM tree, Sources panel debugging with Source Maps, Network tab API payload monitoring.

---

# ☁️ Platforms & GenAI & Git

## Module 11: Version Control - GIT

### Key Concepts
- **DVCS (Distributed Version Control System)**: Every developer has a complete copy of repository history.
- **Git Workflow**: Working Directory -> Staging Area -> Local Repository (`git add .`, `git commit`) -> Remote Repository (`git push`).
- **Branching & Merging**: `git branch`, `git checkout -b`, `git merge`, conflict resolution.

---

## Module 12: DevOps and CI/CD

### Key Concepts
- **DevOps Principles**: Automation, continuous integration, continuous delivery, feedback loops.
- **CI/CD Pipeline**: Automated code building, static analysis, unit testing, and deployment to staging/production environments.

---

## Module 13: Containerization using Docker

### Key Concepts
- **Docker Components**: Docker Engine, Docker Client, Docker Daemon, Images, Containers, Docker Hub.
- **Dockerfile**: Blueprint for building container images (`FROM`, `WORKDIR`, `COPY`, `EXPOSE`, `ENTRYPOINT`).
- **Docker Compose**: Tool for defining and running multi-container Docker applications via `docker-compose.yml`.

---

## Module 14: Agile Methodology

### Key Concepts
- **Agile Manifesto**: 4 core values and 12 principles prioritizing individuals, working software, customer collaboration, and responding to change.
- **Scrum Framework**:
  - **Roles**: Product Owner, Scrum Master, Development Team.
  - **Ceremonies**: Sprint Planning, Daily Scrum, Sprint Review, Sprint Retrospective.
  - **Artifacts**: Product Backlog, Sprint Backlog, Increment.
- **Estimation**: Story Points, Planning Poker, Velocity, Burndown Charts.

---

## Module 15: Cloud Fundamentals (AWS)

### Key Concepts
- **Service Models**: IaaS (EC2), PaaS (Elastic Beanstalk), SaaS.
- **AWS Compute & Storage**: EC2 Instances, Security Groups, S3 Buckets, EBS Volumes.
- **AWS Networking & Database**: VPC, Subnets, Route Tables, Internet Gateway, RDS (MySQL/PostgreSQL), DynamoDB.
- **AWS Serverless**: AWS Lambda functions and AWS API Gateway.

---

## Module 16: Gen AI Fundamentals & GitHub Copilot

### Key Concepts
- **Generative AI vs Discriminative AI**: Generative AI creates new content (text, code, images) based on learned patterns.
- **Prompt Engineering Techniques**:
  - **Zero-Shot Prompting**: Direct instructions without examples.
  - **Few-Shot Prompting**: Providing input-output examples to guide output format.
  - **Chain-of-Thought Prompting**: Instructing the model to reason step-by-step.
- **GitHub Copilot**: AI pair programmer providing real-time inline code completions, unit test generation, refactoring suggestions, and security code reviews.

---

> [!NOTE]
> All 16 handbook modules, theoretical concepts, and hands-on projects are 100% complete, verified, and pushed to [https://github.com/Sath1001/Digital-Nurture-JavaFSE](https://github.com/Sath1001/Digital-Nurture-JavaFSE).
