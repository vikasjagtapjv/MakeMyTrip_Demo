package JavaLogicalProblems;

import org.testng.annotations.Test;

public class FibonacciSeries {
	@Test(priority=0)
	public void test0()
	{
		int a=0;
		int b=1;
		int num=0;
		System.out.println(a+" "+b);
		for(int i=1;i<10;i++)
		{
		num=a+b;
		System.out.println(""+num);
		a=b;
		b=num;
		}
	}

}
