package JavaLogicalSeries;

public class Prime_Number {
	public static void main(String[] args) {
		int num=7;//123456789
		int count=0;
		for(int i=2;i<num;i++)//2-6
		{
			if(num%i==0)//condition must false
			{
				count++;
				System.out.print(count);
			}
		}
		if(count>0)
		{
			System.out.println("Given Number is not a Prime Number");
		}
		else{
			System.out.println("Given Number is Prime Number");
		}
		
	}

}
