package loops_revision_18_april;

import java.util.Scanner;

public class Table_print 
{

	public void table(int a,int b)
	{
		System.out.println("table of " +a+ "is ");
		
		for(int i=1;i<=b;i++)
		{
			int c=a*i;
			
			System.out.println(a+ " * " +i+ "=" +c);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number which table you want to print  ");
		int m=sc.nextInt();
		
		System.out.println("enter the length of the table   ");
		int n=sc.nextInt();
		
		Table_print Tb=new Table_print();
		Tb.table(m,n);
	}
}
