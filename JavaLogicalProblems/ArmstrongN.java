package JavaLogicalProblems;

import org.testng.annotations.Test;

public class ArmstrongN {
	
	@Test(priority=0)
	public void test0()
	{
		int num=153;
		int orgNum=num;
		int reminder;
		int reverse=0;
		while(num>0)
		{
			reminder=num%10;
			reverse=(reminder*reminder*reminder)+reverse;
			num=num/10;
			
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+ " armstrong");
		}
		else
		{
			System.out.println(orgNum+ " not armstrong");
		}
		
	}
	@Test(priority=1)
	public void test01(){
		int num=153;
		int orgNum=num;
		int reverse=0,reminder;
		while(num>0)
		{
			reminder=num%10;
			reverse=(reminder*reminder*reminder)+reverse;
			num=num/10;
		}
		if(orgNum==reverse)
		{
			System.out.println(orgNum+" its armstrong number");
		}
		else
		{
			System.out.println(orgNum+ " Its not armstrong Number");
		}
		
	}

}
