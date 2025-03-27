package oops;//The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
// we can achieve this by - declaring private attributes & provide public get and set methods to access
// and update the value of a private variable

// creating a class with private attributes
class Names {

	private String fname; // create a private attribute
	private String lname;

//	creating public get & set method to access private attributes outside the class.

	public void setName(String firstName, String lastName){
		this.fname = firstName ;
		this.lname = lastName ;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}
}



public class JavaEncapsulation {
	public static void main(String [] args){
//		creating object of class names :

		Names obj_1 = new Names();

		String firstName = obj_1.getFname() ;

		System.out.println(firstName); // result into null as we don't have name set.

//		setting up names using set method
		obj_1.setName("sam","willson");

//		getting names after setting them:
		firstName = obj_1.getFname();
		System.out.println(firstName);
		String  lastName =  obj_1.getLname();
		System.out.println(lastName);
	}
}


// Why Encapsulation ?
/*
answer : there are many reasons to do so some are as follows:
	1.Better control of class attributes and methods
	2.Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
	3.Flexible: the programmer can change one part of the code without affecting other parts
	4.Increased security of data

 */