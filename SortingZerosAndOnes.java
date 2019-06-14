package com.practicejava.learning;

public class SortingZerosAndOnes {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{0, 0, 1, 0,1,1,0,0,1,1};
		int n = a.length;
		System.out.println(n);
		int p1 = 0, p2= n-1; 
		int temp;
		while(p1 < p2) {
			
			if(a[p1]==0) {
				
				p1++;
			}
			
			if(a[p2] == 0) {
				
				p2--;
			}
			
			if(a[p1] == 1 && a[p2] ==0) {
				
				temp = a[p2];
				a[p2] = a[p1];
				a[p1] = temp;
				
			}
			
		}
		
		
		
		

	}

}
