# Project "Spring-Security Part 1" 📝📖 (ENG)

This project is implemented within the framework of learning on the MateAcademy course. It involves the use of various technologies and programming principles to create a functional application.

# Project Description 🚀 ✈️

1. Spring Security Configuration with In-Memory Authentication: All user authentication settings are stored in the program's memory. Authorization is required to access protected resources.
2. Usage of Annotations such as @NonNull, @Min, etc.: Annotations are added to the code for more accurate data validation. Depending on the context, annotations like @NonNull, @Min, and others are used.
3. Custom Email Validation Implementation: Custom logic is added for validating email addresses. It checks the correct email format according to established rules.
4. CustomGlobalExceptionHandler Implementation: A global handler is introduced to handle exceptional situations, ensuring proper JSON error responses with established error status.
5. Usage of passwordEncoder for Password Hashing: The login() method in AuthenticationService and salt usage in the User entity have been removed. Instead, password hashing is done using the passwordEncoder in UserService when adding a user.
6. Addition of repeatPassword Field in UserRequestDto: The UserRequestDto now includes a repeatPassword field, used to ensure password and repeat password match.
7. Validation of Password Match: Validation is added to ensure that the password and repeat password match.
8. Handling DataProcessingException in CustomGlobalExceptionHandler: In case of a DataProcessingException, the global handler sets the response status to 500 and returns a JSON response.
9. 
# Requirements ‼️
Before starting work on the project, make sure you have the following components installed:

🔺 Java Development Kit (JDK) version 11 or higher.
🔺 Maven (4.0.0): Tool for project building and dependency management.
🔺 Git
🔺 MySQL: Database used for data storage.
🔺 Properly configured pom.xml file containing the following dependencies :
  1. spring-context
  2. spring-orm
  3.spring-webmvc
  4.commons-dbcp2
  5.hibernate-core
  6.hibernate-java8
  7.mysql-connector-java
  8. javax.servlet-api
  9. jackson-databind
  10. jackson-datatype-jsr310
  11. hibernate-validator
  12. spring-security-core
  13. spring-security-config
  14. spring-security-web
  ```xml
   <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-orm</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-dbcp2</artifactId>
            <version>2.8.0</version>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>${hibernate.version}</version>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-java8</artifactId>
            <version>${hibernate.version}</version>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.22</version>
        </dependency>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>4.0.1</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.14.1</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.datatype</groupId>
            <artifactId>jackson-datatype-jsr310</artifactId>
            <version>2.13.0</version>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-validator</artifactId>
            <version>6.1.6.Final</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-core</artifactId>
            <version>5.5.0</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-config</artifactId>
            <version>5.5.0</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-web</artifactId>
            <version>5.5.0</version>
        </dependency>

    </dependencies>
  ```
### For the detailed pom.xml file, you can find it in the project folder 📕.

# How to Install the Project 🔺

Clone the repository:
```bash
git@github.com:RostyslavOnysh/Spring-Security.git
```
The project will be available at http://localhost:8080

# SOLID Principles ℹ️

* All SOLID principles are followed in this project:

1. Single Responsibility Principle
2. Open/Closed Principle
3. Liskov Substitution Principle
4. Interface Segregation Principle
5. Dependency Inversion Principle
# Email and Password Validation 🔧

The project includes email validation and password matching. For email validation, a custom annotation @Email is used, and for password matching, @MatchPassword annotation is used. Details can be found in respective classes.

# EmailValidator 🔨

The EmailValidator class is used for email validation. The @Email annotation is used to mark methods that accept email addresses. The validate() method is used for email address validation.

# PasswordMatcher ✒️

The PasswordMatcher class is used for password matching. The @MatchPassword annotation is used to mark methods that accept passwords. The matches() method is used for comparing two passwords.

# Connection class 📡

