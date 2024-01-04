package JavaLogicalProblems;

public class ReverseNumber {
	public static void main(String[] args) {
		int num=121;
		int orgNum=num;
		int reverse=0;
		while(num>0)
		{
			reverse=reverse*10+num%10;//5,50+4=54,540+4=544,
			num=num/10;//12344,1234,123
			
		}
		if(orgNum==reverse)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
		System.out.println(reverse);
	}

}
