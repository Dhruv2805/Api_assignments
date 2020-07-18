package Excel_revision_9th_may_assignments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

////read the whole data of particular range of rows 
public class Assignment3 
{
	
	public static void Range_data(int a, int b) throws BiffException, IOException 
	{	
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
				if(counter>=a && counter<=b)
				{
				Cell c1=ws.getCell(j, i);
				System.out.println(c1.getContents());
				}
			}
		}
	}	
	public static void main(String[] args) throws BiffException, IOException 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the wishlist row range initial number");
		int s1=sc.nextInt();
		
		Scanner sc2 =new Scanner(System.in);
		System.out.println("enter the wishlist row range final number");
		int s2=sc.nextInt();
		
		Assignment3.Range_data(s1, s2);
	}
}
