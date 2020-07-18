package FIle_handling_write_revision_02_may;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment1 
{
		public static void Read_from_file1_write_to_file2() throws IOException 
		{
			File f1=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\26-04-2020\\revision_read.txt");
			FileReader fr=new FileReader(f1);
			BufferedReader br=new BufferedReader(fr);
			

			File f2=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\2-05-2020\\write_revision.txt");	//connection estd..
			FileWriter fw=new FileWriter(f2);
			BufferedWriter bw=new BufferedWriter(fw); 
		
			String s;
			while((s=br.readLine())!=null)
			{
			System.out.println(s);
			bw.write(s);
			bw.newLine();
			}		
			bw.close();
			
	
		}
		public static void main(String[] args) throws IOException 
		{
			Assignment1.Read_from_file1_write_to_file2();
		}
		
}
