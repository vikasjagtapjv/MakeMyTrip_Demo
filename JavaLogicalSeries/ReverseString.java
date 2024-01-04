package JavaLogicalSeries;

public class ReverseString {
	public static void main(String[] args) {
		String str="Vikas";
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			System.out.println(c);
			rev=c+rev;//sakiv
		}
		System.out.println(rev);
	}

}
