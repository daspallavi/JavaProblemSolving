package com.practicejava.learning;

public class CircularRotationArray {

	public static void main(String[] args) {
		
		int[] input = new int[]{5, 2, 8};
		int n = input.length;
		int i;
		int k = 2;
		
		 for(int j = 0 ; j < k ; j++) {
			 int tmp = input[input.length-1];
			    for( i = input.length-1; i > 0; --i)
			    {
			        input[i] = input[i-1];
			    }
			    input[0] = tmp;
		 }
			

		       
		
		for(int i1 =0 ; i1<n; i1++) {
		
		 System.out.println(input[i1]);}
	}

}
