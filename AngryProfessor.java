package com.practicejava.learning;

public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = new int [] {-1, -3, 4, 2};
		int k =3;
		 String result ="";
	        int count = 0;
	        for (int i =0 ; i <a.length ; i++){
	            if(a[i]<=0){
	                count ++;
	            }            
	        }
	       if(count >= k){
	           result = "NO";
	       }
	       else{
	           result = "YES";
	       }

	       System.out.println(result); 

	}

}
