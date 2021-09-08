import java.io.IOException;
import java.util.*;

public class Methods {

	String operation;
	String s;
	String a = "";
	String b = "";

	MyException meO = new MyException();

	public static int parser(String str) {
		int num = Integer.parseInt(str);
		return num;
	}

	public void Scan() {
		Scanner scn = new Scanner(System.in);

		System.out.println("¬ведите математическую операцию");
		s = scn.nextLine();

		meO.checString(s);

		char[] strToArray = s.toCharArray();

		int n = 0;
		int indexOperation = 0;

		for (int i = 1; i < strToArray.length; i++) {
			if (strToArray[i] == ('+') || strToArray[i] == ('-') || strToArray[i] == ('/') || strToArray[i] == ('*')) {
				operation = strToArray[i] + "";
				n++;
				indexOperation = i;
			}
		}

		meO.checkOperation(n);

		for (int i = 0; i <= indexOperation - 1; i++) {
			a = a + Character.toString(strToArray[i]) + "";
			a = a.replaceAll("[ ]", "");
		}

		for (int i = indexOperation + 1; i < strToArray.length; i++) {
			b = b + Character.toString(strToArray[i]) + "";
			b = b.replaceAll("[ ]", "");
		}

	}

}
