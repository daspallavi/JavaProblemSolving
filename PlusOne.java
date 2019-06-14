package com.practicejava.learning;

import java.util.ArrayList;

public class PlusOne {
	
	public static ArrayList<Integer> incrementVector(ArrayList<Integer> a) 
    { 
//        int n = a.size(); 
//      
//        // Add 1 to last digit and find carry 
//        a.set(n - 1, a.get(n - 1) + 1); 
//        int carry = a.get(n - 1) / 10; 
//        a.set(n - 1, a.get(n - 1) % 10); 
//      
//        // Traverse from second last digit 
//        for (int i = n - 2; i >= 0; i--) 
//        { 
//            if (carry == 1) 
//            { 
//            a.set(i, a.get(i) + 1); 
//            carry = a.get(i) / 10; 
//            a.set(i, a.get(i) % 10); 
//            } 
//        } 
//      
//        // If carry is 1, we need to add 
//        // a 1 at the beginning of vector 
//        if (carry == 1) 
//        a.add(0, 1); 
//        return a;
		
		
		 int s, carry=1;
		    s = a.size();
		    ArrayList<Integer> result =new ArrayList<Integer>();
		    for(int i=s-1;i>=0;i--)
		    {
		        int sum;
		        sum = a.get(i)+ carry;
		        carry = sum/10;
		        result.add(sum%10);
		    }
		    result.add(carry);
		    s = result.size();
		    int i = s-1;
		    ArrayList<Integer> ans =new ArrayList<Integer>();
		    while(i>=0 && result.get(i)==0)
		    {
		        i--;
		    }
		    while(i>=0)
		    {
		        ans.add(result.get(i));
		        i--;
		    }
		    return ans;
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> vect=new ArrayList<Integer>(); 
	        vect.add(1); 
	        vect.add(2); 
	        vect.add(3); 
	        vect.add(4); 
	          
	        incrementVector(vect); 
	      
	        for (int i = 0; i < vect.size(); i++) 
	        System.out.print(vect.get(i) + " "); 
	        } 

	}


