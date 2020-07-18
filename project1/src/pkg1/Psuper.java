package pkg1;

public class Psuper 
{
	public Psuper()
	{
		this(10,20,30);
		System.out.println("Parent default constructor");
	}
	public Psuper(int a)
	{
		this();
		System.out.println("Parent 1 parameterized constructor");
	}
	public Psuper(int a,int b)
	{
		this(10);
		System.out.println("Parent 2 parameterized constructor");
	}
	public Psuper(int a,int b,int c)
	{
		
		System.out.println("Parent 3 parameterized constructor");
	}
}
