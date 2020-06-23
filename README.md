# Spring-Data-JPA
Before JPA 
EntityManager is repsonsible for storing the data to the database and retrieving the data from the database
but For Every Bean we have to create Entity Manager here we are repeating the same code again and again 
so we came with the concept called Spring Data JPA

@Transactional - for each method before making any operation like save, updating the data we have begin with transaction,
once the operation is completed we have to close the transaction for each method, its very difficult to maintain the 
transaction in every as well as repeating the same code so we come with the concept of @Tranctional where we can use 
this annotation in class level as well as method level

Spring Data JPA provide default implementation with the help of EntityManager so that every bean class will make use
 use of default methods such as
 findById()
 findAll()
 save()
 deleteById()
 
 create the bean class with all required properties
@Entity - storing the object into the database
@GeneratedValue - for every insert operation it will generate the id
@Column - name of the column in tha database
@Max - maximum value 
@Min - Minimum Value
@Table - name of the table in the database

