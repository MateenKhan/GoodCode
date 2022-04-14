# JavaGoodCode


interview questions :

coupling and cohesion
Cohesion is the degree to which the elements inside a module belong together. 
Coupling is the degree of interdependence between software modules.

<a href = "https://www.baeldung.com/solid-principles" target="_blank"> SOLID Principles: </a>

Single Responsibility : class should only have one responsibility
Open/Closed : classes should be open for extension but closed for modification
Liskov Substitution : if class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program
Interface Segregation :  larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.
Dependency Inversion : The principle of dependency inversion refers to the decoupling of software modules. This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.

java 8: 
<a href = "https://manifesto.co.uk/java-jdk-8-features/" target="_blank"> reference 1: </a>
The Metaspace will re-size itself depending on the demand we have of memory at runtime. If we need to, we can still tune the amount of Metaspace by setting the “MaxMetaspaceSize” param

We are used to sorting arrays with “Arrays.sort”. This used Merge Sort or Tim Sort algorithms for the sorting. The problem they have is that they are executed sequentially, so we do not gain all the benefits multithreading has to offer us. For this purpose they implemented “Arrays.parallelSort”

A functional interface is the one that defines exactly one abstract method. While defining a new functional interface, we will have to define the new annotation “@FunctionalInterface”. This will allow us to block bad usages of functional interfaces as it will not compile if used improperly with the new annotation

DateTimeAPI

Lambda expressions : myCollection.forEach((String value) -> System.out.println(value));



core java
default values in interface, overriding rules, constructor flow with arguments
hashCode and equals contract - leading to ( collections, sorting, indexof , etc ) 
comparable and comparator


spring
difference between object and beans - leading to ( lifecylce of beans, aop, 


threads communication - leading to ( leading to microservices, restapi )

what design patterns have you used and why ?
eg : singleton - why and how? 




what is tdd - leading to junit

disadvantages of microservices

sample code to write sortining with removing duplication using java 8
