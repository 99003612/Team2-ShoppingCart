**About**


This is a full-stack Online Shop web application for practicing Spring Boot 4 and Hibernate 5. The idea was to build an E-shopping cart web application for Grocery Shopping.
There is a login and registration functionality included. Each user will have their own shopping cart which includes session functionality. 


**Prerequisites**

- Java
- Maven 
- MySQL
- Spring Boot
- Hibernate
- HTML , CSS & Javascript
- JPA


**Configuration Files**


Folder src/resources, contains config files for Shopping Cart Spring Boot application.
- src/resources/application.propeties
- main configuration file. One can change MySQL url, username and password bean properties with host computer`s MySQL url, username and password.


**Features**

- Registration: User will enter details like First and Last name, Email Id, Password, Contact number and Date of Birth and register themself.
- Login: User will login themselves using Email and Password which they registered themselves with.
- Home Page: This page has links to Add Customer, Items or Log Themselves out of the applictaion.
- Add Customer: Admin can add customers by filling in customer's name and Contact details.
- Items: Items can be Added, Updated, Deleted from cart. Also, one can check stock value.
- Customer: Customer can Shop watches, Check Items in stock, Update stock and delete selected items.
- Bill: Customer can add Item name, Price and Quantity.
- Payment: After Bill generation, customer can fill in Shipping Address and Card Details, and checkout.

**Guidelines To Run Project:**


- Download the project and open in Eclipse JAVA EE. 
- Need JRE 1.8 or above. 
- Configure Build Path
- If it opens up as JAVA projects, Right-click the project and select Configure > Convert to Maven Project. Complete the Maven POM dialog. Click Finish to complete the dialog. Update the project.
- Go to "application.properties" file and replace MySQL url, username and password bean properties with host computer`s MySQL url, username and password.
- Run the provided SQL script to get the database with populated values on host machine. 
- Update the pom.xml and maven dependencies to download all the required libraries. 
- To run the project, Right-click the project and select Run As > Select Spring Boot App

Note: The backend API url is configured in src/environments/environment.ts of the frontend project. It is localhost:8080 by default.

**Folder Structure**
```
 
Team_2_ShoppingCart_Final
├── design
│   └── Behavioural Diagrams
|   └── Structural Diagrams
├── src
│   └── main
│       ├── java/com/ltts
│       │   ├── shoppingcart/Entity
│       │   ├── shopping
│       │   │   ├── config
│       │   │   ├── model
│       │   │   ├── pagination
│       │   │   ├── repository
│       │   │   ├── service
│       │   │   └── web
│       ├── resources
│       │       ├── static
│       │       ├── templates
│       │       └── application.properties
│   └── test/java/net/javaguides/springboot
├── target
│   └── classes
│       ├── META-INF
│       ├── com/ltts
│       ├── static
│       ├── templates
│       └── application.properties
└── pom.xml
```

## System Level Diagram

![System Level Diagram](https://github.com/PS99003587/Team-2-Shopping-Cart-Project/blob/main/Team_2_ShoppingCart_Final/design/System%20Level%20Design.png)

## Test Plans

**Test cases for Login and Registraton form**

- Positive Test Cases

|No.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|A user clicks on Register Here Button|Registration form opens up|Successful|
|2|User enters details in correct format|Registration is successful and the data is stored in the database|Successful|
|3|After Successful registration, user clicks the Login Here button |Login form opens|Successful|
|4|Enters registration details in correct format|User is successfully logged in and Home Page opens up|Successful|

- Negative Test Cases

|No.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|User tries to register with invalid credentials i.e. quantity of characters allowed, password requirements, Email format |Shows Error|Successful|
|2|User tries to sign up with invalid Email Id or Password|Could not login|Successful|
|3|Enters invalid credentials in the login page |Shows exception and asks user to sign up first|Successful|

**Test cases for Add Customer form:**

|NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|User Enters Customer details and click on Add Customer |Customer is added and data stored in database|Successful|
|2|User clicks on Back button|Home page opens up|Successful|

**Test cases for Add Customer form:**

|NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|User Enters Customer details and click on Add Customer button |Customer is added and data is stored in database|Successful|
|2|User clicks on Back button|Home page opens up|Successful|

**Test cases for Update Customer form:**

|NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|User Enters Customer details and click on Update Customer button|Customer is added and data is updated in database|Successful|
|2|User clicks on Back button|Home page opens up|Successful|

**Test cases for Customer Shopping form:**

|NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|User Enters details and click on Submit button |Items are added to cart|Successful|
|2|User clicks on Back button|Home page opens up|Successful|

**Test cases for Checkout form:**

|NO.|Test Case|Expected Result|Test Result|
| - | - | - | - |
|1|User Enters all the details and click on Continue to checkout|Redirected to the Success Page and buyer data is stored in the database|Successful|
