package com.practicejava.learning;



import java.io.*;
import java.util.*;


public class PickingNumbers {
	public static void main(String[] args) throws IOException {
		//System.out.println(pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
		System.out.println(pickingNumbers(Arrays.asList(1,2,2,3,1,2)));
		
	}
	
	public static int pickingNumbers(List<Integer> a) {
		// Write your code here
		Collections.sort(a);
		int gMax =0;
		int lMax = 1;
		for (int i = 0 ; i <a.size()-1; i++){
			for( int j =i+1; j <a.size(); j++ ) {
				System.out.println("i:j::" + i + ":" + j);
				if(Math.abs(a.get(i) - a.get(j))<=1){
					
					lMax++;
				} 
				else{
					System.out.println(String.format("Mismatch at : %d. Values are %d and %d", j, a.get(i), a.get(j)));
					if(gMax < lMax){
						gMax = lMax;

					}
					lMax =1;
					i = j-1;
					break;
				} 
			}
			   
		}
		if(gMax < lMax){
			gMax = lMax;

		}
		System.out.println(gMax);
		return gMax;

	}
}
