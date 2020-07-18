package FIle_handling_write_revision_02_may;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_handling_write_revision 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\2-05-2020\\write_revision.txt");	//connection estd..
		FileWriter fw=new FileWriter(f); 	//FileWriter is meant for writing streams of characters
//		FileWriter fw=new FileWriter(f, true);	//with the true argument ..If the second argument is true, then bytes will be written to the end of the file rather than the beginning.(that means it will not override on saved data..it will start writting from the end of line.
		BufferedWriter bw=new BufferedWriter(fw);			//just we called bcoz we want to use its newline method()..for moving one line to other line feature ..
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please write the line ");
		String s=sc.nextLine();
		bw.write(s);
		bw.newLine();
		bw.write(s);
		bw.close();
		/**********now use bufferedwriter object to write and close the data and calling newline method()***************/
/*		bw.write("I am doing file handling write revision. ");		//written my data to the desired text file
		bw.newLine();												//the newline feature
		bw.write("I will learn and explore the concept. ");
		bw.newLine();
		bw.write("I will succeed in my aim. ");		
		bw.close(); 	//save+close		*/
		
	}
}
