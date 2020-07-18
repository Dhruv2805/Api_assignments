package Excel_revision_9th_may_assignments;
//read the whole data of particular row 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class assignment2
{
	public static void main(String[] args) throws BiffException, IOException 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the wihslist row number");
		int s=sc.nextInt();
		
		File f=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\9-05-2020_pending\\Excel_read_revision.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		
		int counter=0;
		for(int i=0;i<r;i++)
		{
			counter=counter+1;
			for(int j=0;j<c;j++)
			{
				if(counter==s)
				{
				Cell c1=ws.getCell(j, i);
				System.out.println(c1.getContents());
				}
			}
		}
	}	
}
