package assignment_04_April;
/*
Output should be in the below sequence

Parent 3 parameterized constructor
Parent default constructor
Parent 1 parameterized constructor
Parent 2 parameterized constructor
Child 3 parameterized constructor
Child default constructor
Child 1 parameterized constructor
Child 4 parameterized constructor
Child 2 parameterized constructor*/


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
