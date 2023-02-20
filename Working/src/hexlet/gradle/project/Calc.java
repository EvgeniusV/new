package hexlet.gradle.project;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Calc {
	public static void calcNums() {
		var result = 0;
		while(result < 3) {
			var num1 = 1 + (int)(Math.random() * 100);
			var num2 = 1 + (int)(Math.random() * 100);
			Scanner scan = new Scanner(System.in);
			Random rand = new Random();
			String operators = "+-*";
			char currentOperator = operators.charAt(rand.nextInt(operators.length()));
			System.out.println("What is the result of the expression?\n"
					+ "Question: " + num1 + " " + currentOperator + " " + num2);
			
			int userAnswer = 0;
			if(!scan.hasNextInt()) {
				System.out.println("Incorrect input");
				return;
			}else {
				userAnswer = scan.nextInt();
			}
			System.out.println("Your answer: " + userAnswer);
			
			int trueAnswer = 0;
			if(currentOperator == '+') {
				trueAnswer = num1 + num2;
			}else if(currentOperator == '-') {
				trueAnswer = num1 - num2;
			}else if(currentOperator == '*') {
				trueAnswer = num1 * num2;
			}
			
			if(userAnswer == trueAnswer) {
				System.out.println("Correct!");
				result += 1;
			}else {
				System.out.println("'" + userAnswer + "'" + " is wrong answer ;(."
						+ " Correct answer was " + "'" + trueAnswer + "'");
				result = 0;
			}
			if(result == 3) {
				System.out.println("Congratulations!");
				return;
			}
		}
		
	}

}
