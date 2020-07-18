package collection_revision_30_may;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class Map_collection_set 
{
	public static void main(String[] args) 
	{
	//	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	//	LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
		hm.put(new Integer(11),"drf");
		hm.put(new Integer(12),"dtf");
		hm.put(new Integer(131),"drfm");
		hm.put(new Integer(14),"drfl");
		hm.put(new Integer(15),"drb");
		hm.put(11, "abc");
		hm.put(16, "dtf");		//till now keyvalue is stored in map collection but now we have to segregates all keys 
		
		Set<Integer> all_keys=hm.keySet();	//we have segregated all the keys 
		
		for(int i:all_keys)
		{
			System.out.println("key name is: "+i);
			System.out.println("key value is: "+hm.get(i));	//hm will give the key values corresponding to that key 
		}
	}
}
