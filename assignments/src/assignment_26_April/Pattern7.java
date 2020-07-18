package assignment_26_April;
/* counting pattern 1 to 10 */

public class Pattern7 
{
	
	public static void main(String[] args)
	{
		int i=0;
		for(int row=1;row<=4;row++)
		{
			
			for(int colm=1;colm<=row;colm++)
			{
				i=i+1;
				System.out.print(i);
				
			}
			System.out.println("");
		}
	}
}
