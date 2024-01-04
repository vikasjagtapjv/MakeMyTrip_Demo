package JavaLogicalProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

import Collection_Basic.LinkedHashMap;

public class RemoveDuplicateFromString {
	@Test(priority=0)
	public void duplicateCounts()
	{
		String s="iiiihhhh";
		int count=0;
		char []ch=s.toCharArray();
		TreeSet t=new TreeSet();
		for(char c:ch) 
		{
		if(t.add(c))
		{
		}
		else
		{
			System.out.println(c);
			count++;
		}
		}
		System.out.println(count);
		
	}
	@Test(priority=1)
	public void removeDuplicate()
	{
		String s="india is my country";
		Set<Character>set=new HashSet<Character>();
		for (int i=0;i<s.length();i++)
		{
		
			set.add(s.charAt(i));
		}
		StringBuffer sb=new StringBuffer();
		for (Character c:set)
		{
			sb.append(c);
		}
				
		System.out.println(sb);
		
		
	}
	//simplest way to remove duplicates
	@Test(priority=2)
	public void test2()
	{
		String s="India is my country";
		LinkedHashSet<Character>lhs=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			lhs.add(s.charAt(i));
		}
		for(Character c:lhs)
		{
			System.out.println(c);
		}

	}
	//@Test(priority=3)
	public void test3() {
		String s="India is my country";
		LinkedHashSet<Character>lhs=new LinkedHashSet <Character>();
		for(int i=0;i<s.length();i++)
		{
		lhs.add(s.charAt(i));
		}
		for(Character ch:lhs)
		{
		System.out.println(ch);
		}
		
	}
	//@Test(priority=4)
	public void test4() {
		String s="IndIan";
		LinkedHashSet<Character>set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character c:set)
		{
			System.out.println(c);
		}
	
	}
	@Test (priority=5)
	public void test5()
	{
		String s="I Love Myself in my Love";
		Set<Character>c=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
		c.add(s.charAt(i));
		}
		for(Character ctr:c) {
			System.out.println(ctr);
		}
			
			
	}
	
	
	
	

}
