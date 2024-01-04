package JavaLogicalSeries;

public class Reverse_Sentence {
	public static void main(String[] args) {
		String s="India is my county";//country my is India
		String revSen=" ";
		String array[]=s.split(" ");
		for(int i=0;i<array.length;i++)
		{
			revSen=array[i]+" "+revSen;//country my is india
		}
		System.out.println("Reversed sentence is :"+revSen);
	}
	

}
