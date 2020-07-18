package FIle_handling_read_revision_26_april;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File_handling_read_assig2 
{
	public void read_particular_Rangeline(int a,int b) throws IOException
	{
		File f=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\26-04-2020\\revision_read.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int counter=0;
		String s;
		
		//1st approach for range
		while((s=br.readLine())!=null)
		{
			counter=counter+1;
			
				if(counter>=a && counter<=b)
				{
				System.out.println(s);
				}
				
			
		}
		//2nd approach for range
		/* while((s=br.readLine())!=null)
		{
			counter=counter+1;
			for(int i=a;i<=b;i++)
			{
				if(counter==i)
				{
				System.out.println(s);
				}
			}
		} */
		
	}
	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the wishlist Rangeline starting number you wanna see ");
		int c=sc.nextInt();
		
		System.out.println("enter the wishlist Rangeline ending number you wanna see ");
		int d=sc.nextInt();
		
		File_handling_read_assig2 as1=new File_handling_read_assig2();
		as1.read_particular_Rangeline(c,d);
	}
}
