# Generative AI & GitHub Copilot Hands-On Guide

## Overview
This hands-on guide covers fundamental Generative AI concepts, prompt engineering techniques, and practical usage of GitHub Copilot for Java Full Stack development.

## 1. Prompt Engineering Techniques

### Zero-Shot Prompting
Providing direct instructions without any examples.
*Example:*
> "Write a Java method that accepts a string list and returns unique elements sorted alphabetically."

### Few-Shot Prompting
Providing one or more input-output examples before the target instruction.
*Example:*
> "Convert the following JSON field names from camelCase to snake_case:
> Input: firstName -> Output: first_name
> Input: dateOfBirth -> Output: date_of_birth
> Input: employeeId -> Output: employee_id"

### Chain-of-Thought Prompting
Instructing the model to reason through problem steps explicitly before generating code.
*Example:*
> "Step 1: Check if input array is null or empty.
> Step 2: Filter even numbers using streams.
> Step 3: Map numbers to their squares.
> Step 4: Collect into a list and return."

---

## 2. GitHub Copilot Integration & Features

### Core Capabilities
- **Code Completion**: Pressing `Tab` to accept context-aware inline code suggestions.
- **Automated Unit Tests**: Generating JUnit 5 & Mockito unit tests from existing service classes.
- **Code Refactoring**: Optimizing loops with Java Streams and reducing boilerplate code.
- **Documentation**: Generating Javadoc comments and REST endpoint documentation.

### Responsible AI Usage & Security
- Verifying AI-generated code against security vulnerabilities (e.g., SQL injection, insecure deserialization).
- Data privacy awareness and avoiding inclusion of sensitive API credentials in prompts.
