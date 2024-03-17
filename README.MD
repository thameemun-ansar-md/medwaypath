# MEDWAYPATH Documentation

## Medwaypath Project Overview

The Medwaypath project is divided into four modules, each serving a specific purpose in the application architecture:

## 1. Medwaypath Specifications

The `medwaypath-specifications` module contains the API layer of the application. It defines the API contract using the OpenAPI Specification (OAS) format. This module is responsible for documenting the RESTful endpoints, request/response schemas, and example usage scenarios.

## 2. Medwaypath Core

The `medwaypath-core` module contains the core business logic of the application. It encapsulates the application's domain-specific logic, including data processing, validation, and manipulation. This module serves as the heart of the application, orchestrating the interactions between different components.

## 3. DAL (Data Access Layer)

The `dal` module is responsible for data access-related operations. It encapsulates database interactions, including CRUD (Create, Read, Update, Delete) operations, using technologies such as JPA (Java Persistence API) or JDBC (Java Database Connectivity). This module abstracts away the details of data storage, providing a clean and consistent interface for accessing and manipulating data.

## 4. Medwaypath Common

The `medwaypath-common` module contains shared code and utilities that are used across different parts of the application. It includes reusable components, helper functions, and constants that are shared among multiple modules. This module promotes code reusability, maintainability, and consistency across the application.

## Project Structure

The project follows a modular structure, with each module organized into its own directory within the repository. Here's an overview of the project structure:


## Introduction

This project follows an API-first design approach, where the API contract is defined before implementing the backend logic. This approach ensures clear communication between stakeholders, promotes a consistent API design, and facilitates collaboration between frontend and backend teams.

## API Definition

The API contract is defined using the OpenAPI Specification (OAS) version X.X.X. The OpenAPI Specification is a widely adopted industry standard for describing RESTful APIs.

The API specification file is located at [medwaypath-specifications/src/main/resources]. This folder contains detailed documentation of all API endpoints, request/response schemas, parameters, and example usage.

## Tools Used

- [OpenAPI Generator](https://openapi-generator.tech/): Used to generate server stubs and client SDKs from the OpenAPI specification file.
- [Swagger Editor](https://editor.swagger.io/): Used for editing and validating the OpenAPI specification file. It provides real-time feedback on the validity and structure of the API contract.