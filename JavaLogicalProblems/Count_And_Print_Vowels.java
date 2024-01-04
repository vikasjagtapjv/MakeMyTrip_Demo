package JavaLogicalProblems;

public class Count_And_Print_Vowels {
public static void main(String[] args) {
	String s="Vikas is efficient user";
	int count=0;
		s=s.toLowerCase();
	
	for (int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			count++;
			System.out.print(" "+c+" ");

		}
		
	}
	System.out.println(count);
}
}
