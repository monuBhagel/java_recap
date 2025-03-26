public class JavaArray {
	public static void main(String[] args){

//		array creation:
		String[] fruits = {"mango","apple","banana","cherry"};

//		accessing array using index : index start from 0 .
		System.out.println(fruits[0]);

//		finding the length of array: using .length()
		System.out.println(fruits.length);

//		looping through array: using for loop
		System.out.println("in for loop");
		for(int i = 0 ; i < fruits.length ; i++){
			System.out.println(fruits[i]);
		}
		
//		using for each loop:
		System.out.println("in for each loop");
		for (String fruit : fruits){
			System.out.println(fruit);
		}

//		using while loop:
		System.out.println("in while loop");
		int start = 0 ;
		while(start< fruits.length){
			System.out.println(fruits[start]);
			start++;
		}

//		Multi-dimensional Array : it's just array inside array:

		int[][] number = {{1,23,3},{4,5,6}};

		System.out.println(number[1][0]);

//		loop through multidimensional array:

		for (int i = 0; i < 2; i++) {
			System.out.println("outer loop");
			for (int j = 0 ; j < number[i].length ; j++){
				System.out.println(number[i][j]);
			}
		}
	}
}
