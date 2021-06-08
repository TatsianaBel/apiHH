
**API Testing Framework for hh.ru**

This Framework is designed for Backend Testing of Webservices using Java with RestAssured and TestNG utilizing Maven as dependency management tool. Data Driven Test strategy is used to design and execute tests utilizing TestNG Data Providers.

**Technology Stack**
* Java
* TestNG
* Maven
* RestAssured

*Project Structure:*

* adapter: This package contains all the required requests, RequestSpecification.
* constant: This package contains all the required constants of services.
* resources: This directory contains TestNG Data Provider data and JSON validation Schemes 
* model: This directory contains all the response pojos of each json placeholder endpoint
* util: This package contains Utility Classes
* tests: This directory contains test cases for endpoint

Test Report
Run the following command in Terminal to execute Allure reports.
*mvn allure:serve*