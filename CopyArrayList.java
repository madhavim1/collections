/*  Write a program to copy arraylist to an array */

package com.training.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("India");
		list.add("America");
		list.add("Brazil");
		list.add("Italy");
		String[] array = new String[list.size()];
		array = list.toArray(array);
		System.out.println("Elements in array :"+Arrays.toString(array));
	}

}
