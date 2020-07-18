package loops_revision_18_april;

import java.util.Scanner;

public class Armstrong_number 
{	
	public void armstrong(int a)
	{
		int temp=a;
		int sum=0;
		
		while(a!=0)
		{
			
			int rem=a%10;
			int x=a/10;
			sum=(sum+(rem*rem*rem));
			a=x;
		}
		if(sum==temp)
		{
			System.out.println("number is armstrong "+sum);
		}
		else
		{
			System.out.println("number is not armstrong ");
		}
	 }
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number  ");
		int m=sc.nextInt();
		
		Armstrong_number arm=new Armstrong_number();
		arm.armstrong(m);
	}
}
