package JavaLogicalProblems;

import java.util.LinkedHashSet;
import java.util.Set;

public class Replace_Character {
	public static void main(String[] args) {
		String s="Vikas";
		char c='d';
		int place=3;
		int length=s.length();
		System.out.println(length);
		String str=s.substring(0,place)+c+s.substring(place+1);
		System.out.println(str);
		
		
	}
	
	

}
