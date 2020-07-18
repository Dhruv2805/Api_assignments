package Assignment_27_June;

import java.util.Scanner;

public class String_num_char 
{
	public void string_char_num(String s)
	{
		int l=s.length();
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s1=sc.nextLine();
		
		String_num_char a_num_char=new String_num_char();
		a_num_char.string_char_num(s1);
		
	}
}
