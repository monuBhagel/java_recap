// class with constructor :

class PersonalDetail{

	String firstName ;
	String lastName ;

//	constructor
	public PersonalDetail(String fname , String lname){ // parameter become the attributes of constructor
		this.firstName = fname ; // this keyword refer to the object of class
		this.lastName = lname ;

		System.out.println(firstName);
		System.out.println(lastName);
	}

//	class method:
	public void fullName(){
		String fullName = firstName + lastName ;
		System.out.println("full name is " + fullName);
	}
}

public class JavaConstructor {

	public static void main(String [] args){

//		constructor are called when object are created :
		PersonalDetail obj_1 = new PersonalDetail("sam", "willson") ;

//		calling class method :
		obj_1.fullName();

	}
}
