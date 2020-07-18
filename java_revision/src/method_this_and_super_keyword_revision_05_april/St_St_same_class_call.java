package method_this_and_super_keyword_revision_05_april;

public class St_St_same_class_call 
{
	static int a=11;
	public static void method1() 
	{
		System.out.println("static method1");
	}
	public static void main(String[] args) 
	{
		method1();							//static mehtod call by direct call
		St_St_same_class_call.method1();	//static mehtod call by classname call
		St_St_same_class_call st=new St_St_same_class_call();	//static mehtod call by creating object call
		st.method1();
		st.a=12;						//static variable call by direct call
		System.out.println(st.a);
		St_St_same_class_call.a=13;		//static variable call by classname call
		System.out.println(St_St_same_class_call.a);
		a=14;							//static variable call creating object call
		System.out.println(a);
	}
}
