 package Basic;

import java.io.IOException;

import org.testng.annotations.Test;

public class Exceptions_Java {
	@Test(priority=0)
	public void tryCatch(){
		
		System.out.println(11);
		
		try {
			throw new Exception("This is new exception");
			//int a=2/0;
			//String s="";
			//System.out.println(a);
			//System.out.println(s);
		}
		catch( ArithmeticException e)
		{
			System.out.println("catch block1");
		}
		catch( NullPointerException e)
		{
			System.out.println("catch block2");
		}
		catch( ArrayIndexOutOfBoundsException e)
		{
			System.out.println("catch block3");
		}
		catch( ClassCastException e)
		{
			System.out.println("catch block 4");
		}
		catch( ArrayStoreException e)
		{
			System.out.println("catch block5");
		}
		catch( IllegalThreadStateException e)
		{
			System.out.println("catch block6");
		}
		catch( Exception e)
		{
			e.printStackTrace();
			System.out.println("catch block7");
		}
		
		finally {
			System.out.println("block executed");
		}
		
		 
	}
	@Test(priority=1) 
	public void exceptions()
	{
		throw new RuntimeException("new exceptions");
	}
	@Test(priority=2)
	public void exceptions01() throws IOException, ArithmeticException ,Exception
	{
		throw new IOException("This IO Exception");
		
	}
	//NullPointerException

}
