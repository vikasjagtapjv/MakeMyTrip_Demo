package JavaLogicalProblems;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Count_Duplicate_Characters {
	
public static void main(String[] args) {
	String s="hi hellonhow are you atre";
	int count =0;
	char c[]=s.toCharArray();
	System.out.println(c);
	HashSet set=new HashSet();
	
	for(Character ch:c)
	{
		if(set.add(ch))
		{
			System.out.println(ch);
		}
		else
		{
			System.out.println(ch);
			count++;
		}
		
}
	System.out.println(count);

}

}
