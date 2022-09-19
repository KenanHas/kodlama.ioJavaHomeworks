package Week1;

public class SwitchConditional {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Perfect grade...");
			break;
		case 'B':
			System.out.println("Very good grade...");
			break;
		case 'C':
			System.out.println("Good grade...");
			break;
		case 'D':
			System.out.println("Bad grade...");
			break;
		case 'F':
			System.out.println("Too bad grade...");
			break;
		default:
			System.out.println("Error!!! You can try the grade.");
			break;
		}

	}

}
