package Excel_revision_9th_may_assignments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

//write the data to an excel for particular range row and particular column..data is taken from user using scanner class
public class Assignment4 
{
	public static void write_particular_range(int a,int b,String data) throws IOException, RowsExceededException, WriteException
	{
		File f=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\9-05-2020_pending\\Excel_write_revision.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("particular_range_write", 0);
		
		for(int i=0;i<=a;i++)
		{
			for(int j=0;j<=b;j++)
			{
				Label l=new Label(j, i, data);
				ws.addCell(l);
			}
		}
		wk.write();
		wk.close();
	}
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("write row range numb. ");
		int s1=sc.nextInt();
		System.out.println("write column range numb. ");
		int s2=sc.nextInt();
		System.out.println("I can do it ");
		String s3=sc.next();
		
		Assignment4.write_particular_range(s1, s2,s3);
	}
}
