# Front-End Automation - OpenBank

This project automates end-to-end tests for the **OpenBank** web application using Java and Cucumber. It is structured to be scalable, readable, and easily extendable to cover front-end functional scenarios.

##  Project Structure

```plaintext
front-end-automation/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── helpers/           # Reusable utility classes
│   │       └── pages/             # Page Object Model classes (e.g., OpenBankHomePage)
│   │
│   └── test/
│       ├── java/
│       │   └── scripts/           
│       │       └── OpenBankCocumber/
                    └── OpenBankHomeTestC.java # Step definitions and test scripts
│       │       ├── OpenBankTest/         
│       │           └── OpenBankHomeTest.java    
│       ├── resources/
│       │   ├── features/          # Feature files written in Gherkin 
│       │   └── texts/             # Text resources and localization bundles
│       │
│       └── reports/
│           └── cucumber-report.html  # Cucumber HTML test report
│
├── .idea/                         # IntelliJ configuration files
├── .gitignore
├── README.md                      # Project documentation
└── pom.xml / build.gradle         # Dependency and build management

```

---


## Technologies Used

- **Java**
- **Cucumber (BDD)**
- **Selenium/WebDriver**
- **IntelliJ IDEA**
- **Chrome** (as the test browser)
- **Resolution:** 1280x1024
- **Language:** es-ES
- **Platform:** Web



## Environment Variables

Some user-defined environment variables are configured in the run settings:

| Name         | Value     |
|--------------|-----------|
| Accessibility| true      |
| Application  | openb     |
| Browser      | chrome    |
| Language     | es-ES     |
| Platform     | web       |
| Provider     | local     |
| Resolution   | 1280x1024 |

## How to Run the Tests

1. Open the project in IntelliJ IDEA.
2. Select the `OpenBankTest` run configuration.
3. Click ▶️ to run the automated tests.
4. After execution, view the results in the `cucumber-report.html` file under the `reports/` folder.

## Example Test Method (POM)

Example of a method in a Page Object class:

```java
public void buttonLogin() {
    FrontEndOperation.clickWhenReady();
}
```

## Cucumber Report

Test reports generated with Maven Cucumber can be found at:

```plaintext
target/cucumber-report.html
```

## Extent Report

Test reports generated with Maven Extent Reports can be found at:

```plaintext
target/extent-report.html
```


