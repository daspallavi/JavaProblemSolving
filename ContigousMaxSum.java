package com.practicejava.learning;

public class ContigousMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = new int[] {-2,-3,4,-1,-2,1,5,-3};
		 //int[] arr = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		int[] arr = new int[] {500,-20};
		 int max_sum=arr[0];
		 int max_now =arr[0];
		 for(int i=1; i<arr.length; i++) {
			 
			  
			  max_now = Math.max(arr[i], max_now+arr[i]);
			  max_sum = Math.max(max_sum, max_now);
//			
		 }
		 System.out.println(max_sum);

	}

}
