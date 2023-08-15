# Проект "Spring-Security Part 1"

Цей проект реалізований в рамках навчання на курсі [MateAcademy](https://mate.academy/learn?course=all_courses).У ньому я використовував різні технології та принципи програмування для створення функціональної аплікації.

## Вимоги

Перед початком роботи з проектом, переконайтеся, що у вас встановлені наступні компоненти:
- Java Development Kit (JDK)
- Maven
- Git

## Як інсталювати проєкт
1. Склонуйте репозиторій:
```bash
git clone https://github.com/RostyslavOnysh/my-taxi-service.git
```
Проект буде доступний за адресою http://localhost:8080.


# Принципи SOLID
****У цьому проекті дотримані всі принципи SOLID:***
1. Single Responsibility Principle (Принцип єдиного обов'язку)
2. Open/Closed Principle (Принцип відкритості/закритості)
3. Liskov Substitution Principle (Принцип підстановки Лісков)
4. Interface Segregation Principle (Принцип розділення інтерфейсу)
5. Dependency Inversion Principle (Принцип інверсії залежностей)

# Валідація електронної пошти та паролю
Проект включає в себе валідацію електронної пошти та порівняння паролів. Для валідації електронної пошти використовується кастомна анотація @Email, а для порівняння паролів - анотація @MatchPassword. Деталі можна знайти у відповідних класах.

# EmailValidator

Клас EmailValidator використовується для валідації електронної пошти. Анотація @Email використовується для позначки методів, які приймають електронні адреси. Метод validate() використовується для валідації електронної адреси.

# PasswordMatcher

Клас PasswordMatcher використовується для порівняння паролів. Анотація @MatchPassword використовується для позначки методів, які приймають паролі. Метод matches() використовується для порівняння двох паролів.

# Технології

У цьому проекті були використані такі технології та інструменти:

Spring Framework
Spring Security
Hibernate
Maven

# Connection class 
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

# Автор
[Ros]
Email: [rostyslavonyshchenko@gmail.com]

# Ліцензія

Цей проект поширюється під ліцензією MIT.

Ви можете внести зміни у цей файл README.md згідно зі специфікаціями вашого проекту, включивши в нього відповідні деталі, опис функціональності, посилання на документацію та інше.

# Не забудьте замінити [Назва Вашого Проекту], [ваш-користувач], [назва-репозиторію], [Ваше Ім'я], та [Ваша Електронна Пошта] на відповідні дані.
