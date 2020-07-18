/*program to get a row count and till there the row count is it will write the data in new file  */

package assignment_26apr02_May;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Linecnt 
{
	public void read_transfer(int a) throws IOException
	{
		File fread=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\26-05-2020\\read.txt"); //connection built
		FileReader	fr=new FileReader(fread);  //it will read character by character
		BufferedReader br=new BufferedReader(fr);
		
		File fwrite=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\2-05-2020\\write_assig1.txt"); //connection built
		FileWriter	fw=new FileWriter(fwrite);  //it will read character by character
		BufferedWriter bw=new BufferedWriter(fw);
		
		int counter=0;
		String s;
		while((s=br.readLine())!= null)
		{
			
			System.out.println(s);
			counter=counter+1;
			if (counter<=a)
			{
			bw.write(s);
			bw.newLine();
			}
		}
		bw.close();	
	}
		
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the line count till there you want to write data");
		int x=sc.nextInt();
		
		Linecnt lc=new Linecnt();
		lc.read_transfer(x);	
	}

}