db.properties
To use the program correctly, you must replace the fields in the db.properties file:
```xml
 
db.driver=com.mysql.cj.jdbc.Driver
db.url=jdbc:mysql:YOUR_DB_ADDRESS
db.user=USERNAME
db.password=PASSWORD

#Hibernate properties
hibernate.show_sql=true
hibernate.hbm2ddl.auto=create
hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
# Author ♨️

[Ros]
Email: [rostyslavonyshchenko@gmail.com]

# License ☑️

This project is distributed under the MIT License.

You can modify this README.md file according to your project's specifications, including relevant details, functionality descriptions, documentation links, and more.

*Don't forget to replace [Your Project Name], [your-username], [repository-name], [Your Name], and [Your Email] with your actual information.*







# Проект "Spring-Security Part 1" 📝📖 (UA)

Цей проект реалізований в рамках навчання на курсі [MateAcademy](https://mate.academy/learn?course=all_courses).У ньому я використовував різні технології та принципи програмування для створення функціональної аплікації.

#   Опис проекту 🚀 ✈️
- Конфігурація ***Spring Security*** з інмеморі аутентифікацією: Всі налаштування для аутентифікації користувачів зберігаються в пам'яті програми. Для доступу до захищених ресурсів потрібно авторизуватися.
- Використання аннотацій ***@NonNull, @Min*** та інші: В коді додані аннотації для більш точної валідації даних. Залежно від контексту, додані аннотації, такі як @NonNull, @Min тощо.
- Реалізація власної валідації електронної пошти: Додана власна логіка для валідації електронних адрес. Перевіряється правильність формату електронної пошти згідно встановлених правил.
- Реалізація ***CustomGlobalExceptionHandler:*** Для обробки виняткових ситуацій введений глобальний обробник, який забезпечує коректну відповідь на помилки у форматі JSON з встановленою статус-помилкою.
- Використання passwordEncoder для хешування паролів: Метод login() у AuthenticationService та використання солі у сутності User були видалені. Замість цього, для хешування паролів використовується ***passwordEncoder*** у UserService під час додавання користувача.
- Додавання поля repeatPassword в UserRequestDto: В UserRequestDto додане поле repeatPassword, яке використовується для перевірки, що пароль та повторений пароля співпадають.
- Валідація паролей на співпадіння: Додана валідація для переконання, що пароль та повторений пароль відповідають одне одному.
- Обробка ***DataProcessingException*** в *CustomGlobalExceptionHandler:* При виникненні винятку DataProcessingException, глобальний обробник встановлює статус відповіді на 500 та повертає ***JSON***-відповідь.

##  Вимоги ‼️

Перед початком роботи з проектом, переконайтеся, що у вас встановлені наступні компоненти:
- 🔺 Java Development Kit (JDK) версії 11 або вище.
- 🔺 Maven (4.0.0): інструмент для збирання проекту та управління залежностями.
- 🔺Git
- 🔺MySQL : база даних, використана для зберігання даних.
- 🔺Коректно сконфігурований pox.xml file який повинен містити такі залежності
  1. spring-context
  2. spring-orm
  3.spring-webmvc
  4.commons-dbcp2
  5.hibernate-core
  6.hibernate-java8
  7.mysql-connector-java
  8. javax.servlet-api
  9. jackson-databind
  10. jackson-datatype-jsr310
  11. hibernate-validator
  12. spring-security-core
  13. spring-security-config
  14. spring-security-web
  ```xml
   <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-orm</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>${spring.version}</version>
        </dependency>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-dbcp2</artifactId>
            <version>2.8.0</version>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>${hibernate.version}</version>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-java8</artifactId>
            <version>${hibernate.version}</version>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.22</version>
        </dependency>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>4.0.1</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.14.1</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.datatype</groupId>
            <artifactId>jackson-datatype-jsr310</artifactId>
            <version>2.13.0</version>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-validator</artifactId>
            <version>6.1.6.Final</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-core</artifactId>
            <version>5.5.0</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-config</artifactId>
            <version>5.5.0</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-web</artifactId>
            <version>5.5.0</version>
        </dependency>

    </dependencies>
  ```
  ## Більш детальний pom.xml file ви можете знайти в папці з проєктом.📕 

## Як інсталювати проєкт 🔺
1. Склонуйте репозиторій:
```bash
  git@github.com:RostyslavOnysh/Spring-Security.git
```
Проект буде доступний за адресою ***http://localhost:8080***


# Принципи SOLID ℹ️
****У цьому проекті дотримані всі принципи SOLID:***
1. Single Responsibility Principle (Принцип єдиного обов'язку)
2. Open/Closed Principle (Принцип відкритості/закритості)
3. Liskov Substitution Principle (Принцип підстановки Лісков)
4. Interface Segregation Principle (Принцип розділення інтерфейсу)
5. Dependency Inversion Principle (Принцип інверсії залежностей)

# Валідація електронної пошти та паролю 🔧
Проект включає в себе валідацію електронної пошти та порівняння паролів. Для валідації електронної пошти використовується кастомна анотація ***@Email***, а для порівняння паролів - анотація ***@MatchPassword***. Деталі можна знайти у відповідних класах.

# EmailValidator 🔨

Клас ***EmailValidator*** використовується для валідації електронної пошти. Анотація ***@Email*** використовується для позначки методів, які приймають електронні адреси. Метод validate() використовується для валідації електронної адреси.

# PasswordMatcher ✒️

Клас PasswordMatcher використовується для порівняння паролів. Анотація ***@MatchPassword*** використовується для позначки методів, які приймають паролі. Метод ***matches()*** використовується для порівняння двох паролів.


# Connection class 📡
* db.properties
  Для коректного використання програми ви повинні замінити поля файлу *db.properties*
```xml
db.driver=com.mysql.cj.jdbc.Driver
db.url=jdbc:mysql:YOUR_DB_ADRESS
db.user=USERNAME
db.password=PASSWORD

#Hibernate properties
hibernate.show_sql=true
hibernate.hbm2ddl.auto=create
hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

# Автор ♨️
[Ros]
Email: [rostyslavonyshchenko@gmail.com]

#  Ліцензія ☑️

Цей проект поширюється під ліцензією MIT.

Ви можете внести зміни у цей файл README.md згідно зі специфікаціями вашого проекту, включивши в нього відповідні деталі, опис функціональності, посилання на документацію та інше.

# Не забудьте замінити [Назва Вашого Проекту], [ваш-користувач], [назва-репозиторію], [Ваше Ім'я], та [Ваша Електронна Пошта] на відповідні дані.
