package FIle_handling_read_revision_26_april;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_handling_read 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\26-04-2020\\revision_read.txt");		//connection estd.
		FileReader fr=new FileReader(f);		//file reader --read char by char
		BufferedReader br=new BufferedReader(fr);
		int counter=0;
		String a;
		while((a=br.readLine())!=null)
		{
			counter=counter+1;					//counter concept is used to to select a particular row and print that..
			if(counter==2)
			{
			System.out.println((String)a);		//explicit conversion
			}
		}
		System.out.println("the value of a in the end is=  "+a);
	}
}
