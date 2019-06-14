package com.practicejava.learning;

public class HollowDiamondPattern {

	
	  static void printPattern(int n) 
	    { 
	        int i, j, space, k = 0; 
	      
	        // Print upper triangle 
//	        for (i = 1; i <= n; i++) { 
//	      
//	            // Print spaces 
//	            for (j = 1; j <= n - i; j++) { 
//	                System.out.print(" "); 
//	            } 
//	      
//	            // Print # 
//	            while (k != (2 * i - 1)) { 
//	                if (k == 0 || k == 2 * i - 2) 
//	                    System.out.print("#"); 
//	                else
//	                    System.out.print(" "); 
//	                k++; 
//	            } 
//	            k = 0; 
//	      
//	            // move to next row 
//	            System.out.println(); 
//	        } 
//	        n--; 
//	      
//	        // Print lower triangle 
//	        for (i = n; i >= 1; i--) { 
//	      
//	            // Print spaces 
//	            for (j = 0; j <= n - i; j++) { 
//	                System.out.print(" "); 
//	            } 
//	      
//	            // Print # 
//	            k = 0; 
//	            while (k != (2 * i - 1)) { 
//	                if (k == 0 || k == 2 * i - 2) 
//	                    System.out.print("#"); 
//	                else
//	                    System.out.print(" "); 
//	                k++; 
//	            } 
//	            System.out.println(); 
//	        } 
    } 
	
	  
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 6; 
	      
	        printPattern(n);
	}

}
