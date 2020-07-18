package Selenium30th_31st_may_assignment;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection_practise_list_interface 
{
	public static void main(String[] args) 
	{

	//	ArrayList<Integer> arl=new ArrayList<Integer>();				//1st we have created the Arraylist collection object and in it <generic way> we have mentioned only integer class data will be stored
		
		LinkedList<Integer> linkl=new LinkedList<Integer>();				//1st we have created the Linkedlist collection object and in it <generic way> we have mentioned only integer class data will be stored
		

		
		linkl.add(new Integer(11));						//1st method..here we have created the Integer class object and pass the value 11
		linkl.add(12);									//2st method..we have created direct object creating method and pass the value 12
		linkl.add(new Integer(121));
		linkl.add(new Integer(1331));
		linkl.add(new Integer(131));
		linkl.add(new Integer(14441));
		linkl.add(new Integer(11));
		
		for (Integer i:linkl)							//here we have used for each loop ..here i will pick the values one by one from hsh
		{											//  : means each ..no initialization,no conditionn,o incrementation
			System.out.println("collection object is " +i);
		}
		
	}					
}
