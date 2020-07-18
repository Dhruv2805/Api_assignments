package Assignment_27_June;
import java.lang.String;

public class String_length_practise 
{
	public static void main(String[] args) 
	{
		String s="this is what i am enjoying";
		
		/*********now char by char traverse************/
/*		int l=s.length();
 		System.out.println("length is"+l);
		
		System.out.println(l);
		for(int i=0;i<l;i++)
		{
		System.out.println(s.charAt(i));
		}	*/
		
		/*********now word by word traverse************/
			String[] all_string=s.split(" ");
		int l1=all_string.length;
		System.out.println("length is "+l1);
		
		
		for(int i=0;i<l1;i++)
		{
			System.out.print(all_string[i]+ " ");
		}		
	}
}
