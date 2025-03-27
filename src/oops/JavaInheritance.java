package oops;/*
- In java it is possible to inherit properties of a class into another class this concept of sharing is called
inheritance.
- the common terms used in inheritance :
	- subclass (child class) :  the class that inherits from another class
	- superclass (parent class) :  the class being inherited from.
- To inherit from a class, use the extends keyword.

 */

//parent class vehicle
class vehicle{

	String bodyColor ;

	public void inClass(){
		System.out.println("inside parent clas");
	}
}

// child class car inherit vehicle:

class Car extends vehicle{
	String brand;

	public void inChildClass(){
		System.out.println("inside child class");
	}
}

public class JavaInheritance {
	public static void main(String [] args){
		//	creating an object of child class

		Car car = new Car();

		car.inChildClass();
		String brandName = car.brand = "ford";
		System.out.println(brandName);

//		accessing parent class
		car.inClass();
		car.bodyColor = "yellow";
		System.out.println(car.bodyColor);

	}

}


// if we don't want other class to inherit from our class make the clas final .