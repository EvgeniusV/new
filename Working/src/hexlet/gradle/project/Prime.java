package hexlet.gradle.project;
import java.util.Scanner;
import java.lang.Math;

public class Prime {
	public static void primeNums() {
		var result = 0;
		while(result < 3) {
			
			var number = 1 + (int)(Math.random() * 100);
			var numberPrime = (number != 0) && (number % 1 == 0) && (number % number == 0) ? "yes" : "no";
			System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.\n"
					+ "Question: " + number);
			Scanner scan = new Scanner(System.in);
			
			var userAnswer = "";
			if(!scan.hasNextLine()) {
				System.out.println("Incorrect input");
				return;
			}else {
				userAnswer = scan.nextLine();
			}
			
			if(userAnswer.equals(numberPrime)) {
				System.out.println("Correct.");
				result += 1;
			}else {
				System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + numberPrime + "'");
				System.out.println("Lets, try again!");
				result = 0;
			}
			
			if(result == 3) {
				System.out.println("Congratulations!");
				return;
			}
		}
	}
}