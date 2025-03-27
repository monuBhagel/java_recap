package oops;/*
- Data abstraction is the process of hiding certain details and showing only essential information to the user.
- Abstraction can be achieved with either abstract classes or interfaces
- The abstract keyword is a non-access modifier, used for classes and methods:
	- Abstract class: is a restricted class that cannot be used to create objects
		(to access it, it must be inherited from another class)
	- Abstract method: can only be used in an abstract class, and it does not have a body.
		 The body is provided by the subclass (inherited from).

- An abstract class can have both abstract and regular methods:

 */


abstract class Janwar {
//	abstract method
	public abstract void sound();

//	regular method
	public void reg(){
		System.out.println("this is a regular method inside abstract class , he he he");
	}
}

// class named pet inherit janwar

class Pet extends Janwar {

	public void sound(){
		System.out.println("sound of pet animal");
	}
}

public class JavaAbstraction {
	public static void main(String[] args){
//		trying to create object of abstract class

// 		Janwar obj = new Janwar() ; // java: Janwar is abstract; cannot be instantiated

// to access abstract class thing we need to extend it to a subclass then create object of subclass
		Pet obj = new Pet();

		obj.sound(); // this is an abstract method inherit from abstract class
		obj.reg(); // same but a regular method of abstract class

	}
}
