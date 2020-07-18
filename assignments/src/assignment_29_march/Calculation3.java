package assignment_29_march;

import java.util.Scanner;
/*assignment 1

(((((x1+x2)-x3)+x4)*x5)/x5)*/

public class Calculation3
{
	public int sum(int m,int n)
	{
		int a=m+n;
		return a;
	}
	public int sub(int o,int p)
	{
		int b=o-p;
		return b;
	}
	public int mul(int q,int r)
	{
		int c=q*r;
		return c;
	}
	public void div(int s, int t)
	{
		int d=s/t;
		System.out.println("the result is :" +d);
	}
public static void main(String[] args)
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the value of x1 ");
	int x1=sc.nextInt();
	System.out.println("please enter the value of x2 ");
	int x2=sc.nextInt();
	System.out.println("please enter the value of x3");
	int x3=sc.nextInt();
	System.out.println("please enter the value of x4 ");
	int x4=sc.nextInt();
	System.out.println("please enter the value of x5");
	int x5=sc.nextInt();
	Calculation3 c=new Calculation3();
	int sum_result=c.sum(x1,x2);
	int sub_result=c.sub(sum_result, x3);
	int sum1_result=c.sum(sub_result, x4);
	int mul_result=c.mul(sum1_result, x5);
				c.div(mul_result,x5);
				
}

}
