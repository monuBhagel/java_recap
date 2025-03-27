package oops;

class animal implements JavaInterface{

	@Override
	public void animalSound() {
		System.out.println("this is overridden method of interface ");
	}

	@Override
	public void sleep() {
		System.out.println("this is also");

	}

	public void eat(){
		System.out.println("this is a method of regular class");
	}
}

public class Interface {

	public static void main(String[] args){
		animal obj = new animal();

		obj.animalSound(); // interface method
		obj.sleep();
		obj.eat(); // regular method
	}

}

/*
important points to note:

- Like abstract classes, interfaces cannot be used to create objects
- Interface methods do not have a body - the body is provided by the "implement" class
- On implementation of an interface, you must override all of its methods
- Interface methods are by default abstract and public
- Interface attributes are by default public, static and final
- An interface cannot contain a constructor (as it cannot be used to create objects)

Why And When To Use Interfaces ?

1. To achieve security - hide certain details and only show the important details of an object (interface).

2. Java does not support "multiple inheritance" (a class can only inherit from one superclass).
	However, it can be achieved with interfaces, because the class can implement multiple interfaces.
	To implement multiple interfaces, separate them with a comma

 */