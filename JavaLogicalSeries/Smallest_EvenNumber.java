package JavaLogicalSeries;

public class Smallest_EvenNumber {
	public static void main(String []args) {
		int a[] = { 37,34,645,45,28,64,88,25,53,32};
		int smallestEven = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < smallestEven && a[i] % 2 == 0) {
				smallestEven = a[i];
			}

		}
		System.out.println(smallestEven);
	}

}
