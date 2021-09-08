import java.io.IOException;
import java.util.Scanner;

public class TestTask {
	public static void main(String[] args) {

		int g1;
		int g2;
		int another = 0;
		int resultRim = 0;

		MyException me = new MyException();
		ConvertorRtoA c = new ConvertorRtoA();
		Methods m = new Methods();
		Operations op = new Operations();// -

		m.Scan();

		try {
			g1 = m.parser(m.a);
		} catch (NumberFormatException nfe) {
			g1 = c.con(m.a);
			another++;
		}

		try {
			g2 = m.parser(m.b);
		} catch (NumberFormatException nfe) {
			g2 = c.con(m.b);
			another++;
		}

		me.check1to10(g1);
		me.check1to10(g2);		
		
		switch (another) {
		case 0:
			op.calc(m.operation, g1, g2);
			System.out.println("Результат = " + op.calc(m.operation, g1, g2));
			break;
		case 1:
			me.checkRimA();
			break;
		case 2:
			resultRim = op.calc(m.operation, g1, g2);
			if (resultRim < 1) {
				me.checkRimMinus();
			}
			ConvertorAtoR c1 = new ConvertorAtoR();
			c1.conAtoR(resultRim);
			System.out.println("Результат = " + c1.conAtoR(resultRim));
			break;

		default:
		}
		
	}

}

