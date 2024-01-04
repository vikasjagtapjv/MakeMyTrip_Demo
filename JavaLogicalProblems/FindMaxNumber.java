package JavaLogicalProblems;

public class FindMaxNumber {
	public static void main(String[] args) {
		int a[]= {23,45,3,6,7,2,333};//(0,1,2,3,4,5,6)
		int max=a[0];//created local variable max to store maximum number from a[]
		for(int i=0;i<a.length;i++)//23,45
		{
			System.out.println(a[2]);
		if(a[i]>max)//(23>0),45>23,333>45//now comparing a[i]with max number if a[i]>max then max=a[i]
		{
			
			max=a[i];//max=23,45,333
			
		}//once iteration is completed we will get maximum number
		}
		System.out.println(max);
	}

}
