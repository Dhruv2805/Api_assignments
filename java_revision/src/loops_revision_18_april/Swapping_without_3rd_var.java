package loops_revision_18_april;

import java.util.Scanner;

public class Swapping_without_3rd_var 
{
	public void swap(int a,int b)
	{
		System.out.println("value of a before swap is "+a);
		System.out.println("value of b before swap is "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of a after swap is "+a);
		System.out.println("value of b after swap is "+b);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of m");
		int m=sc.nextInt();
		
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		
		Swapping_without_3rd_var swt=new Swapping_without_3rd_var();
		swt.swap(m, n);
	}
}
