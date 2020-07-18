package assignment_28_march;
/*Output should be in the below sequence(we have to create only one object)
four parameterized constructor
default constructor
two parameterized constructor
one parameterized constructor
three parameterized constructor*/

public class Constructor 
{
	public Constructor()
	{
		this(28,30,38,42);
		System.out.println("default constructor");
	}
	public  Constructor(int a)
	{
		this(60,70);
		System.out.println("one parameterized constructor");
	}
	public  Constructor(int a,int b)
	{
		this();
		System.out.println("two parameterized constructor");
	}
	public  Constructor(int a,int b,int c)
	{
		this(11);
		System.out.println("three parameterized constructor");
	}
	public  Constructor(int a,int b,int c,int d)
	{
		System.out.println("four parameterized constructor");
	}
	
	public static void main(String [] args)
	{
		Constructor C1=new Constructor(13,14,15);
		System.out.println("Constructor assignment completed");
	}
}
