package com.practicejava.learning;

public class ElectronicShop {
	
	 public static void main(String[] args) {
		 int[] keyboards = new int[]{3, 1};
		  int[] drives = new int[]{5, 2, 8};
		  int b =10;
		  //int max_spend=-1;
		 
//		  for(int i =0 ; i < keyborads.length; i++) {
//			  for(int j =0 ; j < drives.length; j++) {
//				  if(keyborads[i] + drives[i] <= budget) {
//					  int temp = keyborads[i] + drives[i] ;
//					  if(temp<= budget && temp > max_spend) {
//						  max_spend = temp;  
//					  }
//					 // max_spend = temp > max_spend? temp:max_spend; 
//				  }
//			  }
//		  }
		  
		  int max = -1;
	        for (int i = 0; i < keyboards.length; i++) {
	            for (int j = 0; j < drives.length; j++) {
	                if (keyboards[i] + drives[j] <= b && keyboards[i] + drives[j] > max)
	                    {max = keyboards[i] + drives[j];}
	                    
	            }
	        }
		  System.out.println(max);
	 }
	 

}
