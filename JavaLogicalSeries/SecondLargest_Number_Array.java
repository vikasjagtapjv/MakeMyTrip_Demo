package JavaLogicalSeries;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargest_Number_Array {
	public static void main(String[] args) {
		Integer a[]= {34,355,56,12,10,45,442};//442,355,45,34,12,10
		secondLargestNumber(a);
		
		
	}
	public static void secondLargestNumber(Integer a[])
	{
		Arrays.sort(a,Collections.reverseOrder());
		for(int i=0;i<=a.length;i++)
		{
			if(a[i]!=a[0])//
			{
				System.out.println(a[i]);
				return;
			}
		}
	}

}
