package assignment_18_april;
/* to display a table of a given number from a user input*/

import java.util.Scanner;

public class Table 
{
	
	public void method1(int a)
	{
		
		int b;
		for(int i=1;i<=10;i++)
		{
			 
			System.out.println(a+ "*" +i+ "="  +a*i);
			
		}
			
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x1 ");
		int x1=sc.nextInt();
		
		Table m1=new Table();
		m1.method1(x1);
		
	}
	
}
