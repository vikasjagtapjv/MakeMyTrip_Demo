package JavaLogicalProblems;

public class CountNumberOfCharacters {
public static void main(String[] args) {
	String s="india is my country";
	int count=0;

	for (int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
		{
			count++;
			
		}
	}
	System.out.println(count+" ");
}
}
