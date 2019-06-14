package com.practicejava.learning;

import java.util.Scanner;

public class SI_SumOfPairs {

	public static boolean checkPair(int [] ar,int k) {
		boolean result = false;
		for(int i=0; i<ar.length-1 ; i++) {
			 for(int j =0; j<ar.length-1; j++) {
				 if(i!=j && (ar[i]+ar[j] == k)) {
					System.out.println("True"); 
					
					result = true;
					break;
					
				 }
				 else {
					result = false;
					
				 }
				
			 }
		 }
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //int[] ar = new int[]{3, 1,4,5,2};
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of elements");
		 int n=s.nextInt();
	        int ar[]=new int[n];

	        System.out.println("enter elements");
	        for(int i=0;i<n;i++){//for reading array
	            ar[i]=s.nextInt();

	        }
		
		int k = 7;
		
		System.out.println(checkPair(ar, k));  
		
		
	}

}
