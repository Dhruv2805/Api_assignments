package loops_revision_18_april;

import java.util.Scanner;

public class swapping_with_3rd_var 
{
	public void swap(int a ,int b)
	{
		
		System.out.println("value of a before swap is "+a);
		System.out.println("value of b before swap is "+b);
		
		int c;
		c=a;
		a=b;
		b=c;
		
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
		
		swapping_with_3rd_var sw=new swapping_with_3rd_var();
		sw.swap(m, n);
	}
}
