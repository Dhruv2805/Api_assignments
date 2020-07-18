package assignment_26_April;

public class Pattern2
{
	public static void main(String[] args)
	{
		for(int row=1;row<=5;row++)
		{
			for(int colm=5;colm>=row;colm--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
