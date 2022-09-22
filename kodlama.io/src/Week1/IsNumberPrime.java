
package Week1;

public class IsNumberPrime {
	public static void main(String[] args) {

		int number = 13;
		int counter = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				counter++;
			}

		}
		 
		if(number<2)
		{
			System.out.println("Error. The smallest prime number is 2. You cannnot enter the number smaller than 2.");
		}
		else if (counter== 0) {
			System.out.println(number + " is prime number.");
		}
		else {
			System.out.println(number + " is not prime number.");
		}

	}

}
