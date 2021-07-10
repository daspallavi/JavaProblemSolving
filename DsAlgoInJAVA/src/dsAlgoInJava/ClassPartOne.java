package dsAlgoInJava;

public class ClassPartOne {

	// template for creating object
	//user define type

	public static boolean isPalindrome(int x) {

		int lastDigit,sum=0,a;
		a=x;

		// Code to reverse a number
		while(a>0)
		{   System.out.println("Input Number "+a);
			lastDigit=a%10; //getting remainder
			System.out.println("Last Digit "+lastDigit);
			System.out.println("Digit "+lastDigit+ " was added to sum "+(sum*10));
			sum=(sum*10)+lastDigit;
			a=a/10;

		}

		// if given number equal to sum than number is palindrome otherwise not palindrome
		if(sum==x)
			System.out.println("Number is palindrome ");
		else
			System.out.println("Number is not palindrome");

		return sum==x;

	}
	
	
	public static void main(String[] args) {

		System.out.println("hello");
		System.out.println(isPalindrome(131));

	}

}
