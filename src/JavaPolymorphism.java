/*
- Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
- For example, think of a superclass called Animal that has a method called animalSound(). Subclasses of Animals could
	be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the
 	cat meows, etc.):
 */

class Animal{
	public void sound(){
		System.out.println("animal sound hee hee hee");
	}
}

class Pig extends Animal{
	public void sound(){
		System.out.println("the pig say : wee wee");
	}
}

class Dog extends Animal{
	public void sound(){
		System.out.println("the dog says : bau bau ");
	}
}

public class JavaPolymorphism {

	public static void main(String[] args) {
		Animal myAnimal = new Animal();  // Create a Animal object
		Animal myPig = new Pig();  // Create a Pig object
		Animal myDog = new Dog();  // Create a Dog object
		myAnimal.sound();
		myPig.sound();
		myDog.sound();
	}
}
