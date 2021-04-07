**FOLDERS**

1- config (Repository)
   - It contains SecurityConfiguration.java. This class provides one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.
   
2- model (Repository)
   - It contains Role.java and User.java. These classes specifies that the class is an entity and is mapped to a database table. 
   
3- repository (Repository)
   - It extends JPA Repository.
   
4- service (Repository)
   - This class mostly contains business logic. Here, it is used for internal implementation.

5- web (Repository)
   - It contains DAO classes. This repository fetch data from the database and populate a domain object. Or, it can prepare the data from a domain object and send it to a storage system using a DAO for persistence.
