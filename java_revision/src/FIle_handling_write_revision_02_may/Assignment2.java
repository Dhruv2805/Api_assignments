package FIle_handling_write_revision_02_may;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment2 
{
	public static void Read_from_file1_write_to_file2_particular_data(int a) throws IOException
	{
		File f1=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\26-04-2020\\revision_read.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		
		File f2=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\2-05-2020\\write_revision.txt");	//connection estd..
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		
		String data;
		int counter=0;
		while((data=br.readLine())!=null)
		{
			counter=counter+1;
			System.out.println(data);
			if(counter<=a)
			{
				bw.write(data);
				bw.newLine();
			}
		}
		bw.close();
		
	}
	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your wishlist line number ");
		int s=sc.nextInt();
		
		Assignment2.Read_from_file1_write_to_file2_particular_data(s);
	}
}
