package method_this_and_super_keyword_revision_04_april;

public class Parent 
{
	public Parent()
	{
		this(24,25,26);
		System.out.println("parent default ");
	}
	public Parent(int a)
	{
		this();
		System.out.println("parent one param ");
	}
	public Parent(int a,int b)
	{
		this(22);
		System.out.println("parent two param");
	}
	public Parent(int a,int b,int c)
	{
		System.out.println("parent three param ");
	}
}
