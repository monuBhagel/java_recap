package core;/*
- The Scanner class is used to get user input, and it is found in the java.util package.
- we can use the following method of scanner class
	- nextLine()	: Reads a String value from the user
	- nextInt()		: Reads a int value from the user
	- nextBoolean()	: Reads a boolean value from the user
	- nextByte()	: Reads a byte value from the user
	- nextDouble()	: Reads a double value from the user
	- nextFloat()	: Reads a floating point  value from the user
	- nextLong()	: Reads a long value from the user
	- nextShort()	: Reads a short value from the user

 */

import java.util.Scanner;

public class JavaUserInput {
	public static void main(String [] args){
		Scanner read = new Scanner(System.in);

		System.out.println("enter your name : ");
		String name = read.nextLine();

		System.out.println("enter you age :");
		int age = read.nextInt();

		System.out.println("your name is : " + name);

		System.out.println("your age is : " + age);
	}
}
