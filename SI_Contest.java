package com.practicejava.learning;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;



public class SI_Contest {
	 static int stringCompare(String str1, String str2) 
	 { 

	     int l1 = str1.length(); 
	     int l2 = str2.length(); 
	     int lmin = Math.min(l1, l2); 
	     System.out.println("l1:"+l1+ " l2:"+l2+" lmin:"+lmin);

	     for (int i = 0; i < lmin; i++) { 
	         int str1_ch = (int)str1.charAt(i); 
	         int str2_ch = (int)str2.charAt(i);
	         System.out.println("str1_ch: " + str1_ch + "str2_ch:"+str2_ch);

	         if (str1_ch != str2_ch) { 
	             return str1_ch - str2_ch; 
	         } 
	     } 

	     // Edge case for strings like 
	     // String 1="Geeks" and String 2="Geeksforgeeks" 
	     if (l1 != l2) { 
	         return l1 - l2; 
	     } 

	     // If none of the above conditions is true, 
	     // it implies both the strings are equal 
	     else { 
	         return 0; 
	     } 
	 } 
	
	
	
	
	
    public static void main(String args[]) {
	
	
	
	
	String string1 = new String("Practice"); 
    String string2 = new String("Practice"); 
   // String string3 = new String("Geeks"); 
    //String string4 = new String("Geeks"); 

    // Comparing for String 1 < String 2 
    System.out.println("Comparing " + string1 + " and " + string2 
                       + " : " + stringCompare(string1, string2)); 

    // Comparing for String 3 = String 4 
    //System.out.println("Comparing " + string3 + " and " + string4 
      //                 + " : " + stringCompare(string3, string4)); 

    // Comparing for String 1 > String 4 
    //System.out.println("Comparing " + string1 + " and " + string4 
      //                 + " : " + stringCompare(string1, string4)); 
	
	
	
    }
	
	/** checking power of 2 **/
//	static boolean check(long n) 
//    { 
//        if (n == 0) 
//            return false; 
//  
//        while (n != 1) { 
//            if (n % 2 != 0) 
//                return false; 
//            n = n / 2; 
//        } 
//        return true; 
//    } 
//	public static void main(String[] args) {
//		 Scanner s=new Scanner(System.in);
//	       
//		 long testcase = s.nextLong();
//	        
//	        for(int i = 0; i < testcase; i++) {
//	            
//	            long n=s.nextLong();
//	            if(check(n)){
//	                System.out.println("True");
//	            }
//	            else{
//	                System.out.println("False");
//	            }
//	        }
//	}

	/** pascal triangle **/
//
//    public static void main (String[] args) { 
//        int n = 5; 
//        printPascal(n); 
//    } 
//  
//public static void printPascal(int n) 
//{ 
//// An auxiliary array to store generated pascal triangle values 
//int[][] arr = new int[n][n];  
//  
//// Iterate through every line and print integer(s) in it 
//for (int line = 0; line < n; line++) 
//{ 
//    // Every line has number of integers equal to line number 
//    for (int i = 0; i <= line; i++) 
//    { 
//    // First and last values in every row are 1 
//    if (line == i || i == 0) 
//        arr[line][i] = 1; 
//    else // Other values are sum of values just above and left of above 
//        arr[line][i] = arr[line-1][i-1] + arr[line-1][i]; 
//    System.out.print(arr[line][i]); 
//    } 
//    System.out.println(""); 
//} 
//} 
	
	/** triplet sum **/
//	 public static void main (String[] args) { 
//		 int ar [] =new int [] { 2, 7, 5, 3, 8, 4, 1, 9};
//		   int a = 8;
//		   int b =16;
//		   int count =0;
//		  int n = ar.length;
//		  int k;
//		  int ans = 0; 
//		  
//		    // Fix the first  
//		    // element as A[i] 
//		    for (int i = 0; i < n - 2; i++) 
//		    { 
//		  
//		        // Fix the second  
//		        // element as A[j] 
//		        for (int j = i + 1; j < n - 1; j++)  
//		        { 
//		  
//		            // Now look for the 
//		            // third number 
//		            for ( k = j + 1; k < n; k++) 
//		            { 
//		                if (ar[i] + ar[j] + ar[k] >= a && 
//		                    ar[i] + ar[j] + ar[k] <= b) 
//		                    {ans++;} 
//		            } 
//		        } 
//		    } 
//		  
//		   
//		   System.out.println(ans);
//		   ZonedDateTime dateTime = Instant.ofEpochMilli(1318388699000L)
//		            .atZone(ZoneId.of("Australia/Sydney"));
//	 
//	 
//}
	
}
