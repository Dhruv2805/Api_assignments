/*Reading characters by characters  */


package assignment_26apr02_May;


	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	import java.io.FileNotFoundException;


	public class ReadChar 
	{
		public static void main(String[] args) throws IOException 
		{
			File f=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\26-05-2020\\read.txt"); //connection built
			FileReader	fr=new FileReader(f);  //it will read character by character
			
			 
			
			int a;
			
			while((a=fr.read())!= -1)
			{
				System.out.println(a);
			}
			
		}
	}


