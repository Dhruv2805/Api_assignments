package Selenium30th_31st_may_assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collection_practise_set_interface
{
	public static void main(String[] args) 
	{
		//  HashSet<Integer> hsh=new HashSet<Integer>();  //1st we have created the hashset collection object and in it <generic way> we have mentioned only integer class data will be stored 
													//only one type of class data will be stored at a time in collection eg.integer,Float,String or else
		
		 LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();		//1st we have created the linkedhashset collection object and in it <generic way> we have mentioned only integer class data will be stored
		
	
		
		
		 lhs.add(new Integer(11));						//1st method..here we have created the Integer class object and pass the value 11
		 lhs.add(12);									//2st method..we have created direct object creating method and pass the value 12
		 lhs.add(new Integer(121));
		 lhs.add(new Integer(1331));
		 lhs.add(new Integer(131));
		 lhs.add(new Integer(14441));
		 lhs.add(new Integer(11));
		
		for (Integer i:lhs)							//here we have used for each loop ..here i will pick the values one by one from hsh
		{											//  : means each ..no initialization,no conditionn,o incrementation
			System.out.println("collection object is " +i);
		}
		
	}																	//set interface do not store duplicate data
}																		//..hashset stores randomlly..linkedhashset and treeset  stores in insertion order way it is define in code..
																		//array interface  stores duplicate data
																		//..arraylist and linked list stores data in insertion order way it is define in code
																		

