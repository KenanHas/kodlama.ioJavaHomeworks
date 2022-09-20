package Week1;

public class ArraysDemo {

	public static void main(String[] args) {

		double[] myList = { 1.5, 8.3, 4.1, 5.2 };
		double total = 0;
		double largestNumber = myList[0];
		for (double numbers : myList) {
			if (largestNumber < numbers) {
				largestNumber = numbers;
			}
			System.out.println(numbers);
			total += numbers;
		}
		System.out.println("Total: " + total);
		System.out.println("The largest number is: " + largestNumber);
	}

}
