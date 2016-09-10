/*  Write a program which takes an input series as a1,a2,a3....an,b1,b2,b3...bn 
 * and produces output as a1,b1,a2,b2,a3,b3.......,an,bn.
 */

package com.training.collections;

import java.util.Arrays;

public class CombineSeries {

	public static void main(String[] args) {
		String[] inputSeries1 = {"a1", "a2", "a3", "a4"};
		String[] inputSeries2 = {"b1", "b2", "b3", "b4"};
		int length1 = inputSeries1.length;
		int length2 = inputSeries2.length;
		int totalLength = length1+length2;
		String[] newSeries = new String[totalLength];
		for(int i=0, j=0, k=0; k<totalLength; k=k+2) {
			newSeries[k] = inputSeries1[i++];
			newSeries[k+1] = inputSeries2[j++];
		}
		System.out.println("New series "+Arrays.toString(newSeries));
		
	}

}
