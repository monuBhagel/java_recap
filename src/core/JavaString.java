package core;

public class JavaString {
	public static void main(String[] args){

//		- A String variable contains a collection of characters surrounded by double quotes:
//		- A String in Java is actually an object, which contain methods that can perform certain operations on strings.
//		- some simple and mostly used methods :
//			-> .length()	- Returns the length of a specified string
//			-> .indexOf()	- Returns the position of the first found occurrence of specified characters in a string
//			-> .toUpperCase()	- Converts a string to upper case letters
//			-> .toLowerCase()	- Converts a string to lower case letters
//			-> .charAt()	- Returns the character at the specified index (position)
//			-> .concat()	- Appends a string to the end of another string
//			-> .contains()	- Checks whether a string contains a sequence of characters
//			-> .endsWith()	- Checks whether a string ends with the specified character(s)
//			-> .equals()	- Compares two strings. Returns true if the strings are equal, and false if not
//			-> .equalsIgnoreCase()	- Compares two strings, ignoring case considerations
//			-> .getBytes()	- Converts a string into an array of bytes
//			-> .getChar()	- Copies characters from a string to an array of chars
//			-> .isEmpty()	- Checks whether a string is empty or not
//			-> .join()	- Joins one or more strings with a specified separator
//			-> .lastIndexOf()	- Returns the position of the last found occurrence of specified characters in a string
//			-> .matches()	- Searches a string for a match against a regular expression, and returns the matches
//			-> .replace()	- Searches a string for a specified value, and returns a new string where the specified
//								values are replaced
//			-> .replaceAll()	- Replaces each substring of this string that matches the given regular expression
//								with the given replacement
//			-> .replaceFirst()	- Replaces the first occurrence of a substring that matches the given
//									regular expression with the given replacement
//			-> .split()	- Splits a string into an array of substrings
//			-> .startsWith()	- Checks whether a string starts with specified characters
//			-> .subSequence()	- Returns a new character sequence that is a subsequence of this sequence
//			-> .substring()		- Returns a new string which is the substring of a specified string
//			-> .toString()	- Returns the value of a String object
//			-> .trim()	- Removes whitespace from both ends of a string

		String name = " tom simson" ;

		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(3));
		System.out.println(name.contains("h"));
		System.out.println(name.indexOf("m"));
		System.out.println(name.length());
		System.out.println(name.replace("m","e"));
		System.out.println(name.strip());
		System.out.println(name.trim());
	}
}
