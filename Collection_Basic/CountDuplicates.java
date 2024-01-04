package Collection_Basic;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class CountDuplicates {
	@Test(priority=0)
	public void countDuplicates() {
		int count=0;
		String result=" ";
		TreeSet<String>ts=new TreeSet<String>();
		ts.add("HI");
		ts.add("HI");
		ts.add("Hello");
		ts.add("Hello");
		ts.add("India");
		ts.add("Qa");
		ts.add("Qa");
		ts.add("Qa");
		for(String s:ts)
		{
			System.out.println(s);
			if(result.equals(s))
			{
				
				System.out.println(result);
				continue;
			} 
			else {
			count++;

			result=s+" "+result;
			}

			
		}
		
		System.out.println(result );
		System.out.println(count);
	}
	@Test(priority=1)
	public void removeDuplicates1()
	{
		TreeSet<String>ts=new TreeSet<String>();
		ts.add("hi");
		ts.add("how");
		ts.add("hi");
		ts.add("good");
		ts.add("good");
		ts.add("how");
		ts.add("good");
		ts.add("hi");
		System.out.println(ts);
		
	}
	
	
	

}
