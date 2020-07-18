package Excel_revision;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Write_excel_Data_revision 
{
	public static void main(String[] args) throws IOException, WriteException 
	{
		
	
		File f=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\9-05-2020_pending\\Excel_write_revision.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("write_revision", 0);
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				Label l=new Label(j, i, "drv");
				ws.addCell(l);
			}
		}
		wk.write();		//for saving the excel 
		wk.close();		//for closing the excel
	}
}
