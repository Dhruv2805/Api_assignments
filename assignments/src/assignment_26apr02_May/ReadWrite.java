/*readind the data from different file and writing same data to other file  */
package assignment_26apr02_May;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite
{
	public void read_transfer() throws IOException
	{
		File fread=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\26-05-2020\\read.txt"); //connection built
		FileReader	fr=new FileReader(fread);  //it will read character by character
		BufferedReader br=new BufferedReader(fr);
		
		File fwrite=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\2-05-2020\\write_assig1.txt"); //connection built
		FileWriter	fw=new FileWriter(fwrite);  //it will read character by character
		BufferedWriter bw=new BufferedWriter(fw);
		
		
		
		String s;
		while((s=br.readLine())!= null)
		{
			
			System.out.println(s);
			
			bw.write(s);
			bw.newLine();	
			
		}
		bw.close();	
	}
		
	public static void main(String[] args) throws IOException
	{
		ReadWrite rw=new ReadWrite();
		rw.read_transfer();	
	}
}
