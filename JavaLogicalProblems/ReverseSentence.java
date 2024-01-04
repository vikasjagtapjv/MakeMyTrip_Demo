package JavaLogicalProblems;

import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence ");
		String s=sc.nextLine();
		String revSen="";
		String[] s2=s.split(" ");//{'I', 'am', 'good'}
		for(int i=0;i<s2.length;i++)
		{
			revSen=s2[i]+" "+revSen;
		}
		System.out.println("Reversed Sentence is: "+revSen);
	}
	

}
