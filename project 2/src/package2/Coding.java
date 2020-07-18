package package2;


public class Coding
{
	
	
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int e,int f)
	{
		int g;
		g=e-f;
		return g;
	}
	public int mul(int p,int q)
	{
		int r;
		r=p*q;
		return r;
	}
	public void div(int x,int z)
	{
		int y;
		y=x/z;
		System.out.println("result is" +y);
	}
	
	public static void main(String [] args )
	{
		Coding ob=new Coding();
		int sum_result=ob.sum(10, 2);
		int sub_result=ob.sub(sum_result, 2);
		int sum1_result=ob.sum(sub_result, 2);
		int mul_result=ob.mul(sum1_result, 2);
		ob.div(mul_result,2);
	}
	

}
