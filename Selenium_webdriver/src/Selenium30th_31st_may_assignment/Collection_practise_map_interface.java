package Selenium30th_31st_may_assignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Collection_practise_map_interface 
{
	

	public static void main(String[] args) 
	{
	//	HashMap<Integer, String> hsm=new HashMap<Integer, String>();	//1st we have created the hashmap collection object and in it <generic way> we have mentioned  integer class  data will be stored and that data will be of string data type
		
	//	LinkedHashMap<Integer, String> hmap=new LinkedHashMap<Integer, String>();			//  stores in insertion order way it is define in code..
		
		TreeMap<Integer, String> tmap=new TreeMap<Integer, String>();						//  stores in ascending order way it is define in code..
		
		tmap.put(new Integer(12), "hello");										//1st method..here we have created the Integer class object and pass the value 12 using put method(in map we use put method instead of add method like others
		tmap.put(11, "drv");													//2st method..we have created direct object creating method and pass the value 11 using put method(in map we use put method instead of add method like others
		tmap.put(new Integer(1111), "sam");
		tmap.put(new Integer(121), "naemo");
		tmap.put(new Integer(1331), "abc");
	//	hmap.put(new Integer(12), "xyz");
		
		Set<Integer> all_keys=tmap.keySet();						//2nd...here we will segregates all the keys..so it will give all the keys
		
		for(Integer i:all_keys)
		{
			System.out.println("key is" +i);						
			System.out.println("map collection data is "+tmap.get(i));				//here we are giving the keys to the hmap and in returns it is giving corresponding values of that keys 
		}	
	}
}
