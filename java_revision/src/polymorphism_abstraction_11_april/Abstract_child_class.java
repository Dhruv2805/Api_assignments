package polymorphism_abstraction_11_april;

public class Abstract_child_class extends Abstract_parent_class
{
	public void method1()
	{
		System.out.println("abstract method1");
	}
	public void method2()
	{
		System.out.println("abstract method2");
	}
	
	public static void main(String[] args) 
	{
		Abstract_child_class ab_child=new Abstract_child_class();
		ab_child.method1();
		ab_child.method2();
		ab_child.hello();
	}
}
