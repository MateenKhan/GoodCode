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

<h1>Method Reference </h1>
<p>
The Method reference feature introduced in Java 8 is a shorthand notation for Lambda Expressions to call a method of Functional Interface. So each time you use a Lambda Expression to refer a method, you can replace your Lambda Expression with method reference.
</p>

<h1>Nashorn JavaScript Engine </h1>
<p>
Nashorn that replaces the existing Rhino. Nashorn directly compiles the code in memory and then passes the bytecode to JVM thereby improving the performance by 10 times.
</p>

<h1>Base64 Encode Decode</h1>
<p>
In Java 8 there is inbuilt encode and decode for Base64 encoding. The class for Base64 encoding is java.util.Base64.
</p>


<h1>IO improvements</h1>
<p>
Files.list (Path dir): This returns a jlazily populated stream, whose each element is the entry in the directory.
Files.lines (Path path): Reads all the lines from a stream.
Files.find (): Search for files in the file tree rooted at a given starting file and returns a stream populated by a path.
BufferedReader.lines (): Returns a stream with its every element as the lines read from BufferedReader.
</p>




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
