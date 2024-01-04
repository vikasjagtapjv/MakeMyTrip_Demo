package Collection_Basic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_HashMap {
	@Test(dataProvider="data01")
	public void test01(String userData)
	{
		System.out.println("enter Name");
		System.out.println("Enter Password");
		System.out.println("click On login");
	}
	@DataProvider(name="data")
	public String[] getData()
	{
		String a[]= {"abcd","abc@123","VikasJ Tech"};
		return a;
	}
	@DataProvider(name="data01")
	public Object[][]getData01()
	{
		Object [][] o=new Object[][]{{"Viraj"},{"vikas"},{"vinita"}};
		return o;
	}
}