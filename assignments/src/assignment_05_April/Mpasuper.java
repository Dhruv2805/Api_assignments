package assignment_05_April;

public class Mpasuper 
{
	public void m0()
	{
		System.out.println("parent default method");
	}
	public void m1(int a)
	{
		System.out.println("parent 1 parameterized method");
	}
	public void m2(int a,int b)
	{
		System.out.println("parent 2 parameterized method");
	}
	public void m3(int a,int b,int c)
	{
		
		System.out.println("parent 3 parameterized method");
		this.m0();
	}
	

}
