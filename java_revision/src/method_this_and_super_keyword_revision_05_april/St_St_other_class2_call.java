package method_this_and_super_keyword_revision_05_april;

public class St_St_other_class2_call 
{
	public static void main(String[] args)
	{
		St_St_other_class1_call.method_class1();
		St_St_other_class1_call st=new St_St_other_class1_call();
		st.method_class1();
		St_St_other_class1_call.a=11;
		System.out.println(St_St_other_class1_call.a);
	}
}
