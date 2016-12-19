
## Java template using Spring Boot, MySQL, and Spring Security
Basic template allowing you to login  Service template using Spring Boot and persisting data using Hibernate

### Build and run
#### Configurations

Open the `application.properties` file and set your own configurations for the
database connection.

- Insert at least two different users in table 'users'.
- Insert two different roles in DB table 'roles' : ROLE_USER, ROLE_ADMIN.
- Create relation between user and roles in 'users_roles' table.

#### Prerequisites

- Java 7
- Maven 3

#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.

### Run

- Run the application and go on http://localhost:8080/
- Use the following urls to invoke controller methods and see the interactions
  with the database:
  
    * Login with a ROLE_USER user, so that you are allowed to see the home page, after that try to go to:                  `http://localhost:8080/admin/home`, you will see a not allowed message since you are not an admin user.
    
    * Logout by using this url : `http://localhost:8080/login?logout`.
    
    * Login with a ROLE_ADMIN user, and try to go to : `http://localhost:8080/admin/home`, you are allowed to see the admin home page. 
    
    
   
    
