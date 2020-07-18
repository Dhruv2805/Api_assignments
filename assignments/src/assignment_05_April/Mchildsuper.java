package assignment_05_April;



public class Mchildsuper extends Mpasuper
{
	public void C0()
	{
		System.out.println("child default method");
	}
	public void C1(int a)
	{
		
		System.out.println("child 1 parameterized method");
	}
	public void C2(int a,int b)
	{
		super.m3(10,20,30);
		super.m1(10);
		super.m2(10,20);
		this.C4(10,20,30,40);
		this.C0();
		this.C1(10);
		System.out.println("child 2 parameterized method");
	}
	public void C3(int a,int b,int c)
	{
		System.out.println("child 3 parameterized method");
	}
	public void C4(int a,int b,int c,int d)
	{
		System.out.println("child 4 parameterized method");
	}
	
	
	public static void main(String[] args)
	{
		Mchildsuper Mch=new Mchildsuper();
		Mch.C2(10,20);
	}


}
