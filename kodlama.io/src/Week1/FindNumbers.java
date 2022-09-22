package Week1;

public class FindNumbers {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 5, 7, 9, 0 };
		int finded = 6;
		boolean isFinded = true;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == finded) {
				isFinded = true;
				break;
			} else {
				isFinded = false;
			}
		}
		if (isFinded) {
			System.out.println(finded + " number is inside the array.");
		} 
		else {
			System.out.println(finded + " number is not inside the array.");

		}

	}

}
