 package JavaLogicalProblems;

public class Count_EvenAnd_OddNumbers {
	public static void main(String[] args) {

		int num=1234567;
		int evenNum=0;
		int oddNum=0;
		int reminder;
		while(num>0)
		{
			reminder=num%10;
			num=num/10;

			if(reminder%2==0)
			{
				evenNum++;
			}
			else
			{
				oddNum++;
			}
		}
		System.out.println(evenNum);
		System.out.println(oddNum);
		
	}

}
