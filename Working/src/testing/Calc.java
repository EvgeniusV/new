package testing;
import java.lang.Math;
import java.util.Scanner;
import java.util.Random;

public class Calc {
	public static void Calculator() {
		Random rand = new Random();
		var result = 0;
		while(result < 3) {
		var number1 = (int) (1 + Math.random() * 100);
		var number2 = (int) (1 + Math.random() * 100);
		var operation = "+-*";
		char symbol = operation.charAt(rand.nextInt(operation.length()));
		var answer = 0;
		String question = (number1 + " " + symbol + " " + number2);
		if(symbol == '+') {
			answer = number1 + number2;
		}else if(symbol == '-') {
			answer = number1 - number2;
		}else if(symbol == '*') {
			answer = number1 * number2;
		}
		System.out.println("What is the result of the expression?\nQuestion: " + question);
		Scanner scan = new Scanner(System.in);
		int userChoice = 0;
		if(scan.hasNextInt()) {
			userChoice = scan.nextInt();
			System.out.println("Your answer: " + userChoice);
		}else {
			System.out.println("Incorrect input");
			userChoice = scan.nextInt();
		}
		if(userChoice == answer) {
			System.out.println("Correct!");
			result +=1;
		}else {
			System.out.println("'" + userChoice + "'" + " is wrong answer ;(. Correct answer was " + "'" + answer + "'\n"
					+ "Lets try again!");
			result = 0;
		}
		if(result == 3) {
			System.out.println("Congratulations!");
		}
	}
		
	}

}
