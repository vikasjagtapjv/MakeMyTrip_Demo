package JavaLogicalSeries;

public class Pyramid {
	public static void main(String[] args) {
		for(int i=0;i<=5;i++)//0-5
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");//12
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" *");//* *
			}
			System.out.println();
		}
		for (int i=0;i<=5;i++)//0-5
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
