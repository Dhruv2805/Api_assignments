package assignment_18_april;

import java.util.Scanner;

/*  to display a Fibonacci series by taking a range from a user input*/

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		
		
		int a=0;
		int b=1;
		int c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range  of fibonacci series  ");
		int range=sc.nextInt();
		
		for(int i=1;i<=range;i++)
		{
			c=a+b;
			
			System.out.println( a+ " " );
			a=b;
			b=c;
			
		
			
		}
		
	}
}
