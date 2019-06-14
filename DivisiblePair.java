package com.practicejava.learning;

public class DivisiblePair {

	public static void main(String[] args) {
		int ar [] =new int [] {1,3 ,2, 6, 1, 2};
		int k=3;
		// TODO Auto-generated method stub
		int pair = 0;
		 for (int i = 0; i < ar.length; i++) {
	            for (int j = i; j < ar.length; j++) {
	                if (i != j && (ar[i] + ar[j]) % k == 0) {
	                	pair++;
	                }
	            }
	        }

  System.out.println(pair);

	}

}
