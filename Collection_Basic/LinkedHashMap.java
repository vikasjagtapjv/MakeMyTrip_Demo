package Collection_Basic;

import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMap {
	public static void main(String[] args) {
		Map<String , Integer>m=new java.util.LinkedHashMap<String, Integer>();
		m.put("Raj", 1);
		m.put("Vivek", 2);
		m.put("Rony",3);
		m.put("Rohit",4);
		m.put("Rushi",4);
	for(Entry<String, Integer>e:m.entrySet())
	{
		System.out.println(e.getKey()+" "+e.getValue());
	}
		
	}

}
