package Week1;

public class IsPerfectNumber {

	public static void main(String[] args) {
		int number = 8128;
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		if (total == number) {
			System.out.println(number + " is perfect number.");
		} 
		else {
			System.out.println(number + " is not perfect number.");
		}

	}

}
