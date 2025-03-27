package dataStructure;/*
- The Arraylist class is the resizable array , it is found in the java.util package.
- The elements in the Arraylist are actually the objects .

- syntax :
 				ArrayList<wrapper_class> name_of_array = new ArrayList<wrapper_class> ()

- Arraylist methods are as follows :
		- .add()	: Add an item to the list
		- .addAll()	: Add a collection of items to the list
		- .clear()	: Remove all items from the list
		- .clone()	: Create a copy of the ArrayList
		- .contains()	: Checks whether an item exist in the list
		- .ensureCapacity() : Increase the capacity of the list to be able to fit a specified number of items
		- .forEach()	: Perform an action on every item in the list
		- .get()	:	Return the item at a specific position in the list
		- .indexOf()	: Return the position of the first occurrence of an item in the list
		- .isEmpty()	: Checks whether the list is empty
		- .remove()	: Remove an item from the list
		- .removeAll()	: Remove a collection of items from the list
		- .replaceAll()	: Replace each item in the list with the result of an operation on that item
		- .set()	: Replace an item at a specified position in the list
		- .size()	: Return the number of items in the list
		- .sort()	:  Sort the list
		- .sublist()	: Return a sublist which provides access to a range of this list's items
		- .toArray()	: Return an array containing the list's items
		- .trimToSize()	: Reduce the capacity of the list to match the number of items if necessary

 */


import java.util.ArrayList ;
import java.util.Collections;


public class JavaArrayList {
	public static void main(String [] args) {

//		Create an ArrayList object
		ArrayList<String> fruits = new ArrayList<>() ;

		System.out.println(fruits.getClass().getName());

//		add 3 items to it
		fruits.add("mango") ;
		fruits.add("banana") ;
		fruits.add("cherry") ;

//		print array list
		System.out.println(fruits);

//		insert / add item at certain index:

		fruits.add(1, "apple") ;
		System.out.println(fruits);

//		access item in the list using indexing :

		System.out.println(fruits.get(2));

//		change or modify items in the array list using indexing:

		fruits.set(3,"tomato") ;
		System.out.println(fruits);

//		remove an item from the arraylist using indexing :
		fruits.remove(3) ;
		System.out.println(fruits);

//		remove all items from the array list using clear method :
		// fruits.clear();
		// System.out.println(fruits);

//		checking the size of array list using size method:
		System.out.println(fruits.size());

//		accessing one item at a time using loops
		System.out.println("using  for loop :-");
		for (int i = 0 ; i < fruits.size() ; i++){ // using for loop
			System.out.println(fruits.get(i));
		}

//		using enhanced for loop :
		System.out.println("using enhanced for loop :-");

		for(String fruit : fruits){
			System.out.println(fruit);
		}

//		making an array list for integer type:

		ArrayList<Integer> numbers = new ArrayList<>() ;
		numbers.add(1) ;
		numbers.add(11) ;
		numbers.add(4) ;
		numbers.add(22) ;

		System.out.println(numbers);

//		sorting an arraylist : - we can do this using .sort method but to do so we need a comparator
//						- or we can use the collection class ' s sort method.

		Collections.sort(numbers) ;
		System.out.println("number after sorting using collection.sort() method");
		System.out.println(numbers);





	}
}
