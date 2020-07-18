package loops_revision_18_april;

import java.util.Scanner;

public class Fibonacci_series 
{
	public void fibonacci(int c)
	{
		int a=0;
		int b=1;
		int fibonac=0;
		
		System.out.println("the fibonacci series  is ");
		for(int i=0;i<=c;i++)
		{	
			 fibonac=a+b;
			a=b;
			b=fibonac;
			
			System.out.print(fibonac);
			System.out.print(" ");
		}
		
	}
	
	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the range of fibonacci series you want to see  ");
	int m=sc.nextInt();
	
	
	
	
	Fibonacci_series fib=new Fibonacci_series();
	fib.fibonacci(m);
	}
}
