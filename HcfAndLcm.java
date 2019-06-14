package com.practicejava.learning;

import java.util.Scanner;

public class HcfAndLcm {
	
	static void hcfAndLcm(long num1, long num2) {
		long hcf =0, lcm=0;
		long a , b ,temp;
        a=num1;
        b=num2;
        while(b != 0)
        {
            temp = b;
            b = a%b;
            a = temp;
        }
		
        hcf = a;
        lcm = (num1*num2)/hcf;
	
        System.out.print("HCF = " +hcf);
        System.out.print("\nLCM = " +lcm);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long testcase = s.nextLong();
		for(long i = 0; i < testcase; i++) {
            long num1=s.nextLong();
           long  num2= s.nextLong();
           hcfAndLcm(num1, num2);
       }
//		long t = 7777;
//		System.out.print("t = " +t);
   
	}

}
