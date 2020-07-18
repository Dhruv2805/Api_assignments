package Assignment_27_June;

import java.io.BufferedReader;
import java.lang.String;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment6 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\27-06-2020\\Read_file.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String line;
		
		int countWord = 0; 
        int lineCount = 0; 
        int characterCount = 0; 
       
        
        while((line=br.readLine())!=null)
        {
        	/************code for lines count*************/
        	lineCount=lineCount+1;
        	
        	
        	/************code for words count*************/
        	String[] word=line.split(" ");
        	int l1=word.length;
        	countWord=countWord+l1;
        	
        	/************code for characters count*************/
        		characterCount=characterCount+line.length();
  
        	
        	
        }
		System.out.println(lineCount);
		System.out.println(countWord);
		System.out.println(characterCount);
		
	}
	
}
