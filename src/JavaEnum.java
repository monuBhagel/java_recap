/*
- An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
- To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
- Note that they should be in uppercase letters:
- You can access enum constants with the dot syntax.
- Enum is short for "enumerations", which means "specifically listed".


 */

enum level{
	LOW,
	MEDIUM,
	HIGH
}

public class JavaEnum {

	enum order{
		FIRST,
		SECOND,
		THIRD
	}


	public static void main(String[]args){

//		accessing enum outside of class
		level low = level.LOW;
		System.out.println(low);


//		accessing enum inside of class:
		order first = order.FIRST;
		System.out.println(first);


//		we can loop through enum to check the values of it , to do so  use .values property
		System.out.println("using foreach loop");
		for (level lvl : level.values()){
			System.out.println(lvl);
		}
	}
}

/*
- enum can be created inside a class
- Difference between Enums and Classes :
		- an enum is just like a class ,The only difference is that enum constants are public, static and final
		(unchangeable - cannot be overridden).
		- An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

- Why And When To Use Enums ?
	- Use enums when you have values that you know aren't going to change, like month days, days, colors,
	deck of cards, etc.
 */