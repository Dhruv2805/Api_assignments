package assignment_22_march;
//Question-2    ((((((10/2)-2)+2)-2)+2)*2)
public class Calculation2 
{
	public int div(int a,int b)
	{
		int c;
		c=a/b;
		return c;
	}
	public int sub(int e,int f)
	{
		int g;
		g=e-f;
		return g;
	}
	public int sum(int m,int n)
	{
		int p;
		p=m+n;
		return p;
	}
	public void mul(int x,int z)
	{
		int y;
		y=x*z;
		System.out.println("result is" +y);
	}
	
	public static void name(String[] args)
	{
		Calculation2 ob=new Calculation2();
		int div_res=ob.div(10,2);
		int sub_res=ob.sub(div_res,2);
		int sum_res=ob.sum(sub_res,2);
		int sub1_res=ob.sub(sum_res,2);
		int sum1_res=ob.sum(sub1_res,2);
		ob.mul(sum1_res,2);
	}

}
