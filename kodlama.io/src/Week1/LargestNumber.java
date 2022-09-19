package Week1;

public class LargestNumber {

	public static void main(String[] args) {

		int numberOne = 53;
		int numberTwo = 111;
		int numberThree = 82;

		System.out.println(
				"Number One: " + numberOne + " " + "Number Two: " + numberTwo + " " + "Number Three: " + numberThree);
		if (numberOne > numberTwo && numberOne > numberThree) {
			System.out.print("Largest number is " + numberOne);
		} else if (numberTwo > numberOne && numberTwo > numberThree) {
			System.out.print("Largest number is " + numberTwo);
		} else {
			System.out.print("Largest number is " + numberThree);
		}
	}

}
