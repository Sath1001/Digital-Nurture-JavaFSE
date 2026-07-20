# Cloud Fundamentals & AWS Deployment Hands-On

## Overview
This hands-on guide details cloud service models, architecture deployment patterns, and key AWS services utilized in enterprise Java full-stack applications.

## 1. Cloud Service Models

### Infrastructure as a Service (IaaS)
- **AWS EC2 (Elastic Compute Cloud)**: Virtual server instances running Amazon Linux 2 / Ubuntu.
- Security Groups acting as virtual firewalls to control inbound and outbound traffic.
- Key Pairs (.pem files) for secure SSH access.

### Platform as a Service (PaaS)
- **AWS Elastic Beanstalk**: Automated deployment, capacity provisioning, load balancing, and auto-scaling for Java applications.

### Software as a Service (SaaS)
- Fully managed software products accessed via APIs or web interfaces.

---

## 2. Core AWS Services & Configuration

### AWS EC2 & Security Groups
- **Launch Instance**: `t2.micro` / `t3.micro` instance.
- **Inbound Rules**:
  - HTTP (`80`) -> `0.0.0.0/0`
  - HTTPS (`443`) -> `0.0.0.0/0`
  - SSH (`22`) -> `My IP`
  - Custom TCP (`8080`, `8761`, `9090`) for Spring Boot Microservices.

### AWS S3 (Simple Storage Service)
- Object storage for static assets, document uploads, and backups.
- Buckets, Objects, and Storage Classes (Standard, Intelligent-Tiering, Glacier).

### AWS RDS (Relational Database Service)
- Managed MySQL / PostgreSQL DB instance setup in private subnets.
- Multi-AZ deployment for high availability and automated failover.

### AWS Serverless (Lambda & API Gateway)
- **AWS Lambda**: Event-driven serverless functions in Java 17.
- **AWS API Gateway**: REST API routes forwarding requests to Lambda functions or EC2 endpoints.
