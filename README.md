# **Домашнее задание на должность "Junior QA инженер"**

#### **Стек проекта**

Selenide, Java11, Maven, Allure

#### **Как запустить**

**Запустить тесты через Google Chrome:**
```shell
mvn clean test -D selenide.browser=chrome allure:report
```
```shell
mvn clean test -D selenide.browser=chrome allure:serve
```

**Запустить тесты через Yandex Browser:**
```shell
mvn clean test -D selenide.browser=yandex allure:report
```
```shell
mvn clean test -D selenide.browser=yandex allure:serve
```

**Запустить тесты через Microsoft Edge:**
```shell
mvn clean test -D selenide.browser=edge allure:report
```
```shell
mvn clean test -D selenide.browser=edge allure:serve
```

**Запустить тесты через Mozilla Firefox:**
```shell
mvn clean test -D selenide.browser=firefox allure:report
```
```shell
mvn clean test -D selenide.browser=firefox allure:serve
```

## **Техническое задание**

Написать ui тесты на проверку работы функциональности страницы входа в систему. 
Страница входа расположена по адресу https://lmslite47vr.demo.mirapolis.ru/mira

### **Требования**

* Реализовать нужно на языке Java. Версию можно использовать любую.
* Для сборки проекта можно использовать maven или gradle.
* Нужно использовать библиотеку selenium-api или selenide или selenide-java.
* Количество тестов вы должны определить сами. 
* Тесты должны запускаться через junit или testng, не через main

