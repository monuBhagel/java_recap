//	create a class named fruits
//	to create a class use a keyword "class"

class fruits{
	String fruit_1 = "mango" ;

//	attribute with final keyword
	final String fruit_2 = "banana" ;

//	create a class method : methods justify the behaviour of the class , they are function a class can do.
//	syntax : access-modifier return-type method-name(){ ... }
	static void eating(){ // this is a static method ,so we can call it without creating the object and by using the class name.
		System.out.println("eating fruits");
	}

	void eatingMango(){
		System.out.println("eating mango");
	}
}

public class JavaClassAndObjects {

	public static void main(String[] args){

//		creating an object of fruits class : use keyword "new" with class name()

		fruits obj_1 = new fruits();

//		accesing attributes of fruits class
		System.out.println(obj_1.fruit_1);

//		modifying class attributes:
		obj_1.fruit_1 = "apple" ;
		System.out.println(obj_1.fruit_1);

//		If you don't want the ability to override existing values, declare the attribute as final:
		// obj_1.fruit_2 = "cherry" ;  // java: cannot assign a value to final variable fruit_2

//		calling the static method of class
		fruits.eating();

//		calling the method using object:
		obj_1.eatingMango();





	}

}
