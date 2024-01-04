package JavaLogicalProblems;

import java.util.HashMap;
import java.util.Map;

public interface Reoccurrence_Of_Characters__InHashMap {
public static void main(String[] args) {
	//How to find the reoccurrence of Characters using HashMap in Java
			String str="abcabcabc";
			HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
			//for iterating each Character of String for that we used toCharArray() method
			
			//For updating the count in a hash map, we can create one for each loop
			for(char s:str.toCharArray())
			{
				System.out.println(s);
				hm.put(s, hm.getOrDefault(s, 0)+1);
			}
			//We are currently iterating through a HashMap Entry and 
			// printing out the characters with their respective multiple occurrences.
			for(Map.Entry<Character, Integer> entry:hm.entrySet())
			{
				System.out.println("char :"+entry.getKey()+" "+"Occured :"+entry.getValue());
			}
			
			 
}
}
