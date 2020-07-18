package assignment_04_April;


public class Non_st_within_class 
{
	
		
		public void mno()
		{
			System.out.println("I am  a non static method calling from a static method of other  same class");
		}
		
		public static void main(String[] args)
		{
				
			 Non_st_within_class Nst=new Non_st_within_class();
			 Nst.mno();
			 
		}
	
}
