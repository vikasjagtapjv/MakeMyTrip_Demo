package JavaLogicalProblems;

import org.testng.annotations.Test;

public class Palindrome {
	@Test(priority=0)
	public void test0()
	{
		int num=121;
		int orgNum=num;
		int reverse=0;
		while(num>0)
		{
			reverse=reverse*10+num%10;
			num=num/10;
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+"number is palindrome");
		}
		else
		{
			System.out.println(orgNum+" not palindrome");
		}
	}

}
