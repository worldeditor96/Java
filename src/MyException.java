import java.io.IOException;

public class MyException {

	public static void check1to10(int g) {

		if (g == (int) g && g < 1 || g > 10) {
			try {
				throw new IOException();
			} catch (IOException e) {
				System.out.println("throws Exteption: ������� ������������ �����(�)");
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
						"throws Exteption //�.�. ������ �������������� �������� �� ������������� ������� - ��� �������� � ���� �������� (+, -, /, *)");
				System.exit(0);
			}
		}

	}

	public static void checkRimA() {
		try {
			throw new IOException();
		} catch (IOException e) {
			System.out.println("throws Exteption//�.�. ������������ ������������ ������ ������� ���������");
			System.exit(0);
		}
	}

	public static void checkRimMinus() {
		try {
			throw new IOException();
		} catch (IOException e) {
			System.out.println("throws Exteption //�.�. � ������� ������� ��� ������������� �����");
			System.exit(0);
		}
	}

	public static void checString(String inStr) {

		if (inStr.length() <= 2) {
			try {
				throw new IOException();
			} catch (IOException e) {
				System.out.println("throws Exception //�.�. ������ �� �������� �������������� ���������");
				System.exit(0);
			}
		}

	}

}
