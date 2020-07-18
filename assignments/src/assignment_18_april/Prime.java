package assignment_18_april;
/* to check whether the given number is a prime  or not*/

import java.util.Scanner;

public class Prime 
{
	public void Pnumber(int a)
	{
		int i=1;
		int c=0;
	
		
			while(i<=a)
			{
				if(a%i==0)
					c=c+1;
				i++;
			}
			if(c==2)
			{
				System.out.println("prime number");
			}
			else
			{
				System.out.println("not prime number");
			}
		
	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number " );
		int x1=sc.nextInt();
		
		Prime prm=new Prime();
		prm.Pnumber(x1);
	}
}
