package method_this_and_super_keyword_revision_05_april;

public class Method_child extends Method_parent
{
	public void cmethod0()
	{
		System.out.println("child default");
	}
	public void cmethod1(int a)
	{
		
		System.out.println("child one param");
	}
	public void cmethod2(int a,int b)
	{
		super.method2(18, 19);
		this.cmethod4(15, 16, 17,18);
		this.cmethod0();
		this.cmethod1(13);
		System.out.println("child two param");
	}
	public void cmethod4(int a,int b ,int c,int d)
	{
		System.out.println("child four param");
	}
	
	public static void main(String[] args) 
	{
		Method_child ch=new Method_child();
		ch.cmethod2(11, 12);
	}
}
