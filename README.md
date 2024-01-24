 This is a simple Java project to control household expenses. This is an ongoing project to exercise recently learned concepts in Java Web Development.

 # Technologies used:
  - Java
  - SpringBoot
  - SpringDataJPA
  - SpringSecurity
  - Thymeleaf
  - MySQL

 # Structure explained
  - Entity - This Java class represents the entity in the DB. The SpringBoot annotations connects the class to the DB entity.
  - DAO - The class in this package extends the Spring Data JPA interface, providing CRUD operation to the Expense class.
  - Service - The service layer acts as a middle layer between the controller and the DAO, making it possible to escalate the application in the future by connecting more tables to more controllers. This package will have interfaces with methods to interact with the entities, and make use of the DAO interfaces to implement service methods by invoking the methods on the repository. Contains the business logic.
  - Controller - This is a Spring MVC class that handles HTTP requests. Uses the Service layer to access business logic and the DB.
