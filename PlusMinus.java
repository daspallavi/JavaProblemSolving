package com.practicejava.learning;

public class PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{-10,0,7,-4};
		 int length = arr.length;
	        float positiveNumberCount = 0;
	        float negativeNumberCount = 0;

	        for (int i = 0; i < length; i++) {
	            if (arr[i] > 0)
	                positiveNumberCount++;
	            else if (arr[i] < 0)
	                negativeNumberCount++;
	        }

	        System.out.printf("%.6f\n", positiveNumberCount / length);
	        System.out.printf("%.6f\n", negativeNumberCount / length);
	        System.out.printf("%.6f",
	                (float) (length - (positiveNumberCount + negativeNumberCount))
	                        / length);
	}

}
