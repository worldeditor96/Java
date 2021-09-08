
public class Operations {
	int sum;

	public int calc(String operation, int number1, int number2) {
		switch (operation) {
		case "-":
			sum = number1 - number2;
			break;
		case "+":
			sum = number1 + number2;
			break;
		case "*":
			sum = number1 * number2;
			break;
		case "/":
			sum = number1 / number2;
			break;
		default:

		}
		return sum;

	}
}
