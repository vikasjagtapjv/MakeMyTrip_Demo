package Collection_Basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface {
	public static void main(String[] args) {
		//creating empty map
		Map<Integer, String>m=new HashMap<Integer,String>();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		m.put(4, "d");
		m.put(5, "e");
		m.put(6, "f");
		m.put(7, "g");
		m.put(8, "h");
		m.put(1, "i");
		
		for(Entry<Integer, String> e:m.entrySet())
		{
			System.out.print(e.getKey()+ ":");
			System.out.println(e.getValue());
		}
	}
}