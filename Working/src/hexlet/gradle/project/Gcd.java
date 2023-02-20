package hexlet.gradle.project;
import java.util.Scanner;
import java.lang.Math;
public class Gcd {
	public static void gcdNums() {
		var result = 0;
		while(result < 3) {
			var num1 = 1 + (int)(Math.random() * 100);
			var num2 = 1 + (int)(Math.random() * 100);
			System.out.println("Find the greatest common divisor of given numbers.\n"
					+ "Question: " + num1 + " " + num2);
			
			while(num1 != num2) {
				if(num1 > num2) {
					num1 = num1 - num2;
				}if(num1 < num2) {
					num2 = num2 - num1;
				}
			}
			var nod = num1;
			
			Scanner scan = new Scanner(System.in);
			int userAnswer = 0;
			if(!scan.hasNextInt()) {
				System.out.println("Incorrect input");
				return;
			}else {
				userAnswer = scan.nextInt();
			}
			System.out.println("Your answer: " + userAnswer);
			
			if(userAnswer == nod) {
				System.out.println("Correct.");
				result += 1;
			}else {
				System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was" + "'" + nod + "'");
				result = 0;
			}
			if(result == 3) {
				System.out.println("Congratulations!");
				return;
			}
			
			
			
		}
		
	}

}
