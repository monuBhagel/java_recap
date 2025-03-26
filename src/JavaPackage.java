/*A package in Java is used to group related classes. Think of it as a folder in a file directory.
 Packages are divided into two categories:
 1.Built-in packages : provided by jdk itself
 2.user defined packages

 to use package and its classes we use a keyword "import" and "from"

*/

//importing scanner class from java.utils package
import java.util.Scanner; // built-in package

import myPackage.JavaMyPackage ;

public class JavaPackage {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in); //using the scanner class to create an object of it

		System.out.println("enter your name");
		String name = scan.nextLine() ;

		System.out.println("your name is : "+ name);

		JavaMyPackage obj = new JavaMyPackage() ; // using the user-defined package class
		obj.printname();




	}
}
