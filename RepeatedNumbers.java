package com.practicejava.learning;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;



public class RepeatedNumbers {

	static void repeatedNumbers(int ar[], int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		//Integer [] ans;
		for (int i =0 ; i < n ; i++) {
			int num = ar[i];
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}
			else {
				map.put(num,1);
			}
		}
		
		int maxValueInMap=(Collections.max(map.values()));
		//System.out.println("maxValueInMap"+minValueInMap);
		for (Entry<Integer, Integer> entry : map.entrySet()) {  // Itrate through hashmap
           
			if (entry.getValue()==maxValueInMap) {
                System.out.print(entry.getKey() + " ");       
              
            }
        }
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[]{1,5,2,3,4,6,3,5};
		int n = a.length;
		repeatedNumbers(a, n);
         
	}

}
