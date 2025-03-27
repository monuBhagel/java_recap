package dataStructure;/*
- In java . the linked list class is almost identical to arraylist . as they both inference list interface.
- The difference is behind teh working .

 	- How the LinkedList works ?
 		Answer : The LinkedList stores its items in "containers."
 		The list has a link to the first container and each container has a link to the next container in the list.
 		 To add an element to the list, the element is placed into a new container and that container is
 		  linked to one of the other containers in the list.

- The linked list has all the method available of an array list class and some extra method also such as :
		- addFirst() : Adds an item to the beginning of the list
		- addLast()	: Adds an item to the end of the list
		- removeFirst() : removes an item to the beginning of the list
		- removeLast() :  removes an item to the end of the list
		- getFirst() : Get the item from the beginning of the list
		- getLast()	: Get the item from the end of the list

 */

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JavaLinkedList {
	public static void main(String[ ] args) {

//		creating a linkedlist using list interface
		List<String> cars = new LinkedList< >();

		System.out.println(cars.getClass().getName());

//		creating a linkelist using old fashion way
		LinkedList<Integer> numbers = new LinkedList<>();

		System.out.println(numbers.getClass().getName());


//		adding items to cars

		cars.add("volvo");
		cars.add("BMW");
		cars.add("FORD");
		cars.add("Jaguar");

//		accessing and printing linked list

		// using index
		System.out.println(cars.get(2));

		// using getFirst and getLast
		System.out.println(cars.getFirst());
		System.out.println(cars.getLast());

		// using loop : for-each loop
		System.out.println("using for each loop");
		for (String car : cars ){
			System.out.println(car);
		}


//		adding one item at a time and printing number linked list
		numbers.add(1);
		System.out.println(numbers);

//		adding multiple items at once

		// Using addAll() Method : this allow us to add all items from other iterable like list , array ,etc

		numbers.addAll(Arrays.asList(2,3,4,5)) ;
		System.out.println(numbers);

		// using loop

		int[] num = {22,33,12}; // other iterable

		for (int n : num){
			numbers.add(n);
		}
		System.out.println(numbers);


		//  Using Collections.addAll()

		Collections.addAll(numbers , 7,11,15,19) ;
		System.out.println(numbers);

//		sorting linked list

		Collections.sort(numbers); // in ascending order
		System.out.println(numbers);

		numbers.sort(Collections.reverseOrder()); // in descending order
		System.out.println(numbers);


	}
}
