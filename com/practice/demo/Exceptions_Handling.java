package com.practice.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

public class Exceptions_Handling {
	@Test(priority=0)
	public void test()
	{
		System.out.println("Normal flow of Program");
		
		try {
			int a=6/0;
			System.out.println(a);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception handled in catch block");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled in catch block");
		}
		catch(ArrayStoreException e)
		{
			System.out.println("ArrayStoreException Exception handled in catch block");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointer Exception handled in catch block");
		}
		catch(Exception e)
		{
			System.out.println("Arithmetic Exception handled in catch block");
		}
		finally {
			System.out.println("any type of exception handled or not but finally block will execute");
		}
		
		System.out.println("After handling the Exception");
	}
	//ArithmeticException 
	//<ArithmeticException <RuntimeException<Exception <Throwable
	/*
	 * error 
	 * Exception:
	 *     1)RuntimeException: This type of Exceptions are occurred at runtime
	 *     we can handle these exceptions
	 *     
	 
	 *                1)AritmeticException
	 *                2)ArrayIndexOutOfBoundsException
	 *                3)ArrayStoreException
	 *                4)NullPointerException
	 *     2)CompileTimeException:this type of Exceptions occurred at compile time
	 *                1)ClassNotFoundException
	 *                2)FileNotFoundException
	 *                3)IOException
	 *                etc
	 *                           
	 * 
	 */
	
	@Test(priority=2)
	public void test2() throws IOException,ArithmeticException,FileNotFoundException,Exception
	{
		throw new IOException("this is new Sxception");
	}

}
