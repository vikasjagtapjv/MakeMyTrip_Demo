package JavaLogicalProblems;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestNumberInArray {
	public static void secondHighestNumber(Integer a[])
	{
		Arrays.sort(a,Collections.reverseOrder());
		for(int i=0;i<=a.length;i++)
		{
			if(a[i]!=a[0]&&a[i]%2==0)
			{
				System.out.println(a[i]);
				return;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Integer a[]= {23,54,65,52,22,12};
		secondHighestNumber(a);
	}

}
