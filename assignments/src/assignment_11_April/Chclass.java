package assignment_11_April;

public class Chclass extends Prclass
{

	public void Master(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("the multiplication functionality output is "+c);
	}
		public static void main(String[] args) 
		{	
			Chclass ch=new Chclass();
			ch.Master(50, 10);
		}

}
