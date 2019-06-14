package com.practicejava.learning;
import java.lang.reflect.Array;
import java.util.Arrays;


public class AddOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int[] intArray = new int[]{ 1,2,3,4,3 };
		int n = intArray.length;
		int sum = 0;
		int k = n-1;
		System.out.println("n"+n);
		
		for (int i = 0; i< intArray.length; i++) {
		      sum = (int) (sum + intArray[i] * (Math.pow(10, k)));
		       k=k-1;
		}
		System.out.println("sum"+sum);
		sum = sum + 1;
		System.out.println("adding one"+sum);
		
		/** converting to array **/
		 int i = 0;
		 int length = String.valueOf(sum).length();
			System.out.println("length"+length);
		    int divisor = (int) Math.pow(10, length);
			System.out.println("divisor"+divisor);
		    int temp[] = new int[length + 1];

		    while (sum != 0) {
		        temp[i] = sum / divisor;
		        if (i < length) {
		            ++i;
		        }
		        sum = sum % divisor;
		        if (i != 0) {
		            divisor = divisor / 10;
		        }
		    }
		    
		    for(int j=0; j<temp.length;j++) {
		    	System.out.println(temp[j]);
		    }
		    
		
		

	}

}
