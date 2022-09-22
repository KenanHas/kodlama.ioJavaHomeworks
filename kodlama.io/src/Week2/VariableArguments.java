package Week2;

public class VariableArguments {

	public static void main(String[] args) {

		System.out.println(summation(12, 4, 5, 6, 8, 9, 0, 1));

	}

	public static int summation(int... array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}
}
