package JavaLogicalProblems;

public class Print_Character_From_String {
	public static void main(String[] args) {

		String s="software";

		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='o')
			{
				System.out.println(c);

			}
		}

	}

}
