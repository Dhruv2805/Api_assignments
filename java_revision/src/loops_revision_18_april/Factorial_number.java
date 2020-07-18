package loops_revision_18_april;

import java.util.Scanner;

public class Factorial_number 
{
	int facto=1;
	public void factorial(int a)
	{
		for(int i=a;i>=1;i--)
		{
			facto=facto*i;
		}
		System.out.println("factorial of a number is "+facto);
	}
	
	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number which factorial you want to print  ");
	int m=sc.nextInt();
	
	
	
	Factorial_number fact=new Factorial_number();
	fact.factorial(m);
	}
}
