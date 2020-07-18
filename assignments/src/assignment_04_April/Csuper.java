package assignment_04_April;

public class Csuper extends Psuper
{
	public Csuper()
	{
		this(10,20,30);
		System.out.println("Child default constructor");
	}
	public Csuper(int a)
	{
		this();
		System.out.println("Child 1 parameterized constructor");
	}
	public Csuper(int a,int b)
	{
		this(20,30,40,50);
		System.out.println("Child 2 parameterized constructor");
	}
	public Csuper(int a,int b,int c)
	{
		super(10,20);
		System.out.println("Child 3 parameterized constructor");
	}
	public Csuper(int a,int b,int c,int d)
	{
		this(10);
		System.out.println("Child 4 parameterized constructor");
	}

	public static void main(String[] args) 
	{
		Csuper Cs=new Csuper(10,20);
	}

}
