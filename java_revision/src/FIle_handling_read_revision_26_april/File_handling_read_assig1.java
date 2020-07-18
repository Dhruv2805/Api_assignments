package FIle_handling_read_revision_26_april;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File_handling_read_assig1 
{
	public void read_particular_line(int a) throws IOException
	{
		File f=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\26-04-2020\\revision_read.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int counter=0;
		String s;
		while((s=br.readLine())!=null)
		{
			counter=counter+1;
			if(counter==a)
			{
				System.out.println(s);
			}
		}
		
		
	}
	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the wishlist line number you wanna see ");
		int b=sc.nextInt();
		
		File_handling_read_assig1 as1=new File_handling_read_assig1();
		as1.read_particular_line(b);
	}
}
