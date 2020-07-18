package assignment_04_April;


public class St_other_class2
	{
		public static void xyz()
		{
			System.out.println("");
		
		}
		public static void main(String[] args) {
			{
				St_within_class.abc();	//calling by class name with different class creation
				St_within_class st=new St_within_class();	//calling by object creation
				st.abc();
			}
		}

	

}
