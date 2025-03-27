/*
- In Java, a HashSet is part of the java.util package and implements the Set interface.
- A HashSet is a collection that does not allow duplicate elements and does not guarantee any specific order of elements.
- It is backed by a hash table, which provides constant time performance for most operations,
 	such as adding, removing, and checking the existence of an element.

- Characteristics of a HashSet:
	- Unique elements: It does not allow duplicate elements. If you try to add a duplicate, the set will ignore it.
	- Unordered: It does not maintain the order of elements. The order in which elements are stored is not guaranteed.
	- Null values: HashSet allows one null element.
	- Backed by HashMap: Internally, HashSet uses a HashMap to store the elements.

- Common Methods of HashSet :
	- add(E e): Adds the specified element to the set if it is not already present.
	- remove(Object o): Removes the specified element from the set if it is present.
	- contains(Object o): Returns true if the set contains the specified element.
	- size(): Returns the number of elements in the set.
	- isEmpty(): Returns true if the set contains no elements.
	- clear(): Removes all elements from the set.
	- iterator(): Returns an iterator over the elements in the set.
	- forEach(): Since Java 8, HashSet has the forEach() method that allows for lambda-based iteration.


- important point to note :
		- No Duplicates: A HashSet automatically ensures that there are no duplicate elements.
		- Order: A HashSet does not guarantee the order of its elements. because they are stored based on their
		 		hash values
		- Efficiency: Operations like adding, removing, and checking for the presence of an element (add(),
		  		remove(), contains()) are generally O(1) on average (constant time), thanks to the underlying hash table.
		- Performance: The average time complexity for add(), remove(), and contains() operations is O(1),
						meaning these operations are very efficient.

 */

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet ;

public class JavaHashSet {
	public static void main(String[] args){

//		creating a hashset
		HashSet<Integer> numbers = new HashSet<>();
		System.out.println(numbers.getClass().getName());

//		adding items in hashset numbers

		numbers.add(1);
		System.out.println(numbers);

//		adding multiple items at once
			// using array.aslist()

		numbers.addAll(Arrays.asList(1,2,3,4)); // 1 is already there so the set will ignore this 1.
		System.out.println(numbers);

			//using collections.addall()

		Collections.addAll(numbers, 3,5,6,89,76,10) ;
		System.out.println(numbers);

//		Check If an Item Exists
		boolean has_5 = numbers.contains(5);
		System.out.println(has_5);

//		remove an item
		numbers.remove(5);
		System.out.println(numbers);

//		checking size
		System.out.println(numbers.size());

//		looping through hashset

		// using enhanced for loop
		for(int num : numbers){
			System.out.println(num);
		}

		// using for-each loop
		System.out.println("using for each method");

		numbers.forEach(num -> System.out.println(num));
	}
}
