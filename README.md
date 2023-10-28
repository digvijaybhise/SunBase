# User_Management_System

<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>
Our Spring-based API simplifies user data management. It enables users to easily perform Create, Read, Update, and Delete operations while incorporating essential login validations for a secure and efficient experience.
---
<br>

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Model
* ### Employee
```
Id : unique identifier for each user
firstName : first of the user
lastName : last of the user
address : address of the user
city : city of the user
state : state of the user
email : user email
password : user password
phoneNumber : number of the user
```
---

## Data Flow

```
The employee sends a request to the application through the API endpoints.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The API receives the request and sends it to the appropriate controller method.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The controller method makes a call to the method in service class.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
```

<center>
<font color="blue">
&#8595;</font>
<center>

```
The controller method returns a response to the API.
```
<center>
<font color="blue">
&#8595;</font>
<center>

```
The API sends the response back to the user.
```

---

## API Endpoints :-
### Employee

* GetMapping: "/user"
```
We get the list of all the users present in the database.
```

* PostMapping: "/user"
```
In database we add a new user given through API.
```
* PutMapping: "/user/{userEmail}/{token}"
```
In database we update a user by userEmail and the Token given through API.
```
* DeleteMapping "/user/{userEmail}"
```
In database we delete a user by user Email given through API.
```

---

## DataBase Used
* MySQL
```
We have used MySQL as a database to implement CRUD Operations.
```
---

## Project Summary

The User Management System powered by Spring Boot is a revolutionary application that redefines user data management. It seamlessly integrates efficiency and simplicity, offering a user-friendly interface for tasks like data manipulation and personal details updates. Key features include robust security measures, simplified CRUD operations, personalization options, and seamless integration into existing systems. The system prioritizes user empowerment, ensuring hassle-free navigation and fostering a positive interaction environment. 
