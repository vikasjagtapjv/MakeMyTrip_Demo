package JavaLogicalProblems;

public class String_Basics {
	public static void main(String[] args) {
		String str = "apple";

		String str1 = "apple";

		String str2 = new String("apple");

		System.out.println(str == str1);// 

		System.out.println(str1 == str2);// false

		System.out.println(str.equals(str2));//t
		System.out.println(str1.equals(str2));//t
		System.out.println(str.equals(str1));//t

		/*
		 * in java we have equals method in two classes another is String class 
		 * object class equals checks memory addresses(==) 
		 * String class (equals) checks content
		 * of string &object is super class of String(eg:its checking both hello)
		 * 
		 * String use to change the features means to override
		 * 
		 * == used to check the Address eg : int a=10; int y=20;
		 * System.out.println(a==y)//false here we are checking the addresses object
		 * class(==),10 and 20 are the addresses a and y are the content
		 * 
		 * 
		 * String a="hello";, String b=new String("hello"); String c="hello" String
		 * b1=new String("hello"); String d=new String("hi");
		 * 
		 * A f=new A ("hello"); A f1=new A("hello"); A f2=new A("hi");
		 */

		String a = "hello";
		String b = new String("hello");
		String c = "hello";

		String b1 = new String("hello");
		String d = new String("hi");
		System.out.println(d.intern());// intern is a method which return String from String poll

		System.out.println(a == b);// f
		System.out.println(a == c);// t

		System.out.println(a == b1);// f

		System.out.println(b == b1);// f

		System.out.println(a.equals(b1));// t
		System.out.println(b.equals(b1));// t
		
				

	}

}
