package assignment_18_april;
/*swapping of two numbers without using 3rd variable*/

import java.util.Scanner;

public class Swap_Add_mul 
{


	public void swappo_add_sub(int a,int b)
	{
		System.out.println("the value of a before swapping using addition and subtraction " + a);
		System.out.println("the value of b before swapping using addition and subtraction " + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("the value of a after swapping  using addition and subtraction " + a);
		System.out.println("the value of b after swapping using addition and subtraction " + b );
	}
	public void swappo_mul_div(int a,int b)
	{
		System.out.println("the value of a before swapping using multiplication and division " + a);
		System.out.println("the value of b before swapping using multiplication and division " + b);
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("the value of a after swapping using multiplication and division " + a);
		System.out.println("the value of b after swapping using multiplication and division " + b);
	}

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of x1 ");
			int x1=sc.nextInt();
			System.out.println("enter the value of x2 ");
			int x2=sc.nextInt();
		
			
			
			Swap_Add_mul sw=new Swap_Add_mul();
			sw.swappo_add_sub(x1, x2);
			sw.swappo_mul_div(x1, x2);
		}
}
