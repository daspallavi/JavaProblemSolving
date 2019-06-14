package com.practicejava.learning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Method-1 */
		int[] arr = new int[]{-10,-3,-7,-4};
		Arrays.sort(arr);
		System.out.println("Result of method 1: "+arr[arr.length-2]); 
		
		
		/* Method-2 */
		int first = arr[0];
		int second = arr[0];
		for (int i = 0 ; i < arr.length; i++) {
			if(arr[i] >= first) {
				second = first;
				first = arr[i];
			}
			
		}
		System.out.println("Result of method 2: "+ second);

	}

}
