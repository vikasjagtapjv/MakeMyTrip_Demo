package JavaLogicalSeries;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateCharactersFrom_String {
	public static void main(String[] args) {
		String s="India is my country";
		s=s.toLowerCase();
		int count=0;
		int l=s.length();
		Set<Character>set=new TreeSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character c:set)
		{
			count++;
			System.out.print(" "+c);
		}
		System.out.println(" Duplicate Characters :"+(l-count)+" ");
	}
	

}
