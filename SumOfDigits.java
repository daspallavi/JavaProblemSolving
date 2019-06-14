package com.practicejava.learning;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class SumOfDigits {

		  static void sumOfDigits(int n){
		     int sum = 0;
		      while(n!=0){
		          int digit = n%10;
		           sum = sum + digit;
		           n= n/10;
		          
		      }
		      System.out.println(sum);
		  }
		 
		
		public static void main (String[] args) throws java.lang.Exception
		{
			// your code goes here
			int testcase =0;
			 Scanner s=new Scanner(System.in);
			 if(s.hasNextLine()){
			      testcase = s.nextInt();
			 }
	       
	        for(int i = 0; i < testcase; i++) {
	            int n=s.nextInt();
	            sumOfDigits(n);
	        }
		}
	


}
