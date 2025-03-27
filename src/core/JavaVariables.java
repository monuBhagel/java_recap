package core;

public class JavaVariables {
	public static void main(String[] args){

		/*
		- Variables are containers for storing data values.
		- they are declared as ->  { type_of_variable  name_of_variable = value_of_it }
		- Java has several types of variables, classified based on their scope and lifecycle:
		- Based on scope we have :
			1. Local variable
			2. Global variable
			3. Class variable or static variable

		- Based on the data-types we have :
			1. Primitive
			2. Reference

		-  Variable Naming Rules :
			1. must start with letter (A-Z or a-z ) , underscore _ or dollar sign $
			2. Can include letters, digits (0-9), underscores, or dollar signs.
			3. Java is case-sensitive, so Variable and variable are different.
			4. No Reserved Keywords: Cannot use Java keywords (e.g., int, class, public, etc.).
			5. Names should start with a lowercase letter, and cannot contain whitespace
		 */

//		Declaring (Creating) Variables

		String name = "sam" ;
		int age = 15 ;
		Boolean passed = true ;
		char grade = 'A' ;

		System.out.println("name is " + name + "\nage is " + age + "\npassed : " + passed);

//		if needed we can change the value of a variable just by reassigning it

		age = 17; // here we don't pass the data-type because we have already declared it

		System.out.println("age is " + age);

//		we can stop this type of behavior using Final keyword at the time of declaration.

		final String full_name = "sam willson" ;

		System.out.println("full name is " + full_name);

//		if we try to change it we get error.

		// full_name = "tom";  // java: cannot assign a value to final variable full_name


//		- We can declare multiple variable of same type in one line using comma.

//		int x;
//		int y;
//		int z ;

		int x, y, z ; // the above code can be written as this.

//		- Also we can assign same value to multiple variable in single line/

		x=y=z=50;

		System.out.println(x + ", " + y + ", " + z);

		/*
		Exercise: Calculate the area of rectangle .
		 */
		float len = 5 ;
		float bredth = 10 ;
		float area = len * bredth ;

		System.out.println("length is " + len + "cm");
		System.out.println("breadth is " + bredth + "cm");
		System.out.println("area of rectangle  is " + area + "cm");
	}
}

