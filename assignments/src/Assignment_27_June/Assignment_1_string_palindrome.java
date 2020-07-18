package Assignment_27_June;
// Whether a String is palindrome or not ?     nitin------------nitin
import java.util.Scanner;
import java.lang.String;

public class Assignment_1_string_palindrome 
{
	public static void String_is_palindrome_or_not(String s1)
	{
		String temp=s1;
		int l=s1.length();
		System.out.println(l);
		
		String Reverse=new StringBuffer(s1).reverse().toString();
		System.out.println(Reverse);
		if (temp.equals(Reverse))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.next();
		
		Assignment_1_string_palindrome sp=new Assignment_1_string_palindrome();
		sp.String_is_palindrome_or_not(st);
	}
}
