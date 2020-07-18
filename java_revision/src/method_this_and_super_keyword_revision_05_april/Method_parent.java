package method_this_and_super_keyword_revision_05_april;

public class Method_parent 
{
	public void method0()
	{
		System.out.println("parent default");
	}
	public void method1(int a)
	{
		System.out.println("parent one param");
	}
	public void method2(int a,int b)
	{
		this.method3(11, 12, 13);
		this.method0();
		this.method1(11);
		System.out.println("parent two param");
	}
	public void method3(int a,int b,int c)
	{
		System.out.println("parent three param");
	}
}
