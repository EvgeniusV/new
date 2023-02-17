package testing;
import java.util.Scanner;
import java.lang.Math;

public class Nod {
	public static void nod() {
		var result = 0;
		while (result < 3) {
			Scanner scan = new Scanner(System.in);
			var number1 = (1 + (int)Math.random() * 100);
			var number2 = (1 + (int)Math.random() * 100);
			while(number1 != number2) {
				if(number1 > number2) {
					number1 = number1 - number2;
				}else {
					number2 = number2 - number1;
				}
				var numberNod = number1;
				System.out.println("Find the greatest common divisor of given numbers.\n"
						+ "Question: " + number1 + number2);
			}
		}
	}
}
