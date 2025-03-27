package dataStructure;/*
- In Java, an Iterator is an object that allows you to traverse through the elements of a collection,
 	such as a List, Set, or Queue
- It provides a way to access each element in the collection sequentially without exposing the underlying structure.

- Key Operations of an Iterator:
	- The Iterator interface provides three primary methods:
	1. hasNext()
	2. next()
	3. remove()

- When to Use Iterator vs For-Each Loop :
	answer : Use an Iterator when:
				- You need to remove elements while iterating.
				- You want fine control over the iteration process (e.g., skipping elements, etc.).

			Use a For-Each loop when:
				- You just need to iterate over the elements and do not need to remove or modify the collection during iteration.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class JavaIterator {
	public static void main(String[] args){

		// creating an iterable
		ArrayList<String> fruits = new ArrayList<>() ;

		System.out.println(fruits.getClass().getName());

//		add 3 items to it
		fruits.addAll(Arrays.asList("mango", "banana" ,"cherry" ,"papaya")) ;

		System.out.println(fruits);

//		iterating on fruits using iterator :

		// creating an iterator object for fruits:
		Iterator<String> iterate = fruits.iterator();

//		printing the first element:
//		String first = iterate.next();
//		System.out.println(first);

//		looping through a collection

		while (iterate.hasNext()){
			System.out.println(iterate.next());
		}

//		removing item while iterating
//		System.out.println(fruits);
//		while (iterate.hasNext()){
//			if (iterate.equals("cherry")){
//				iterate.remove();
//			}
//		}

//		be cautious when using while loop with iterator

		System.out.println(fruits);
	}
}
