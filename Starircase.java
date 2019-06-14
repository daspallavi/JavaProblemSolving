package com.practicejava.learning;

import java.util.Scanner;

public class Starircase {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num  = Integer.parseInt(sc.nextLine());
        for(int j=0;j<num;j++){
            for(int i=1;i<=num;i++){
            	 int m = num-j;
                System.out.print(i<m?" ":"#");
            }
            System.out.println("");
        }

	}

}
