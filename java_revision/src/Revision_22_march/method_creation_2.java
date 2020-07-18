//(10/2)-2)+2)-2)+2)*2)
package Revision_22_march;

import java.util.Scanner;

public class method_creation_2 
{
	public int div(int a,int b)
	{
		int c=a/b;
		return c;
	}
	public int sub(int a,int b)
	{
		int d=a-b;
		return d;
	}
	public int sum(int a,int b)
	{
		int e=a+b;
		return e;
	}
	public void mul(int a,int b)
	{
		int f=a*b;
		System.out.println("the result is "+f);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x");
		int x=sc.nextInt();
		System.out.println("enter the value of y");
		int y=sc.nextInt();
		
		method_creation_2 mt2=new method_creation_2();
		int div=mt2.div(x, y);
		int sub=mt2.sub(div, y);
		int sum=mt2.sum(sub, y);
		int sub1=mt2.sub(sum, y);
		int sum1=mt2.sum(sub1, y);
		mt2.mul(sum1, y);
	}
}
