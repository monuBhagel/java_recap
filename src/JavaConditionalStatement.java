public class JavaConditionalStatement {
	public static void main(String[] args){

/*
		- java has conditional statements for decision-making these are :
					1. if statements
					2. if ... else statements
					3. else if statements
					4. ternary operator ?
					5. switch
*/
// example of if statement
		if (10 > 8){
			System.out.println("10 is bigger");
		}

// example of if else
		if (10 > 29 ){
			System.out.println("10 is bigger");
		}
		else {
			System.out.println("10 is smaller");
		}

//	example of else if
		if (10 > 29 ){
			System.out.println("10 is bigger");
		}
		else if (20 > 10) {
			System.out.println("20 is bigger than 10");
		}
		else {
			System.out.println("10 is smaller");
		}

//		ternary operator is used for shorthand writing of if statement
//		variable = (condition) ? expressionTrue :  expressionFalse;

		String result = (10 > 8) ? "yes" : "no" ;

		System.out.println(result);


/*		Java Switch Statements:
		- Instead of writing many if else statements, you can use the switch statement.
		- The switch statement selects one of many code blocks to be executed:

		switch(expression) {
			case x:
				// code block
				break;
			case y:
				// code block
				break;
			default:
				// code block
		}

		- Problems in Traditional Switch
			1.  Default falls through due to missing break:
			2. Multiple values per case aren't supported :

		- Upgraded Switch in Java 13 :
			1. Supports multiple values per case:
			2. yield is used to return a value:
			3. Switch can be used as an expression:
			4. Necessary to return value/exception:
			5. Switch with arrows:
			6.  Scope:
 */

//		example of new switch statements :

//		1. Supports multiple values per case:
		int itemcode = 001 ;

		switch (itemcode){
			case 001 ,002 ,003 :
				System.out.println("switch with multiple values per case .");
				break;
			case 004 ,005 :
				System.out.println("next case");
		}


//		2. yield is used to return a value:
//		A new keyword yield has been introduced. It returns values from a switch branch only.
//		We don’t need a break after yield as it automatically terminates the switch expression.
//		while using yield make sure you terminate the switch statement

		String code = "x" ;
		int val = switch (code) {  // we use this type of syntax for expression.
			case "x", "y" :
				yield 1;
			case "z", "w" :
				yield 2;
			default:
				throw new IllegalStateException("Unexpected value: " + code);
		};

		System.out.println(val);

		/*
	 Switch with arrows:
	 - The new arrow ⇾ syntax has been introduced for the switch.
	 - It can be used with the switch as an expression as well as a statement.
	 - The statements on the right side of an ⇾ are executed if an exact case matches on the left side.
	 - On the right side of ⇾ we can have any of the following :
	 		- Statement / expression
	 		- throw statement
	 		- block {}
	 */

//	example ;
		itemcode = 003;
		switch (itemcode) {
			case 001 -> System.out.println("hello 001");
			case 002 , 003 -> System.out.println("hello 002 or 003");
			default -> System.out.println("hello , but who are you 🤔");
		}


	}




}
