/* Write a program to find duplicates in an array using set. */

package com.training.collections;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesArray {

	public static void main(String[] args) {
		String[] arr = {"Apple", "Banana", "Apple", "Mango", "Banana"};
		Set<String> set = new HashSet<String>();
		for(String element: arr) {
			if(!set.add(element)) {
				System.out.println("Duplicate element is "+element);
			}
		}
		System.out.println("Set contains "+set.toString());
	}
}
