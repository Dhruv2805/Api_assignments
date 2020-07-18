package Excel_revision_9th_may_assignments;
//read the data from excel file 1 and write the data of file1 to file2 (copy +paste)...
//i have done some extra effort to pase only a range data 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Assignment5
{
	public static void copy_paste(int a,int b) throws BiffException, IOException, RowsExceededException, WriteException
	{
	File f1=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\9-05-2020_pending\\Excel_read_revision.xls");
	Workbook wk1=Workbook.getWorkbook(f1);
	Sheet ws1=wk1.getSheet(0);
	int r=ws1.getRows();
	int c=ws1.getColumns();
	
	File f2=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\9-05-2020_pending\\Excel_write_revision.xls");
	WritableWorkbook wk2=Workbook.createWorkbook(f2);
	WritableSheet ws2=wk2.createSheet("paste", 0);
	
	
	int counter=0;
		for(int i=0;i<r;i++)
		{
			counter=counter+1;
			for(int j=0;j<c;j++)
			{
				Cell c1=ws1.getCell(j, i);
				String cell_read=c1.getContents();
				System.out.println(cell_read);
				
				if(counter>=a && counter<=b)
				{
					Label l=new Label(j, i, cell_read);
					ws2.addCell(l);
				}
				
			}
		}
		wk2.write();
		wk2.close();
	}
	
	public static void main(String[] args) throws RowsExceededException, BiffException, WriteException, IOException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("write row range numb. ");
		int s1=sc.nextInt();
		System.out.println("write column range numb. ");
		int s2=sc.nextInt();	
		
		Assignment5.copy_paste(s1,s2);
	}
}
