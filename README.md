# 🌱 Spring Boot Application with PostgreSQL 

This is a simple REST API application built using Spring Boot and PostgreSQL and Maven as the build tool.  🚀

<br>

## 🛠️ Dependencies 
The following dependencies are used in this project:
1. **Spring Boot DevTools** - For automatic application restart during development. 🔄
2. **Lombok** - To reduce boilerplate code like getters, setters, etc. ✂️
3. **PostgreSQL Driver** - To connect to the PostgreSQL database. 🗄️
4. **Spring Web** - For building REST APIs. 🌐
5. **Spring Data JPA** - For interacting with the database. 💾

<br>

## 🗄️ Database Setup 
1. Ensure you have PostgreSQL installed and running. 🖥️
2. Create a new database named `springrestapi` in your PostgreSQL instance. 📂
3. Use the following SQL query in pgAdmin's Query Tool to create the required table:

   ```sql
   CREATE TABLE user_details (
       id int,
       username varchar(100) DEFAULT NULL,
       email varchar(100) DEFAULT NULL,
       password varchar(100) DEFAULT NULL,
       PRIMARY KEY (id)
   );
   ```

<br>

## 📂 Project Structure 
The project follows the standard Spring Boot project structure:
```
src/
└── main/
    ├── java/
    │   └── com.example.restapi/  # Application's Java files
    └── resources/
        └── application.properties  # Configuration files

```

<br>

## ⚙️ Configuration 
1. Update the `application.properties` file in the `src/main/resources` folder with your database details:

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/springrestapi
   spring.datasource.username=<your_username>
   spring.datasource.password=<your_password>
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true

   spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
   ```

2. Replace `<your_username>` and `<your_password>` with your PostgreSQL credentials. 🔑   

<br>

## ▶️ Running the Application 
1. Clone the repository:

   ```bash
   git clone https://github.com/m-aryan/CRUD-REST-API.git
   cd CRUD-REST-API
   ```
2. Build the project using Maven:

   ```bash
   mvn clean install
   ```
3. Run the application:
 
   ```bash
   mvn spring-boot:run
   ```

<br>

## 📡 API Endpoints Testing
The application exposes REST API endpoints. You can use tools like Postman or cURL to test them once defined.

<br>

## 🤝 Contributing 
Feel free to contribute by submitting issues or pull requests. For major changes, please open an issue first to discuss what you would like to change.

<br>

## 📜 License 
This project is open-source and available under the [MIT License](https://raw.githubusercontent.com/m-aryan/CRUD-REST-API/refs/heads/main/LICENSE).
