/*Reading lines from a given range   */

package assignment_26apr02_May;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Readrange
{
	
	
	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\26-05-2020\\read.txt"); //connection built
		
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the initial line ");
		int i=sc.nextInt();
		
		System.out.println("enter the last line ");
		int j=sc.nextInt();
		
		
		FileReader	fr=new FileReader(f);  //it will read character by character2
		BufferedReader b=new BufferedReader(fr); //it will read line by line before clubbing characters 
		String s;
		int a=0;
		while((s=b.readLine())!= null)
		{
			a=a+1;
			if(a>=i && a<=j)
			{
			System.out.println(s);
			
			}
		}
	}
}
