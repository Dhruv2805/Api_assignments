package Assignment_27_June;

import java.util.Scanner;
import java.lang.String;

public class Assignment5 
{
	public void Assig5(String s1)
	{
	
	//	String[] s2=s1.split(" ");
		int l=s1.length();
		System.out.println(l);
		int counter=0;
		
	for(int i=0;i<l;i++)
	{
	
		if(s1.charAt(i)=='e')
		{
			counter=counter+1;
		}
		
		System.out.println(s1.charAt(i));
	}
	System.out.println(counter);
			
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		
		Assignment5 sp=new Assignment5();
		sp.Assig5(st);
	}
}
