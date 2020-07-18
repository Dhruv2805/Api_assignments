package pkg1;

public class Met
{
	public void method1()
	{
		

		System.out.println(" this is default constructor ");
	}
	public void method2(int a)
	{
	

		System.out.println(" this is one parameterized constructor ");
	}	
	public void method3(int a,int b)
	{
		this.method5(10,20,30,40);
		this.method1();
		this.method2(10);
		this.method4(10,20,30);
		System.out.println(" this is two parameterized constructor ");
	}
	public void method4(int a,int b,int c)
	{
		

	System.out.println(" this is three parameterized constructor ");
	}
	public void method5(int a,int b,int c,int d)
	{
	System.out.println(" this is four parameterized constructor ");
	}

	public static void main(String[] args) 
	{
		Met drv=new Met();
		drv.method3(10, 20);
		
	}

}
