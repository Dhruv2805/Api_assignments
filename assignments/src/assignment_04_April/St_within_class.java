package assignment_04_April;



public class St_within_class 
{	
	public static void abc()
	{
		System.out.println("I am a static method called from a static method of other the same class");
	}
	public static void main(String[] args)
	{
		abc();	//directly called
		St_within_class.abc();	//called by class name
		St_within_class st=new St_within_class();
		st.abc();
	}

}