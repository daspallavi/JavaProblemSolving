package com.practicejava.learning;

public class LeftRotateArray {

	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 3,4,5,6};
		int k = 2;
		int n = arr.length;
		System.out.println(n);
		int[] temp = new int [k];

		
		for (int i = 0 ; i< k ; i++ ) {
			temp[i] = arr[i];
		}
		
		for(int j = 0 ; j < n-k; j++ ) {
			arr[j] = arr[j+k];
		}
		
	   for(int l= 0; l<k; l++)	{
		   arr[n-k+l] = temp[l];
	   }
	    
	   for (int m = 0 ; m<= n-1 ; m++ ) {
		 System.out.println(arr[m]);	
		}
		

	}

}
