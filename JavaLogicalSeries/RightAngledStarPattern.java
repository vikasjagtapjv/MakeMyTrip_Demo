package JavaLogicalSeries;

public class RightAngledStarPattern {
	public static void main(String[] args) {
		for (int i=0;i<=3;i++)
		{
			for(int j=i;j<=3;j++)
			{
				/*
				 *  * * * *
				 *  * * *
				 *  * *
				 *  *
				 */
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
