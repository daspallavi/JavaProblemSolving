package com.practicejava.learning;

public class CatAndMouse {
	public static void main(String[] args) {
		
		int x = 1;
		int y=2;
		int z=3;
		
		 int diffzx= Math.abs(z-x); 
         int diffzy= Math.abs(z-y);
         if(diffzx>diffzy)
             System.out.println("Cat B");
         else if(diffzx<diffzy)
             System.out.println("Cat A");
             else
             System.out.println("Mouse C");
         
	}
	

}
