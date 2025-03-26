# **OOP stands for Object-Oriented Programming**

- Classes and objects are the two main aspects of object-oriented programming.
- a class is a template for objects, and an object is an instance of a class.
- When the individual objects are created, they inherit all the variables and methods from the class.
- A Class is like an object constructor, or a "blueprint" for creating objects.


# **Access modifer**
We divide modifiers into two groups:
1. Access Modifiers - controls the access level
2. Non-Access Modifiers - do not control access level, but provides other functionality

#### Access Modifiers for classes:
- for classes we can use either Public or default
- public means class is accessible by others too.
- default means the class is only accessible by classes in the same package.


#### Access Modifiers for attributes, methods and constructors:
- public : the code is accessible for all calsses.
- private : the code is accessible within the declared class.
- protected : The code is accessible in the same package and subclasses.
- default : The code is only accessible in the same package. 


#### Non-Access Modifiers For classes :
we can use either final or abstract:
- final : the class cannot be inherited by other classes
- abstract : The class cannot be used to create objects (To access an abstract class, 
it must be inherited from another class


#### Non-Access Modifiers For attributes and methods :
we can use final , static , abstract , transient ,synchronized and volatile.

- fianl : Attributes and methods cannot be overridden/modified
- static : Attributes and methods belongs to the class, rather than an object
- abstract : Can only be used in an abstract class, and can only be used on methods. The method does not have a body.
- transient : Attributes and methods are skipped when serializing the object containing them
- synchronized : Methods can only be accessed by one thread at a time
- volatile : The value of an attribute is not cached thread-locally, and is always read from the "main memory"