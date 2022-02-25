package Rekenmachine;

public class Calculator {

	/*
	 * Methode main hieronder kan je verwijderen nadat het importeren gelukt is.
	 */
	public static void main(String[] args) {
		System.out.println(add(9, 2));
	}

	/*
	 * Werk de onderstaande methodes uit.
	 * 
	 * Gebruik enkel de optelling als expressie.
	 * 
	 * Maak gebruik van de nodige control flow structures om de bewerking te
	 * vervolledigen
	 * 
	 * Maak gebruik van gehele getallen.
	 */

	public static int add(int number1, int number2) {
		int result = number1 + number2;
		return result;

	}

	public static int subtract(int number1, int number2) {
		int result = number1 - number2;
		return result;
	}

	public static int multiply(int number1, int number2) {
		int result = 0;
		for (int i = 0; i < number1; i++) {
			result += number2;
			// result += add (result, number2);
		}
		return result;
	}

	
	public static int devide(int number1, int number2) {
		int result = 1;
		int devide;
		for (devide = number1; devide > number2; devide += -number2) {
			result++;
		}
		return result;
	}

	
	public static int square(int number1, int number2) {
		int result = 0;
		for (int i = 0; i < number1; i++) {
			 result += add (result, number1);
		}
		return result;
	}

	/*
	 * Methode hieronder is voor de verheffing van het grondgetal 'number1' tot een
	 * willekeurige macht, het exponent 'number2'
	 */

	public static int exponentiation(int number1, int number2) {
		// HINT: multiply???
		int result = 1;
		for (int i = 0; i < number2; i++) {
			result *= number1;
			// result *= add (result, number1);
		}
		return result;
	}

}