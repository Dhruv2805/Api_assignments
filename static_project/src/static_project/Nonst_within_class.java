package static_project;

public class Nonst_within_class
{
	
	public void mno()
	{
		System.out.println("I am  a non static method calling from a static method of other  same class");
	}
	
	public static void main(String[] args)
	{
			
		 Nonst_within_class Nst=new Nonst_within_class();
		 Nst.mno();
		 
	}
}
