package JavaLogicalSeries;

public class CountEven_OddNumber_InGivenNumber {
	public static void main(String[] args) {
		int num=123456789;
		int evenN=0;
		int oddN=0;
		while(num>0)
		{
			int reminder=num%2;//9,8
			if(reminder%2==0)
			{
				evenN++;
			}
			else {
				oddN++;
			} 
			num=num/10;
		}
		System.out.println("count of even Numbers :"+evenN);
		System.out.println("count of odd Numbers :"+oddN);

	}

}
