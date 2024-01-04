package JavaLogicalSeries;

import java.util.HashMap;
import java.util.Map;

public class Reoccurrence_Of_Characters_Using_HashMap {
	public static void main(String[] args) {
		String s="abcabcabd";
		HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
		for(char c:s.toCharArray())
		{
			System.out.println(c);
			hm.put(c,hm.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry:hm.entrySet())
		{
			System.out.println("Characters:"+entry.getKey()+" "+"Occurrences:"+entry.getValue());
		}
	}

}
