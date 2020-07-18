package assignment_26_April;
/*reverse diamond*/

public class Pattern6 
{
	public static void main(String[] args)
	{
		for(int row=1;row<=5;row++)
		{
			
			for(int colm=1;colm<=row;colm++)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=2*row;k--)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}
