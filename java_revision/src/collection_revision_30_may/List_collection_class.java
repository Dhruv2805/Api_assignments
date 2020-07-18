package collection_revision_30_may;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_collection_class
{
	public static void main(String[] args) 
	{
//	ArrayList<Integer> al=new ArrayList<Integer>();
	LinkedList<Integer> al =new LinkedList<Integer>();
	al.add(new Integer(11));
	al.add(new Integer(12));
	al.add(new Integer(131));
	al.add(new Integer(14));
	al.add(new Integer(15));
	al.add(new Integer(11));
	al.add(16);
	
	for(Integer i:al)
	{
		System.out.println(i);
	}
	
	}
}
