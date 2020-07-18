package assignment_18_april;
/*swapping of two numbers with using 3rd variable*/

import java.util.Scanner;

public class Swap1 
{
	int c;
	public void Swappo(int a,int b)
	{
		
		System.out.println("the value of a before swapping " + a);
		System.out.println("the value of b before swapping " + b);
	c=a;	
	a=b;
	b=c;
	
	System.out.println("the value of a after swapping " + a);
	System.out.println("the value of b after swapping " + b);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x1 ");
		int x1=sc.nextInt();
		System.out.println("enter the value of x2 ");
		int x2=sc.nextInt();
	
		
		
		Swap1 sw=new Swap1();
		sw.Swappo(x1, x2);
		
	}
}
