package Assignment_27_June;

//Input String----my name is deepak
//Output String---kapeed si eman ym

import java.util.Scanner;
import java.lang.String;
public class Assignment4 
{
	public void Assig4(String s1)
	{
	
	//	String[] s2=s1.split(" ");
		int l=s1.length();
		System.out.println(l);
		
	for(int i=l-1;i>=0;i--)
	{
		
		System.out.print(s1.charAt(i));
	}
			
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		
		Assignment4 sp=new Assignment4();
		sp.Assig4(st);
	}
}
