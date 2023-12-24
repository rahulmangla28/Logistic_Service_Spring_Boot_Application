# Loagistic Service Application

A Spring Boot application built using PostgreSQL and Spring Data JPA to manage Logistics Services.

## 📜 Contents
- [Key Features](https://github.com/rahulmangla28/Logistic_Service_Spring_Boot_Application#-key-features)
- [Project Structure](https://github.com/rahulmangla28/Logistic_Service_Spring_Boot_Application#-project-structure)
- [Setup](https://github.com/rahulmangla28/Logistic_Service_Spring_Boot_Application#-setup)
- [API Methods](https://github.com/rahulmangla28/Logistic_Service_Spring_Boot_Application#%EF%B8%8F-api-methods-and-dependencies)
- [Contribution](https://github.com/rahulmangla28/Logistic_Service_Spring_Boot_Application#-contribution)

## 📑 Key Features
- **Java 21** : Leveraging the latest LTS version of Java, improving readability and efficiency.
- **Spring Boot 3** : An upgraded version of Spring Boot, enhancing developer productivity with its auto-configuration feature. Generated using Spring Initializr.
- **Spring Data JPA** : Simplifying the database access layer by reducing the boilerplate code.
- **PostgreSQL Database** : Integrated with PostgreSQL advanced relational database, ensuring high data consistency and integrity.

## 📝 Project Structure
  
  The project is organized into several packages, each serving a specific purpose:

  - `controller` : This package contains our Rest Controllers. Here, we expose our endpoints, following the REST architectural style. DTOs are used in this layer to define the consumption interfaces appropriately,
    avoiding the exposure of unnecessary model attributes.

  - `repository` : In this package, we handle data access using interfaces provided by Spring Data JPA.

  - `model` : where our entities are defined, using JPA (Jakarta) annotations with our PostgreSQL database.

  - `services` : where our business logic lives. Here we validate our data, handle exceptions, and manage access to our PostgreSQL database through repositories.

  - `Application.java` : This is the main class to run our project. It initializes our Spring application and connects all the components together.

## 💻 Setup

1. Make sure system has Spring Tool Suite, PostgreSQL and Postman installed.

    -  Steps to install [Spring Tool Suite](https://github.com/rahulmangla28/Logistic_Service_Spring_Boot_Application/wiki/Installation-Steps#steps-to-install-spring-tool-suite)
    -  Steps to install [PostgreSQL](https://github.com/rahulmangla28/Logistic_Service_Spring_Boot_Application/wiki/Installation-Steps#steps-to-install-postgresql)
    -  Steps to install [Postman](https://github.com/rahulmangla28/Logistic_Service_Spring_Boot_Application/wiki/Installation-Steps#steps-to-install-postman)

2. Clone the repository and import the project in Spring Tool Suite IDE.
3. Run the application on the server.
4. Open Postman for using API and set local host port (8080) and implement CRUD operations.
5. Open pgAdmin4 and analyse the database created.

## ✍️ API Methods and Dependencies
1. **Get Method**
    - ("/load") : Returns a list of all Logistics loads.
    - ("/load/{loadId}") : Return the Logistic details for the provided `loadId`.
    - ("/load/shipperId/{shipperId}") : Return a list containg information about all Logistic loads with `shipperId`.
2. **Post Method** 
    - ("/load) : Add the details of Logistic load in PostreSQL database.
3. **Put Method**
    - ("/load/{loadId}") : Update the details of Logistic load in PostreSQL database.
4. **Delete Method**
    - ("/load/{loadId}") : Delete the details of Logistic load in PostreSQL database.
  
### Dependencies
- `Spring Web WEB` : Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
- `Spring Data JPA SQL` : Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
- `PostgreSQL Driver SQL` : A JDBC and R2DBC driver that allows Java programs to connect to a PostgreSQL database using standard, database independent Java code.
- `Spring Boot DevTools DEVELOPER TOOLS` : Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
- `Lombok DEVELOPER TOOLS` : Java annotation library which helps to reduce boilerplate code.

## 🤝 Contribution

Contributions are welcomed! If you encounter any issues or have suggestions for improvements, don't hesitate to open an issue or submit a pull request.

