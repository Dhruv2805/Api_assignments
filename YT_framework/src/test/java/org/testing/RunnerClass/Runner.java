package org.testing.RunnerClass;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Runner 
{
	public static void main(String[] args) throws BiffException, IOException
	{
		
	
	XmlSuite xml_suite=new XmlSuite();	//suite object
	xml_suite.setName("Suite1");
	
	XmlTest xml_test=new XmlTest(xml_suite);		//test object
	
	File f=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\04-07-2020 keyword driven\\YT_framework_excel_xls_file.xls");
	
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	int rows=ws.getRows();
	
	ArrayList<XmlClass> all_xml_classes_object=new ArrayList<XmlClass>();
	
	
	for(int i=1;i<=rows;i++)
	{
		
		Cell cs=ws.getCell(4, i); 	//till here we have reached  to the status cell ..it will create  object of   5th column cell(i.e  status cell) for each row
		
		if(cs.getContents().equals("Y"))
		{
			Cell Pkg_name=ws.getCell(2,i);
			
			Cell Class_name=ws.getCell(3,i);
			
			String p_c=Pkg_name.getContents() + "." +Class_name.getContents();
			
			XmlClass xml_class=new XmlClass(p_c);		//class object
				
			
			//we have taken all the xml classes object which were marked "Y"  and stored in the arraylist1 .Now  we will pass the arraylist1 (all_xml_classes_object) to the xmltest object
			all_xml_classes_object.add(xml_class);
			xml_test.setClasses(all_xml_classes_object);
			
			//we have taken all the xml test object   and stored in the arraylist2(all_xml_test_object) .Now  we will pass the arraylist2 to the xml suite object
			ArrayList<XmlTest> all_xml_test_object =new ArrayList<XmlTest>();
			all_xml_test_object.add(xml_test);
		xml_suite.setTests(all_xml_test_object);
			
		//we have taken all the xml suite object   and stored in the arraylist1 .Now  we will pass the arraylist3(all_xml_Suite_object) to the Testng
		ArrayList<XmlSuite> all_xml_Suite_object =new ArrayList<XmlSuite>();
		all_xml_Suite_object.add(xml_suite);
		
		TestNG tNG=new TestNG(); 	//testNG object
		tNG.setXmlSuites(all_xml_Suite_object);
		tNG.run();
		
		
		}
		
	}
	
	}

}
