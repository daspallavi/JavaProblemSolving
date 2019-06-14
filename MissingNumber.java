package com.practicejava.learning;

public class MissingNumber {

	static int getMissingNo (int a[], int n) 
    { 
        int i, total; 
        total  = (n+1)*(n+2)/2;    
        for ( i = 0; i< n; i++) 
           total -= a[i]; 
        return total; 
    } 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = {8 ,11, 10 ,2, 7, 4, 3, 5, 1, 6  }; 
	        int miss = getMissingNo(a,a.length); 
	        System.out.println(miss);    
	}

}
