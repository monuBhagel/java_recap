/*
- Java does not have a built-in Date class
- we can import the java.time package to work with the date and time API.
- by doing so we get access to the classes such as;
	- LocalDate	: Represents a date (year, month, day (yyyy-MM-dd))
	- LocalTime :	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
	- LocalDateTime	 : Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
	- DateTimeFormatter :	Formatter for displaying and parsing date-time objects

 */

import java.time.*;
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class JavaDateAndTime {
	public static void main(String [] args ){
//		Display Current Date
		LocalDate date = LocalDate.now();
		System.out.println(date);

//		Display Current Time

		LocalTime time = LocalTime.now();
		System.out.println(time);

//		Display Current Date and Time

		LocalDateTime date_time = LocalDateTime.now();
		System.out.println(date_time);


//		Formatting Date and Time

		System.out.println("before formating date and time");
		System.out.println(date_time);

		System.out.println("after formating date and time : ");
		DateTimeFormatter format_date_time = DateTimeFormatter.ofPattern("dd-MM-yyyy  &  HH:mm:ss");

		String formattedDate = date_time.format(format_date_time);

		System.out.println(formattedDate);
	}
}
