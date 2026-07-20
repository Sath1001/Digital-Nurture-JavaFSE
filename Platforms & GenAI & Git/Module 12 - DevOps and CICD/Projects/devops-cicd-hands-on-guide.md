# Module 12: DevOps and CI/CD Hands-On Guide

## Overview
This guide covers DevOps principles, Continuous Integration (CI), Continuous Deployment (CD), and automated build pipeline configurations using Jenkins and GitHub Actions.

## 1. Core DevOps Principles
- **Continuous Integration (CI)**: Frequently committing code to a shared repository and automatically running automated builds and unit tests.
- **Continuous Delivery / Deployment (CD)**: Automatically building, testing, and deploying validated artifacts to staging or production environments.

## 2. Sample Jenkins Pipeline (Jenkinsfile)

```groovy
pipeline {
    agent any

    tools {
        maven 'Maven-3.9.16'
        jdk 'Java-17'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Sath1001/Digital-Nurture-JavaFSE.git'
            }
        }
        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }
    }
}
```
