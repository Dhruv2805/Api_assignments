package polymorphism_abstraction_11_april;

public class method_overloading 
{
	public void mul(int a,int b,int c)
	{
		int d;
		d=a*b*c;
		System.out.println("integer mult_result is "+d);
	}
	public void mul(int a,int b,float c)
	{
		float m;
		m=  a*b*c;
		System.out.println("int,int,float result is "+m);
	}
	public int mul(int a,int b)
	{
		int d=a*b;
		System.out.println("int,int result is "+d);
		return d;
	}
	
	public static void main(String[] args) 
	{
		method_overloading overload=new method_overloading();
		overload.mul(10, 2);
		overload.mul(10, 2, 12.4F);
		overload.mul(2, 3, 10);
	}
}
