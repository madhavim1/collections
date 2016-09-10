/*  Write a program to sort a map by value. */

package com.training.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "dbc");
		map.put(3, "cde");
		map.put(2, "abc");
		sortMapByValues(map);
	}

	private static void sortMapByValues(Map<Integer, String> inputMap) {
		System.out.println("UnSorted Map Key Value Pairs ");
        for(Entry<Integer,String> entry : inputMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
		
		Comparator<Integer> myComparator = new Comparator<Integer>() {
			@Override 
			public int compare(Integer s1, Integer s2) {
        			return inputMap.get(s1).compareTo(inputMap.get(s2));
			}           
		};
                
        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>(myComparator);
        tmap.putAll(inputMap);
        
        System.out.println("Sorted Map Key Value Pairs ");
        for(Entry<Integer,String> entry : tmap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}


