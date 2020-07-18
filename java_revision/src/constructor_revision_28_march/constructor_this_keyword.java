package constructor_revision_28_march;

public class constructor_this_keyword 
{
	public constructor_this_keyword()
	{
		this(22,34,56,77);
		System.out.println("default cnst");
	}
	public constructor_this_keyword(int s)
	{
		this(15,16);
		System.out.println("1 cnst");
	}
	public constructor_this_keyword(int a,int b)
	{
		this();
		System.out.println("2 cnst");
	}
	
	public constructor_this_keyword(int a,int b,int c)
	{
		this(12);
		System.out.println("3 cnst");
	}
	public constructor_this_keyword(int a,int b,int c,int d)
	{
		System.out.println("4 cnst");
	}
	
	public static void main(String[] args) 
	{
		constructor_this_keyword ctk=new constructor_this_keyword(10,11,12);
	}
}
