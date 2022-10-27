# Steps to Run Spring Boot Blog App
## 1. Maven Build the Project
If you have installed Maven on your machine then use the below command:
```
mvn clean package
```
If you haven't insatlled Maven on your machine then use below command:
```
./mvnw clean package
 ```
 Note: Go to root directory of the project and execute above command.
 ## 2. Create a Database
 Before running the application, you need to create the MySQL database.
 
 Use the below SQL database to create the MySQL database:
 ```sql
 create database basic
 ```
 Database name - basic
 ## 3. Run basic-app Project
 Use below command to run Spring boot application:
 ```
 mvn spring-boot:run
 ```
 Once you run Spring boot application, Hibernate will create the database tables autimatically.
 However, you can refer to DDL scritp for all tables here:

 ## 4. Insert Data
User below Insert SQL statements to insert records into roles table:
```sql
INSERT INTO `basic.roles` VALUES (1,'ROLE_ADMIN'),(2,'ROLE_USER');
```
Now, basic application is ready to use.
