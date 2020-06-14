# Contact Manager
Contact Manager Is an online **web application** which you can **create and save** easily your **contacts**. All contacts are located in a **database** and you can **edit or delete** any of your contacts!<br/><br/>
**App Language:** English<br/>
**Commits & Comments Language:** English

## About
This project is an **assignment for the lesson "Internet Applications"** at [Department of Informatics at University of Western Macedonia, Kastoria, Greece](https://cs.uowm.gr). This project was made in the time period of April - June 2020 by [Dimitrios Nasoufis](https://www.nasoufis.com).<br/>
Instructor and supervisor of this project is [Dimitrios J. Vergados](https://scholar.google.gr/citations?user=rnvB52wAAAAJ), Assistant Professor.

## Softwares & Programming Languages
- Java JDK 8
- Spring Boot
- Maven
- MySQL
- Hibernate (ORM)
- H2 In-Memory Embedded Database
- JUnit Tests 5
- HTML - CSS - JavaScript : Responsive Standars
- Thymeleaf
- Fontawesome Icons

## Programs & Management
- Eclipse
- IntelliJ IDEA
- Tomcat Java Server
- MySQL Workbench
- HeidiSQL
- Git
- GitHub
- Heroku Cloud

## Edition History
- **Version 1.00** --> 07/06/2020 --> Branch: **master**

## URLs
**GitHub Private Repository (collaborator access):** [github.com/diminaso-uowm/contact-manager](https://github.com/diminaso-uowm/contact-manager)<br/>
**GitHub Public Repository:** [github.com/diminaso-uowm/contact-manager-web](https://github.com/diminaso-uowm/contact-manager-web)<br/>
**Heroku App - Demo:** [contact-manager-web.herokuapp.com](https://contact-manager-web.herokuapp.com)

## Installation
To **run** this application in your computer you should at least have:
- Eclipse or IntelliJ IDEA
- MySQL Server (local or remote)
- Database Manager - Client (HeidiSQL, etc)

Or you can install it at [Heroku Cloud](https://www.heroku.com).

In your database manager (GUI or CLI) make a **new database** and create **2 tables**:
- contact
- contact_junit

In **"contact"** and optionally in **"contact_junit"** table create the bellow columns:
- **id** INT : PK, NN, AI, UQ
- **name** : VARCHAR(45) : NN
- **surname** : VARCHAR(45) : NN
- **phone** : VARCHAR(45) : NN
- **mobile** : VARCHAR(45) : NN
- **mail** : VARCHAR(45) : NN

Alternatively, you can paste the follow **MySQL Script**:
```
CREATE TABLE `YOUR_DATABASE_NAME`.`contact` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `mobile` VARCHAR(45) NOT NULL,
  `mail` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC));
```

Last step is to update **application.properties** file (src/main/resources) with your **database connection details**:

```
spring.datasource.url=jdbc:mysql://HOST_URL:3306/DATABASE_SCHEMA_NAME
```

```
spring.datasource.username=USERNAME_OF_DATABASE_USER
```

```
spring.datasource.password=PASSWORD_OF_DATABASE_USER
```

## Creative Commons
You are free to use this project as fork at GitHub under [CC BY 4.0](http://creativecommons.org/licenses/by/4.0/).
