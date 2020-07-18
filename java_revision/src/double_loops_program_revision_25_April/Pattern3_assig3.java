package double_loops_program_revision_25_April;

public class Pattern3_assig3 
{
	public static void main(String[] args)
	{
		
	int count=0;
	for(int i=0;i<=5;i++)
	{
		for(int j=0;j<=i;j++)
		{
			count=count+1;
			System.out.print(count);
			
		}
		count=0;
		System.out.println();
	}
	
	}
}
