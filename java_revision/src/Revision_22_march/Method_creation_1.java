//((((10+2)-2)+2)*2)/2)

package Revision_22_march;

import java.util.Scanner;

public class Method_creation_1 
{
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public int sub(int m,int n)
	{
		int o=m-n;
		return o;
	}
	
	public int mul(int j,int k)
	{
		int l=j*k;
		return l;
	}
	
	
	public void div(int p,int q)
	{
		int r=p/q;
		System.out.println("result is "+r);
	}
	
	public static void main(String[] args) 
	{
		Method_creation_1 mt=new Method_creation_1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x ");
		int x=sc.nextInt();
		System.out.println("enter the value of y ");
		int y=sc.nextInt();
		
		int sum=mt.sum(x,y);
		int sub=mt.sub(sum, y);
		int sum1=mt.sum(sub,y);
		int mul=mt.mul(sum1, y);
		 mt.div(mul,y);
		
		
		
	}
}
