package Assignment_27_June;
//Input String----my name is deepak
//Output String---ym eman si kapeed

import java.util.Scanner;
import java.lang.String;

public class Assignment3 
{
	public void Assig3(String s1)
	{
		System.out.println("s1 : "+s1);
		String[] s2=s1.split(" ");
		int l1=s2.length;
		System.out.println(l1);
		
		String reverseString="";
		
	for(int i=0;i<l1;i++)
	{
	//	System.out.println("s2 : "+s2[i].toString());
		String s3=s2[i];
		String reverseword="";
		
		int l2=s3.length();
		for(int j=l2-1;j>=0;j--)
		{
			 reverseword=reverseword+s3.charAt(j);
		//	System.out.print("s3 : "+reverseword);
		}
		System.out.println("reverse word is "+reverseword);
		reverseString=reverseString+reverseword+" ";
		
	}
	
	System.out.print("s3 : "+reverseString);
		
		
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		
		Assignment3 sp=new Assignment3();
		sp.Assig3(st);
	}
}
