package JavaLogicalSeries;

public class Print_Longest_Word {
	public static void main(String[] args) {
		String s="India is my country";
		s=s+" ";
		String word=" ";
		String lgw=" ";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			System.out.println(c);
			if(c!= ' ')
			{
				word =word+c;
			}
			else {
				if(word.length()>lgw.length())
				{
					lgw=word;
				}
				word=" ";	
			}
		}
		System.out.println(lgw);
	}

}
