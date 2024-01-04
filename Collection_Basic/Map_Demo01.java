package Collection_Basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
/*
 * HashMap
 * HashMap provided the advantage of quick insertion, search, and deletion 
HashMap is a part of Java’s collection since Java 1.2. 
It provides the basic implementation of the Map interface of Java.
 It stores the data in (Key, Value) pairs. 
 To access a value one must know its key. 
 This class uses a technique called Hashing. 
 Hashing is a technique of converting a 
 large String to a small String that represents the same String.
  A shorter value helps in indexing and faster searches. 
  Let’s see how to create a map object using this class.
 */
public class Map_Demo01 {
	public static void main(String[] args) {
		Map<String, Integer>m=new HashMap<String, Integer>();
		m.put("Vikas",1 );
		m.put("Viraj", 2);
		m.put("Vinita",1 );
		m.put("Umesh", 3);
		m.put("Ashwini", 4);
		for(Entry<String, Integer>e:m.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
