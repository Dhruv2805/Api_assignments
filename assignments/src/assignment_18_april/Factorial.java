package assignment_18_april;
/* to display a factorial of a given number from a user input*/

import java.util.Scanner;

public  class Factorial 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x1 ");
		int x1=sc.nextInt();
		
		int fact=1;
		for(int i=x1;i>0;i--) 
		{
			fact=fact*i;
			
		}
		System.out.println("factorial is " +fact);
		
	
	}
}
