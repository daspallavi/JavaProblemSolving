package com.practicejava.learning;

public class BeautifulDay {

	static int NumberOfDays(int i , int j , int k) {
		int count=0; 
		
		for(int s = i; s<=j ; s++) {
			int reverse = 0;
			//System.out.println("s"+s);
			int m = s;
			while(m !=0) {
				int digit = m% 10;
				reverse = reverse*10 + digit;
				m /=10;
				
			}
			System.out.println("s"+s);
			System.out.println("rev"+reverse);
			
			if(Math.abs(s - reverse)%k ==0) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i = 20, j =23, k =6;
		int i = 13, j =45, k =3;
		
		NumberOfDays(i ,j , k);
	}

}
