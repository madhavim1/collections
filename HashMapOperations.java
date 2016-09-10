/* Write a program having below methods.
 *  --> To create a hashmap.
 *  --> To search for a key in the created map and then 
 *       returns its value.
 */

package com.training.collections;

import java.util.HashMap;

public class HashMapOperations {
	
	public static HashMap createHashMap() {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "US");
		map.put(2, "India");
		map.put(3, "Brazil");
		return map;
	}
	
	public static String searchKey(int key, HashMap map) {
		return map.get(key).toString();
	}
	
	public static void main(String[] args) {
		HashMap map = createHashMap();
		System.out.println("Created HashMap: "+map);
		System.out.println("Searched key value : "+searchKey(1, map));
	}
}
