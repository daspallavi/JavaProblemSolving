package com.practicejava.learning;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MigratoryBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer> map = new HashMap<>(); 
		int[] a = new int[]{1 ,2 ,3 ,4 ,5, 4 ,3, 2 ,1 ,3, 4};
		
		for(int i =0 ; i < a.length ; i++) {
			int num = a[i];
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}
			else {
				map.put(num,1);
			}
		}
		
		
		int maxValueInMap=(Collections.max(map.values()));
		System.out.println("maxValueInMap"+maxValueInMap);
		for (Entry<Integer, Integer> entry : map.entrySet()) {  // Itrate through hashmap
           
			if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey()); 
                break;// Print the key with max value
            }
        }
//		 Set<Entry<Integer,Integer>> hashSet=map.entrySet();
//	        for(Entry entry : hashSet ) {
//	            //System.out.println("Key="+entry.getKey()+", Value="+entry.getValue());
//	        	
//	        }
		
		

	}

}
