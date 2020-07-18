package Assignment_27_June;
//Input String---my name is deepak
//Output String--deepak is name my

import java.util.Scanner;
import java.lang.String;

public class Assignment2 
{
	public void Assig2(String s1)
	{
		
		String[] s2=s1.split(" ");
		int l=s2.length;
		System.out.println(l);
		
	for(int i=l-1;i>=0;i--)
	{
		System.out.print(s2[i]+" ");
	}
		
		
		
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		
		Assignment2 sp=new Assignment2();
		sp.Assig2(st);
	}
}
