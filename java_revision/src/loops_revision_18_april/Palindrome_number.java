package loops_revision_18_april;

import java.util.Scanner;

public class Palindrome_number 
{
	public void palindrome(int a)
	{
		int temp=a;
		
		int sum=0;
		while(a!=0)
		{
			
			int rem=a%10;
			int x=a/10;
			sum=(sum*10)+rem;
			a=x;
			
		}
		if (sum==temp)
		{
			System.out.println("number is palindrome "+sum);
		}
		else
		{
			System.out.println("number is not a palindrome ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number  ");
		int m=sc.nextInt();
		
		Palindrome_number pl=new Palindrome_number();
		pl.palindrome(m);
	}
}
