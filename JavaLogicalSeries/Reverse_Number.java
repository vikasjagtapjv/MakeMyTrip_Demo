package JavaLogicalSeries;

public class Reverse_Number {
	public static void main(String[] args) {
		int num=12345;
		int reverse=0,reminder;
		while(num>0)
		{
			reminder=num%10;//5,4,3,2,1
			reverse=reminder+reverse*10;//5+0*10=5,4+5*10=54,3+54*10=543,2+543*10=5432,1+5432*10=54321
			num=num/10;//1234,123,12,1,0
			
		}
		System.out.println(reverse);
	}

}
