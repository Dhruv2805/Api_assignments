package assignment_26_April;

public class Pattern4 
{
	
	public static void main(String[] args)
	{
		for(int row=1;row<=5;row++)
		{
			
			for(int colm=5;colm>=row;colm--)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=row;k++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}
