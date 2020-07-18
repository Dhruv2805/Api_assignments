package assignment_26_April;

public class Pattern1
{
	public static void main(String[] args)
	{
		for(int row=1;row<=5;row++)
		{
			for(int colm=1;colm<=row;colm++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
