package com.practicejava.learning;
import java.io.*;
import java.util.*;
public class SumOfArray {
	    
	     static void sum(long ar[], long n) 
	     { 
	         long sum = 0; // initialize sum 
	         long i; 
	        
	         // Iterate through all elements and add them to sum 
	         for (i = 0; i < n; i++) {
	             sum +=  ar[(int)i]; 
	         }
	            
	         
	        
	         System.out.println(sum);
	     } 

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	         Scanner s=new Scanner(System.in);
	       
	        long testcase = s.nextLong();
	        
	        for(long i = 0; i < testcase; i++) {
	            
	            long n=s.nextLong();
	            long ar[]=new long[(int)n];
	            
	            for(long j=0;j<n;j++){
	                 ar[(int)j]=s.nextLong();
	            }
	            
	            sum(ar, n); 
	        } 
	    
	    
	    }
	}

