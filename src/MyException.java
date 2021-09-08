import java.io.IOException;

public class MyException {

	public static void check1to10(int g) {

		if (g == (int) g && g < 1 || g > 10) {
			try {
				throw new IOException();
			} catch (IOException e) {
				System.out.println("throws Exteption: Введено неподходящее число(а)");
				System.exit(0);
			}
		}

	}

	public static void checkOperation(int n) {

		if (n != 1) {
			try {
				throw new IOException();
			} catch (IOException e) {
				System.out.println(
						"throws Exteption //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
				System.exit(0);
			}
		}

	}

	public static void checkRimA() {
		try {
			throw new IOException();
		} catch (IOException e) {
			System.out.println("throws Exteption//т.к. используются одновременно разные системы счисления");
			System.exit(0);
		}
	}

	public static void checkRimMinus() {
		try {
			throw new IOException();
		} catch (IOException e) {
			System.out.println("throws Exteption //т.к. в римской системе нет отрицательных чисел");
			System.exit(0);
		}
	}

	public static void checString(String inStr) {

		if (inStr.length() <= 2) {
			try {
				throw new IOException();
			} catch (IOException e) {
				System.out.println("throws Exception //т.к. строка не является математической операцией");
				System.exit(0);
			}
		}

	}

}
