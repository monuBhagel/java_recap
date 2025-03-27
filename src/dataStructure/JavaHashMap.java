package dataStructure;/*
- In Java, a HashMap is a part of the java.util package and implements the Map interface.
- It stores key-value pairs and allows fast retrieval, insertion, and deletion operations.
- The keys are unique and each key refer to exactly one value.
- Basic Characteristics of a HashMap:
	- No duplicate keys: Each key in the HashMap must be unique.
						 If you try to insert a duplicate key, the new value will replace the existing one.
	- Key-Value Pair: It stores data as key-value pairs, where each key maps to a specific value.
	- Unordered: HashMap does not maintain the order of the elements.
	- Null Keys and Values: It allows one null key and any number of null values.

-  Common Methods of a HashMap :
	- put(K key, V value): Adds a key-value pair to the map. If the key already exists,
							it updates the value associated with that key.
	- get(Object key): Retrieves the value associated with the specified key. Returns null if the key doesn't exist.
	- remove(Object key): Removes the key-value pair associated with the specified key.
	- containsKey(Object key): Returns true if the specified key exists in the map.
	- containsValue(Object value): Returns true if the specified value exists in the map.
	- size(): Returns the number of key-value pairs in the map.
	- keySet(): Returns a Set view of all the keys contained in the map
	- values(): Returns a Collection view of all the values in the map.
	- entrySet(): Returns a Set view of all key-value mappings contained in the map.
	- clear(): Removes all key-value pairs from the map.


- important note :
 	- Thread Safety: HashMap is not thread-safe. If you need to use a HashMap in a multithreaded environment,
 	 				consider using ConcurrentHashMap.
 	- Order: HashMap does not guarantee any order of the entries.
 	 			If you need a predictable order, use LinkedHashMap (which maintains insertion order)
 	 			or TreeMap (which sorts keys)

 */

import java.util.HashMap;

public class JavaHashMap {
	public static void main(String[] args){

//		creating a hashmap object
		HashMap<String , String>  cars = new HashMap<>();

		System.out.println(cars.getClass().getName());

//		adding key-value pairs
		cars.put("toyota" , "corolla") ;
		cars.put("honda" , "civic") ;
		cars.put("ford" , "mustang") ;

		System.out.println(cars); // normal view of hashmap : {toyota=corolla, honda=civic, ford=mustang}

//		accessing values using keys : get()
		System.out.println("honda : "+cars.get("honda"));

//		accessing all keys
		System.out.println("keys are : "+cars.keySet());

//		accessing all values:
		System.out.println("values are : " + cars.values());

//		checking the size of hashmap;
		System.out.println("size of hashmap : " + cars.size());

//		removing a certain item using key :
		cars.remove("honda");

		System.out.println(cars);

//		iterating through the map
		cars.forEach((key, value) -> System.out.println(key + " -> " + value));

		// using for each loop
		for (String key : cars.keySet()){
//			System.out.println("keys " + key + " & value : "  + cars.get(key));
			System.out.println(key + " -> " + cars.get(key));
		}

	}
}
