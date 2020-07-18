package assignment_21_march;

/*
//using  this keyword print method sequences
4 parameterized
0 default
1 parameterized
3 parameterized
2 parameterized*/

public class Method1 
{
	public void method()
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
		this.method();
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
		Method1 drv=new Method1();
		drv.method3(10, 20);
		
	}

}
