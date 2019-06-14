package com.practicejava.learning;

import java.util.Scanner;

public class RightAngledTriangle {
	
	static void printRightTriangle(int n) {
		
		
		for(int i=1;i<=n;i++)
        {
			for(int j=0;j<n-i;j++)
                {
                        System.out.print(" ");
                }

				for(int j=0;j<i;j++)
                {
                        System.out.print("*");
                }
              System.out.println();
        } 


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //int n=3;
          Scanner s=new Scanner(System.in);
          
          int testcase = s.nextInt();
          for( int j =0; j< testcase; j++) {
        	  int n=s.nextInt();
        	  System.out.println("Case #"+j+1+":");
        	  printRightTriangle(n);
        	  
          }
          
          
		
		
	}

}
