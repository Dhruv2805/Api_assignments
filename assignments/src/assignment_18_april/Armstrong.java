package assignment_18_april;
/* to check whether the given number is a armstrong or not*/

import java.util.Scanner;

public class Armstrong 
{
	int sum;

	public void Method1(int n)
	{
		
		int temp;
		temp=n;
		
		int rem;
		
		while(n>0)
		{
			rem=n%10;
			 sum=sum+(rem*rem*rem);
			 
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println("it is an Armstrong number");
		}
		else
		{
			System.out.println("it is not an Armstrong number");
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number " );
		int x1=sc.nextInt();
		
		Armstrong m1=new Armstrong();
		m1.Method1(x1);
	}
}
