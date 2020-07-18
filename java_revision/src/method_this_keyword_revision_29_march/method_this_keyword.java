package method_this_keyword_revision_29_march;



public class method_this_keyword 
{
	
	public void method0()
	{
		System.out.println("default method");
	}
	public void method1(int a)
	{
		System.out.println("1 param method");
	}
	public void method2(int a,int b)
	{
		this.method4(24, 25, 27, 28);
		this.method0();
		this.method1(23);
		this.method3(22, 33, 44);
		System.out.println("2 param method");
	}
	public void method3(int a,int b,int c)
	{
		System.out.println("3 param method");
	}
	public void method4(int a,int b,int c,int d)
	{
		System.out.println("4 param method");
	}
	
	public static void main(String[] args)
	{
		method_this_keyword mtk=new method_this_keyword();
		mtk.method2(11, 12);
		
	}
}
