package week3.abstractClasses;

public class Main {

	public static void main(String[] args) {
		GameCalculator gameCalculator = new WomanGameCalculator();

		gameCalculator.gameOver();
		gameCalculator.hesapla();

	}

}
