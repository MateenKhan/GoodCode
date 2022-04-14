# JavaGoodCode


<h1>coupling and cohesion: </h1>
<p>Cohesion is the degree to which the elements inside a module belong together.</p> 
<p>Coupling is the degree of interdependence between software modules.</p>

<h1><a href = "https://www.baeldung.com/solid-principles" target="_blank"> SOLID Principles: </a></h1>

<p><b>Single Responsibility :</b> class should only have one responsibility</p>
<p><b>Open/Closed :</b> classes should be open for extension but closed for modification</p>
<p><b>Liskov Substitution :</b> if class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program</p>
<p><b>Interface Segregation :</b>  larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.</p>
<p><b>Dependency Inversion :</b> The principle of dependency inversion refers to the decoupling of software modules. This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.</p>

<h1>java 8: </h1>
<a href = "https://manifesto.co.uk/java-jdk-8-features/" target="_blank"> reference 1: </a>
<a href = "https://www.softwaretestinghelp.com/java/prominent-java-8-features/" target="_blank"> reference 2: </a>

<h1>Metaspac</h1>
</p>The Metaspace will re-size itself depending on the demand we have of memory at runtime. If we need to, we can still tune the amount of Metaspace by setting the “MaxMetaspaceSize” param</p>

<h1> Parallel sort</h1>
<p>
We are used to sorting arrays with “Arrays.sort”. This used Merge Sort or Tim Sort algorithms for the sorting. The problem they have is that they are executed sequentially, so we do not gain all the benefits multithreading has to offer us. For this purpose they implemented “Arrays.parallelSort”
</p>

<h1>Functional Interface </h1>
<p>
A functional interface is the one that defines exactly one abstract method. While defining a new functional interface, we will have to define the new annotation “@FunctionalInterface”. This will allow us to block bad usages of functional interfaces as it will not compile if used improperly with the new annotation
</p>

<h1>DateTimeAPI</h1>

<h1>Lambda expressions : </h1>
<p>myCollection.forEach((String value) -> System.out.println(value));</p>
<p>colletion.forEach(sub -> System.out.println(sub));  </p>



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
