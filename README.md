# MenuDev - Spring Boot MVC + Thymeleaf Landing Page

Applicazione demo Java 17 con architettura MVC classica e landing page pubblica renderizzata con Thymeleaf.

## Struttura del progetto

```text
menudev/
├── pom.xml
├── src/main/java/com/example/menudev
│   ├── MenudevApplication.java
│   ├── config/
│   │   └── WebConfig.java
│   ├── controller/
│   │   └── LandingPageController.java
│   ├── model/
│   │   └── Feature.java
│   └── service/
│       └── LandingPageService.java
├── src/main/resources
│   ├── application.properties
│   ├── static/css/styles.css
│   └── templates
│       ├── landing.html
│       └── fragments
│           ├── footer.html
│           └── header.html
└── src/test/java/com/example/menudev
    ├── controller/LandingPageControllerWebMvcTest.java
    └── service/LandingPageServiceTest.java
```

## Avvio applicazione

```bash
mvn spring-boot:run
```

Poi apri: `http://localhost:8080/`

## Test

```bash
mvn test
```
