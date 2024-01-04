package JavaLogicalSeries;

public class FindMaxNumber {
	public static void main(String[] args) {
		int a[]= {23,44,56,444,342,2,67};//0,1,2,3,4,5,6
		int max=a[0];
		for (int i=0;i<a.length;i++)//23
		{
			//System.out.println(a[0]);
			if(a[i]>max)//44>23,56>44,444>56,342>444,2>444,67>444
			{
				max=a[i];//44,56,444,..,
			}
		}
		System.out.println(max);
	}

}
