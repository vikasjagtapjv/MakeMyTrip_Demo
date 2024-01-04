package JavaLogicalProblems;

public class PrimeNumber {
public static void main(String[] args) {
	int num=7;
	int count=0;
	for (int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			count=count+1;
		}
	}
	if(count>0)
	{
		System.out.println("not a prime number");
	}
	else
	{
		System.out.println("Its prime number");
	}
}
}
