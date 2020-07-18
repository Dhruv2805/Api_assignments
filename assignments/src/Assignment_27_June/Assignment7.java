package Assignment_27_June;

import java.util.Scanner;
import java.lang.String;

//Input String ----my name is deepak (1st and 3rd, 2nd and 4th)
//Output String---is deepak my name
public class Assignment7 
{
	public static void assig7(String s2)
	{
		String[] s3=s2.split(" ");
		int l1=s3.length;
		
		for(int i=0;i<l1;i++)
		{
			String s4=s3[i];
			String[] s5=s4.split(" ");
			int l2=s5.length;
			String reverseword="";
			for(int j=l2-1;j>=0;j=j--)
			{
				reverseword =reverseword+s5[j];
				
			}
			System.out.println(reverseword);
		}
	}gjhg
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s1=sc.nextLine();
		
		Assignment7 a7=new Assignment7();
		a7.assig7(s1);
		
	}
}
