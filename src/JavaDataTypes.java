public class JavaDataTypes {
	public static void main(String[] args){

		/*
		- Primitive data-type :
				1. byte : 8-bit integer , can store whole numbers from -128 to 127.
				2. short : 16-bit integer , can store whole numbers from -32768 to 32767:
				3. int : 32-bit integer ,  can store whole numbers from -2147483648 to 2147483647
				4. long : 64-bit integer , can store whole numbers from -9223372036854775808 to 9223372036854775807.
				5. float : 32-bit floating point , Sufficient for storing 6 to 7 decimal digits
				6. double : 64-bit floating point , Sufficient for storing 15 to 16 decimal digits
				7. char : 16-bit Unicode character
				8. boolean: Represents true or false

		- Reference data-types:
			-> These refer to objects and arrays. Reference types store the memory address where the data is located.
			such as String , Arrays ,etc.

		 */
//		Integer type Example:
		byte b = 100 ;
		short sh = 31_000;
		int i = 200_000_0000 ;
		long l = 9_223_372_036_854_775_80L ; // important note : use L in the end to declare long integer.

		System.out.println("byte is " + b);
		System.out.println("short is " + sh);
		System.out.println("int is " + i);
		System.out.println("long is " + l);

//		Floating Point Types :
//		The float and double data types can store fractional numbers.
//		Note that you should end the value with an "f" for floats and "d" for doubles:

		float f = 43.34f ;
		double d = 15.2323d ;

		System.out.println("float is " + f);
		System.out.println("double is " + d);


//		Boolean Types :
//		they are used to store response in either "true" or "false"

		boolean isUserLoggedIn = true; // standard and simple representation

		Boolean isActive = Boolean.TRUE ; // wrapper class representation

		String isPasses = "true" ;  // Using String for Boolean Representation:
		boolean boolvalue = Boolean.parseBoolean(isPasses) ;
		System.out.println(boolvalue);

//		Character data type :
//		The char data type is used to store a single character.
//		The character must be surrounded by single quotes, like 'A'

		char grade = 'A' ;

//		Alternatively, we can also  use ASCII values,  to display certain characters:

		char word_1 = 66 ;
		char word_2 = 77 ;

		System.out.println(word_1 + " , " + word_2);

//		Non-Primitive Data Types :
//		- Non-primitive data types are called reference types because they refer to objects.
//		- Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.
//		- Primitive types start with a lowercase letter (like int),
//		while non-primitive types typically starts with an uppercase letter (like String).
//		- Primitive types always hold a value, whereas non-primitive types can be null.

	}
}
