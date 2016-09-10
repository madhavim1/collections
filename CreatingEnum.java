/*  Write a program that defines an enum having 
 * months of the year and then prints the value 
 * of all the enum elements.
 */


package com.training.collections;

public class CreatingEnum {
	
	public enum Month {
		Jan, Feb, Mar, Apr, May, June,
		July, Aug, Sept, Oct, Nov, Dec
	}
	
	public static void main(String[] args) {
		for(Month m:Month.values())
			System.out.println("Enum values :"+m);
	}


}
