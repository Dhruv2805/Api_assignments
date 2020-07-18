package double_loops_program_revision_25_April;

public class Pattern6_assig6
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=i;j-- )
			{
				System.out.print(" ");
			}
			for(int k=0;k<(2*i+1);k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
