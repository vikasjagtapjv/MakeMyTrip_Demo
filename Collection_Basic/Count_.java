package Collection_Basic;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Count_ {
	public static void main(String[] args) {
		String s="ABCABCABC";
		int count=0;
		Set<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		StringBuffer sb=new StringBuffer();
		for(Character c:set)
		{
			sb.append(c);
			count++;
		}
		System.out.println(sb);
		System.out.println(count);
	  }
}
