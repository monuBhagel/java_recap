package oops;/*
it is also possible to nest classes (a class within a class).
The purpose of nested classes is to group classes that belong together,
 which makes your code more readable and maintainable.
 */

class Outter {
	String _className = "outer class";
	public void inClass(){

		System.out.println("in outter class");
	}

	class Inner{
		public void inClass(){
			System.out.println("in inner class");
		}
		public String accessOuter(){
			return _className ;
		}
	}
}

public class JavaNestedClasses {
	public static void main(String[] args){
//		accessing outer class
		Outter out = new Outter();
		out.inClass();

//		accessing inner class:
		Outter.Inner inner = out.new Inner();
		inner.inClass();

//		once inside the inner class we can access outer class with inner object
		String accessOuter = inner.accessOuter();
		System.out.println(accessOuter);

	}
}

/*
these nested classes can be private , public , final ,static ,etc.
 */