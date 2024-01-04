package JavaLogicalProblems;

public class ReverseString {
public static void main(String[] args) {
	String s="Hi all";
	String re="";
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		re=c+re;
	}
	System.out.println(re);
}
}
