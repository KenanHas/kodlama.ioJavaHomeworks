package Week1;

public class IsFriendNumbers {

	public static void main(String[] args) {
		int numberOne = 1184;
		int numberTwo = 1210;
		int totalOne = 0;
		int totalTwo = 0;

		for (int i = 1; i < numberOne; i++) {
			if (numberOne % i == 0) {
				totalOne += i;
			}
		}

		for (int j = 1; j < numberTwo; j++) {
			if (numberTwo % j == 0) {
				totalTwo += j;
			}
		}
		if (totalOne == numberTwo&&totalTwo==numberOne) {
			System.out.println(numberOne + " and " + numberTwo + " are friend numbers.");
		}
		else {
			System.out.println(numberOne + " and " + numberTwo + " are not friend numbers.");
		}
	}
}
