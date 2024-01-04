package JavaLogicalSeries;

public class Add_Two_Arrays {
	public static void main(String[] args) {
		int array1[]= {3,4,5,12,67};
		int array2[]= {4,6,7,34,31};
		
		if(array1.length != array2.length)
		{
			System.out.println("Length of array1 and array2 must be same");
			return;
		}
		int a[]=new int[array1.length];
		for(int i=0;i<array1.length;i++) {
			a[i]=array1[i]+array2[i];
			/*
			 * a[0]=array1[3]+array[4],4+3
			 *  a[1]=array1[4]+array[6]
			 *   a[2]=array1[5]+array[7]
			 *    a[3]=array1[12]+array[34]
			 *     a[4]=array1[67]+array[31]
			 */
		}
		for (int Values:a)
		{
			System.out.print(Values+" ");
		}
	}
	/*first initialize the arrays
	array1 initialize with values {1,3,43,53,}
	array2 initialize with values {3,4,6,23,29}
	to check the Length of both arrays are similar or not
	if(array1!=array2)
       {Syso(condition must be same);
return;		}	

	 * both arrays must be same above condition must be false
	 * and program proceed further
	 * int a[]=new new int[array1.length];
	 *  int a[] is initialize with length to store the  elements
	 *  
	 *   now add the corresponding elements
	 *   
	 *   for (int i=0;i<array1.length;i++)
	 *   {
	 *   a[i]=array1[i]+array2[i];
	 *   loop through each index "i" and add corresponding elements 
	 *   of array1 and array2
	 *   The result is stored in a of array
	 *   Iterations:
           a[0] = 1 + 6 = 7
           a[1] = 2 + 7 = 9
           a[2] = 3 + 8 = 11
            a[3] = 4 + 9 = 13
           a[4] = 5 + 10 = 15
        now for to get result let me use for each loop
        for (int values:a)
             {
                syso(values+" ");
             }
      

	 */
	
}
