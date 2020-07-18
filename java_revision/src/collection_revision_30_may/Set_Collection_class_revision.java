package collection_revision_30_may;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Collection_class_revision 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<Integer>();			//here we have called collection class named "set" for storing the data..and in Set it will store only Integer class objects only
	//	LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
	//	TreeSet<Integer> hs=new TreeSet<Integer>();	
		hs.add(new Integer(11));						//1way...we can create object with new keyword
		hs.add(new Integer(12));
		hs.add(new Integer(121));
		hs.add(new Integer(13));
		hs.add(new Integer(14));
		hs.add(new Integer(11));
		hs.add(16);										//way...we can create object dirctly
		
		for(Integer i:hs)				//1st..for collection we have used "for each loop"..here ":" means is each..(consider bucket full of ballon) in it we have stored all the collection data using hs object..
		{								//2nd..working of loop:..here each data value which store in collection is picked up by  integer i one by one only.
			System.out.println(i);		//the data value which is taken out and store to integer i that is we are printing 
		}
	}
}
