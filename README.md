# 📝📖 Проект "Spring-Security Part 1" 

Цей проект реалізований в рамках навчання на курсі [MateAcademy](https://mate.academy/learn?course=all_courses).У ньому я використовував різні технології та принципи програмування для створення функціональної аплікації.

# 🚀 ✈️  Опис проекту 
- Конфігурація ***Spring Security*** з інмеморі аутентифікацією: Всі налаштування для аутентифікації користувачів зберігаються в пам'яті програми. Для доступу до захищених ресурсів потрібно авторизуватися.
- Використання аннотацій ***@NonNull, @Min*** та інші: В коді додані аннотації для більш точної валідації даних. Залежно від контексту, додані аннотації, такі як @NonNull, @Min тощо.
- Реалізація власної валідації електронної пошти: Додана власна логіка для валідації електронних адрес. Перевіряється правильність формату електронної пошти згідно встановлених правил.
- Реалізація ***CustomGlobalExceptionHandler:*** Для обробки виняткових ситуацій введений глобальний обробник, який забезпечує коректну відповідь на помилки у форматі JSON з встановленою статус-помилкою.
- Використання passwordEncoder для хешування паролів: Метод login() у AuthenticationService та використання солі у сутності User були видалені. Замість цього, для хешування паролів використовується ***passwordEncoder*** у UserService під час додавання користувача.
- Додавання поля repeatPassword в UserRequestDto: В UserRequestDto додане поле repeatPassword, яке використовується для перевірки, що пароль та повторений пароля співпадають.
- Валідація паролей на співпадіння: Додана валідація для переконання, що пароль та повторений пароль відповідають одне одному.
- Обробка ***DataProcessingException*** в *CustomGlobalExceptionHandler:* При виникненні винятку DataProcessingException, глобальний обробник встановлює статус відповіді на 500 та повертає ***JSON***-відповідь.

## ‼️ Вимоги

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
  ## 📕 Більш детальний pom.xml file ви можете знайти в папці з проєктом.

## Як інсталювати проєкт
1. Склонуйте репозиторій:
```bash
  git@github.com:RostyslavOnysh/Spring-Security.git
```
Проект буде доступний за адресою ***http://localhost:8080***


# ℹ️  Принципи SOLID
****У цьому проекті дотримані всі принципи SOLID:***
1. Single Responsibility Principle (Принцип єдиного обов'язку)
2. Open/Closed Principle (Принцип відкритості/закритості)
3. Liskov Substitution Principle (Принцип підстановки Лісков)
4. Interface Segregation Principle (Принцип розділення інтерфейсу)
5. Dependency Inversion Principle (Принцип інверсії залежностей)

# 🔧 Валідація електронної пошти та паролю
Проект включає в себе валідацію електронної пошти та порівняння паролів. Для валідації електронної пошти використовується кастомна анотація ***@Email***, а для порівняння паролів - анотація ***@MatchPassword***. Деталі можна знайти у відповідних класах.

# 🔨 EmailValidator

Клас ***EmailValidator*** використовується для валідації електронної пошти. Анотація ***@Email*** використовується для позначки методів, які приймають електронні адреси. Метод validate() використовується для валідації електронної адреси.

# ✒️ PasswordMatcher

Клас PasswordMatcher використовується для порівняння паролів. Анотація ***@MatchPassword*** використовується для позначки методів, які приймають паролі. Метод ***matches()*** використовується для порівняння двох паролів.


# 📡 Connection class 
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

# ♨️Автор
[Ros]
Email: [rostyslavonyshchenko@gmail.com]

# ☑️ Ліцензія

Цей проект поширюється під ліцензією MIT.

Ви можете внести зміни у цей файл README.md згідно зі специфікаціями вашого проекту, включивши в нього відповідні деталі, опис функціональності, посилання на документацію та інше.

# Не забудьте замінити [Назва Вашого Проекту], [ваш-користувач], [назва-репозиторію], [Ваше Ім'я], та [Ваша Електронна Пошта] на відповідні дані.
