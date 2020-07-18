package method_this_and_super_keyword_revision_04_april;


public class Child extends Parent
{
	public Child()
	{
		this(17,18,19);
		System.out.println("child default");
	}
	public Child(int a)
	{
		this();
		System.out.println("child one param");
	}
	public Child(int a,int b)
	{	
		this(12,13,14,15);
		System.out.println("child two param");
	}
	
	public Child(int a ,int b,int c)
	{
		super(20,21);
		
		System.out.println("child three param");
	}
	public Child(int a,int b,int c,int d)
	{
		this(16);
		System.out.println("child four param");
	}
	
	public static void main(String[] args)
	{
		Child ch=new Child(10,11);
	}
}
