/* Write a program having different methods to perform 
 * below operations.
 *   --> To create an arraylist and add elements to it.
 *   --> To search for an element in the list. 
 *   --> To print the elements of the list using iterator.
 *   --> To print the elements in the reverse order using 
 *   			ListIterator.
 */
package com.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListOperations {
	
	public static ArrayList<String> createArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("India");
		list.add("America");
		list.add("Brazil");
		list.add("Italy");
		return list;
	}
	
	public static void searchElementInList(ArrayList<String> arr, String searchElement) {
		for(Object element: arr) {
			if(searchElement.equals(element)) {
				System.out.println("element is found at index "+arr.indexOf(element));
				return;
			}
		}
	}
	
	public static void printElements(ArrayList<String> arr) {
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void printElementsReverse(ArrayList<String> arr) {
		ListIterator<String> it = arr.listIterator(arr.size());
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Creating array list...");
		ArrayList<String> arr = createArrayList();
		
		System.out.println("Searching element...");
		searchElementInList(arr, "America");
		
		System.out.println("Printing elements...");
		printElements(arr);
		
		System.out.println("Printing elements in reverse...");
		printElementsReverse(arr);
	}

}
