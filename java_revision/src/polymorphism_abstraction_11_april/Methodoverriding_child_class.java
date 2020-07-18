package polymorphism_abstraction_11_april;

public class Methodoverriding_child_class extends Methodoverriding_parent_class
{
	public void calc(int a,int b) 
	{
		int d;
		d=a*b;
		System.out.println("mult has override the sum functionality is "+d);
	}
	
	public static void main(String[] args) 
	{
		Methodoverriding_child_class mpa=new Methodoverriding_child_class();
		mpa.calc(10, 20);
	}
}
