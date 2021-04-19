# Team2-ShoppingCart

TEAM 2 - SHOPPING CART USING SPRING BOOT AND HIBERNATE


Java CI | Feature Branch | Code Quality Score | Code Grade |  Git Inspector | Check-Style Action
--------|----------------|--------------------|------------|----------------|---------------------------------------------------
[![Java CI Workflow](https://github.com/99003612/Team2-ShoppingCart/actions/workflows/JavaCI.yml/badge.svg)](https://github.com/99003612/Team2-ShoppingCart/actions/workflows/JavaCI.yml)| [![Feature Branch](https://github.com/99003612/Team2-ShoppingCart/actions/workflows/maven-feature.yml/badge.svg)](https://github.com/99003612/Team2-ShoppingCart/actions/workflows/maven-feature.yml)|![code quality score](https://www.code-inspector.com/project/20643/score/svg) | ![code grade](https://www.code-inspector.com/project/20643/status/svg) | [![.github/workflows/Git Inspector.yml](https://github.com/khanith/shopping-cart/actions/workflows/Git%20Inspector.yml/badge.svg)](https://github.com/khanith/shopping-cart/actions/workflows/Git%20Inspector.yml)|[![.github/workflows/check-style-action.yml](https://github.com/99003612/Team2-ShoppingCart/actions/workflows/check-style-action.yml/badge.svg)](https://github.com/99003612/Team2-ShoppingCart/actions/workflows/check-style-action.yml)


# Folder Structure

Folder |  Description
------------- | -------------
1 *shoppingcart* | Demo Project implementing Front-end for Items in Shopping Cart
2 *Team_2_ShoppingCart*  | Demo Project implementing Login and Registration for the Shopping Cart
3 *Team_2_ShoppingCart_Final* | Final Shopping Cart Project using Spring Boot and Hibernate.
4 *Requirements* | Objectives and Requirements.
5 *Test Plans* | Positive and Neative Test Cases for diffrent modules.

# Contributors List
Name                     |  PS No.   | Features                                                         | Issues Raised             | Issues Resolved
-------------------------|-----------|------------------------------------------------------------------|---------------------------|-----------------------------------------------
`1) Abhishek Vithal`     | 99003612  |Front-End Implementation and Microservices using Eureka Server                  | on registration           | Registration issues are resolved
`2) Kricha Sahu`         | 99003587  |Database Conectivity and RestFUL Web Services                | on front-end operations   | Front-end application issues are resolved
`3) Shaloo Kumari`       | 99003603  |Eureka Server and Hibernate and MYSQL Database                                 | on database connectivity  | Database Connectivity is running efficiently
`4) Polimera Sai Khanith`| 99003599  |Login and Registration and Payment and Checkout Web Page     | on microservices          | MicroServices issue is resolved
`5) Akash Singh`         | 99003615  |Back-End Application and Session Management and Billing and Linking of Front-End and Back-End     | on restful web sevices    | RestFul Web Services issues are resolved


#### E-Shopping Cart Website Screenshots

* Login Page 
![login](https://user-images.githubusercontent.com/32004729/113093312-497b9c80-920d-11eb-8577-a68bc4ec4a56.PNG)


* Registration Page
![registration](https://user-images.githubusercontent.com/32004729/113093370-62844d80-920d-11eb-834b-d2fa8c697b09.PNG)


* Home Page
![homepage](https://user-images.githubusercontent.com/32004729/113093433-7d56c200-920d-11eb-8acb-91d27078cbab.PNG)


* Add Customer Form
![customerform](https://user-images.githubusercontent.com/32004729/113093464-9a8b9080-920d-11eb-9c25-d7db7fde004f.PNG)


* Update Customer Form
![updatecustomerform](https://user-images.githubusercontent.com/32004729/113094938-36b69700-9210-11eb-967f-caae5db490f6.PNG)


* Delete Customer Form
![deletecustomer](https://user-images.githubusercontent.com/32004729/113094980-4b932a80-9210-11eb-8dd8-1dc436b0f1bf.PNG)


* Add Item Form
![additemform](https://user-images.githubusercontent.com/32004729/113093676-fc4bfa80-920d-11eb-95ac-2a86bed16e74.PNG)


* Delete Item
![deleteitems](https://user-images.githubusercontent.com/32004729/113095032-61085480-9210-11eb-8ae0-e09aeb070ba3.PNG)


* Update Item Form
![updateitemform](https://user-images.githubusercontent.com/32004729/113093989-8c8a3f80-920e-11eb-8284-e7d40b861ec7.PNG)


* Customer Shopping Form
![customershoppingform](https://user-images.githubusercontent.com/32004729/113094074-af1c5880-920e-11eb-8991-1c5765732092.PNG)


* Customer Shopping BILL
![customershoppingbill](https://user-images.githubusercontent.com/32004729/113094139-ceb38100-920e-11eb-938e-fa827271d122.PNG)


* Payment or (Checkout Form)
![checkoutform](https://user-images.githubusercontent.com/32004729/113094872-1a1a5f00-9210-11eb-8324-2da79cde4354.PNG)


# High Level Design

## Class Diagram

![Class Diagram](https://github.com/PS99003587/Team-2-Shopping-Cart-Project/blob/main/Team_2_ShoppingCart_Final/design/Structural%20Diagrams/Class%20Diagram.png)

# Low Level Design

## Sequence Diagram 

![Sequence Diagram](https://github.com/PS99003587/Team-2-Shopping-Cart-Project/blob/main/Team_2_ShoppingCart_Final/design/Behavioral%20Diagram/Sequence%20Diagram%20for%20online%20customer.png)

## State Diagram

![State Diagram](https://github.com/PS99003587/Team-2-Shopping-Cart-Project/blob/main/Team_2_ShoppingCart_Final/design/Behavioral%20Diagram/State%20Diagram%20for%20Customer.png)

## Collaboration Diagram

![Collaboration Diagram](https://github.com/PS99003587/Team-2-Shopping-Cart-Project/blob/main/Team_2_ShoppingCart_Final/design/Structural%20Diagrams/Collaboration%20Diagram%20for%20user%20registration.png)

## Challenges and Solution
 
- The main challenges were faced during the creation of JPA annotations, like how to use these annotations and where to use it in the code. We solved this problem by learning how to implement these annotations and when and where are they required. By using annotations like @Entity, @Id, @Column etc. we created tables in database.
- Another challenge we faced was working with Micro services and establishing a connection with database. We were able to solve it by learning properties and methods required to establish the connection with database.
Working with Spring MVC took the most of our time, but we were finally able to solve the challenges faced, which are as followed:
- Another problem that we faced during project implementation was linking the JSP files to controller classes. We overcome this problem by learning how to give connection to individual JSP files and JSP pages to a controller class.

## Learning folder
1. [Markdown](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)
2. [Git inspector](https://github.com/ejwa/gitinspector.git)
3. [Github workflow](https://docs.github.com/en/actions/learn-github-action)
