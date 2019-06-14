package com.practicejava.learning;

public class DiagonalDifference {
	public static int difference(int arr[][], int n) {
		int d1 = 0;
		int d2 = 0;
		
		for(int i=0; i<n; i++) {
			for(int j =0; j<n ; j++) {
				if(i==j) {
					//System.out.println(arr[i][j]);
					d1 += arr[i][j];
				}
				
				if(i== n-j-1) {
					System.out.println("sec dia i"+i);
					System.out.println("sec dia j"+j);
					System.out.println("sec dia"+arr[i][j]);
					
				}
				
				
			}
			
		}
		
		return Math.abs(d1-d2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		int arr[][] = {
				{11,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		
		System.out.println(difference(arr,n));
		

	}

}
