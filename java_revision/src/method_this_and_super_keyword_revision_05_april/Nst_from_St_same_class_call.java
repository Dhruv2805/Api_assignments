package method_this_and_super_keyword_revision_05_april;

public class Nst_from_St_same_class_call
{
	public void non_st_method()
	{
		System.out.println("non static method");
	}
	public static void main(String[] args) 
	{
		Nst_from_St_same_class_call nst=new Nst_from_St_same_class_call();		//static mehtod call by creating object call only
		nst.non_st_method();
	}
}
