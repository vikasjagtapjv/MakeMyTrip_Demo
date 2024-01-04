package Collection_Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Reverse_TreeSet_Sorted_order {
	public static void main(String[] args) {
		TreeSet<Integer>ts=new TreeSet<Integer>();
		ts.add(1);
		ts.add(10);
		ts.add(3);
		ts.add(12);
		ts.add(5);
		
		ArrayList al=new ArrayList();
		al.addAll(ts);
		System.out.println(al);
	
		Collections.reverse(al);
		System.out.println(al);
		
		
	}

}
