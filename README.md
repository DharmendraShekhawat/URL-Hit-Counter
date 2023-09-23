# <h1 align = "center"> User Management System Using Spring_Boot </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.1.3-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

---

<p align="left">

<!-- Project Description -->
## Overview
<p align="center">This project, named "URL Hit Counter" is a robust Spring Boot application designed for managing user data efficiently. It provides a set of API endpoints that allow you to perform various operations on user records, such as adding, retrieving, updating, and deleting user information. 
</p>

<!-- Table of Contents -->
## Table of Contents
1. [Technologies Used](#technologies-used)
2. [Key Features](#key-features)
3. [Usage](#usage)
4. [API reference](#api-reference)
5. [License](#license)
6. [Acknowledgments](#acknowledgments)
7. [Contact](#contact)

<!-- Technologies Used -->
## Technologies Used
- Java 20
- Spring Boot
- Spring Web Initializer
- Maven
- Spring Web Dependency

<!-- Key Features -->
## Key Features
- Hit URL
- Get URL Hit Total Count.
- Get URL Hit Total Count With Particular User.

<!-- Usage -->
## Usage
- Access the application at `http://localhost:8080`.
- Use the provided API endpoints to manage your URL Hit Counter.

### Controller:
- It consists of a class named APIController which basically controls the flow of data.
- @RestController annotation is used to make the APIController as a controller layer.
- We perform the CRUD operations such as @PostMapping , @GetMapping , @PutMapping , @DeleteMapping.

### API Reference

#### Add Hits :
POST Method :  http://localhost:8080/url


#### Get All Hits:
 - GET Method : http://localhost:8080/url/count

 #### GET Count BY UserName :
 - GET Method :   http://localhost:8080/url/count/userName/{myName}


 <!-- Acknowledgments -->
## Acknowledgments
- Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

<!-- Contact -->
## Contact
For questions or feedback, please contact : Dharmendra Singh Shekhawat  
- Maild Id : dharmendrashekhawat1403@gmail.com

<h1 align="center">Thank You...<h1>
<h3 align = "center"> ***********************************************************<h3>