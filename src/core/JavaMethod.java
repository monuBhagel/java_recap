package core;

public class JavaMethod {
	/*
	- in java , method is a block of code that preform a specific task.
	- it is defined within a class and is used to define the behaviour for the object of class.
	- methods can return  value , take input parameters and be called by other methods and classes.

	Components of a Method:
	1. Access modifier : it can public , private ,protected and default.
	2. Return type : specify the data-type the method would return such as(int,string,void,etc)
	3. Method name : it is the name by which method is called.
	4. Parameter (optional) : A list of input values (parameters) that the method can accept.
	5. Method Body: The block of code that defines the actions of the method.
	6. Return Statement (optional): If the method has a return type, it returns a value.

	general syntax of method:

	<access_modifier> <return_type> <method_name>(<parameters>) {
     		method body
    		code to perform some action
    return <value>; // if the return type is not void
		}

	 */


	//	simple method declaration :
	private static void hello() {
		System.out.println("hello");
	}

	//	method with parameters:
	private static void add(int a , int b){
		int sum = a +b ;
		System.out.println("sum is " + sum);
	}


//	method with return statement and data-type:
	public static int sum(int a, int b){
		System.out.println(a+b);
		return 0 ;
	}

// Method overloading : it happens when method with same name but different parameters or datatype are created and used.
	public static double sum(double a , double b){

		System.out.println(a+b);
		return 0;
	}

	// Recursive method to calculate factorial
	public static int factorial(int n) {
		if (n == 0) {
			return 1;  // Base case
		}
		return n * factorial(n - 1);  // Recursive call
	}



	public static void main(String[] args){
//		calling hello method
		hello();

//		calling add method with parameters
		add(9,10);

//		calling method with return statement
		int result = sum(10,5) ;
		System.out.println(result);

//		method overloading example :
		sum(10,8);
		double summed = sum(10.9, 1.3);

//		Recursion :
//		- it is a concept of calling the method itself inside itself
//		- The key to recursion is having a base case that stops the recursion and avoids infinite loops
//		example : Factorial of a Number.
		// Recursive method to calculate factorial

		int fact = factorial(5);
		System.out.println(fact);

	}
}
