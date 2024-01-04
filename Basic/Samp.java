package Basic;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Samp {
	public static void main(String[] args) {
		String s="abcabcabc";
		int count=0;
		Map<String, Integer>m=new HashMap<String, Integer>();
		for(int i=0;i<s.length();i++)
		{ String value=String.valueOf(s.charAt(i));
			if(m.containsKey(value))
			{
				int r=m.get(value);
				r=r+1;
				m.put(value, r);
			}
			else
			{
				m.put(value, 1);
			}
		}
		System.out.println(m);
	}

}
