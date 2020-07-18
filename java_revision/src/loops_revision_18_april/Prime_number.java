package loops_revision_18_april;

import java.util.Scanner;

public class Prime_number
{
	public void prime(int a)
	{
		int count=0;
		
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
			count=count+1;
			}
		}
		if(count==2) 
		{
			System.out.println("number is a prime number");
		}
		else
		{
			System.out.println("number is not prime number");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of prime number you want to enquiry ");
		int m=sc.nextInt();
		
		Prime_number pr=new Prime_number();
		pr.prime(m);
	}
}
