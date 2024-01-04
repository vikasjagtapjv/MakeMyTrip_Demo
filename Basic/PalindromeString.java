package Basic;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Ele");
		String s=sc.nextLine();
		String rev="";
		for(int i=0;i<s.length();i++)
		{
		char c=s.charAt(i);
		
		rev=c+rev;
		
		
	}
		if(s.equals(rev))
		{
			System.out.println("reverse string");
		}
		else
		{
			System.out.println("not palindrome String ");
		}
		
		}
		//System.out.println(rev);

}
