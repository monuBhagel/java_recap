package core;

public class JavaLoops {
	public static void main(String[] args){

//		there are loops in java to repeat a certain code or process. some loops are :
//		1.while loop
//		2.do-while loop
//		3.for loop
//		4.enhanced for loop or foreach loop

//		1. While loop
//			- The while loop loops through a block of code as long as a specified condition is true:
//		syntax :
//		while (condition) {
//   			code block to be executed
//			}

		int i = 8;
		while (i > 4){
			System.out.println("in while loop");
			i--;
		}

//		2. do-while loop
//		- This loop will execute the code block once, before checking if the condition is true.
//		- then it will repeat the loop as long as the condition is true.
//		syntax :
//		do {
// 			code block to be executed
//			}
//		while (condition);

		int x = 0 ;
		do {
			System.out.println("inside do-while loop");
			x++;
		}
		while ( x > 2);

/*
		3. for loop
		- when we knew how many times we need to repeat the code we use for loop.
		syntax :
		for (statement 1; statement 2 ; statement 3 ){
		block of code to be executed.
		}
		statement 1 : is executed (one time) before the execution of the code block. this is an initialization statement.
		statement 2 : defines the condition for executing the code block.
		statement 3 : is executed (every time) after the code block has been executed.

*/

		for (int y = 1 ; y < 4 ; y++ ){
			System.out.println("in for loop" + y);
		}

//		nested for loop: it's just loop inside loop
		// Outer loop
		for (i = 1; i <= 2; i++) {
			System.out.println("Outer: " + i);

			// Inner loop
			for (int j = 1; j <= 3; j++) {
				System.out.println(" Inner: " + j);
			}
		}

//		foe each loop: There is also a "for-each" loop, which is used exclusively to loop
//		through elements in an array (or other data sets):
//		for (type variableName : arrayName) {
			// code block to be executed
//		}

		String[] fruits  = {"mango","banana","cherry"} ;
		for (String fruit : fruits){
			System.out.println(fruit);
		}
	}
}
