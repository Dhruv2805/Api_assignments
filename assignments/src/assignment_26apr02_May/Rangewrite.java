
/* program to read and write in between range same data */
package assignment_26apr02_May;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Rangewrite 
{
	public void read_transfer(int a,int b) throws IOException
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
			if (counter>=a && counter<=b)
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
		System.out.println("Enter the initial line count ");
		int x=sc.nextInt();
		
		System.out.println("Enter the end line count ");
		int y=sc.nextInt();
		
		Rangewrite rngwr=new Rangewrite();
		rngwr.read_transfer(x,y);	
	}
}
