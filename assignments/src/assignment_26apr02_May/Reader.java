/* Reading a specific line */

package assignment_26apr02_May;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Reader
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\26-05-2020\\read.txt"); //connection built
		FileReader	fr=new FileReader(f);  //it will read character by character
		
		BufferedReader b=new BufferedReader(fr); //it will read line by line before clubbing characters 
		String s;
		
		int a=0;
		while((s=b.readLine())!= null)
		{
			a=a+1;
			if(a==3)
			{
			System.out.println(s);
			break;
			}
		}
			
		
	}
}
