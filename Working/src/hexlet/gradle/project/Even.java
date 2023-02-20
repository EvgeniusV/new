package hexlet.gradle.project;
import java.util.Scanner;
import java.lang.Math;
public class Even {
	public static void evenNums() {
		var result = 0;
		while(result < 3) {
	
		Scanner scan = new Scanner(System.in);
		var number = 1 + (int)(Math.random() * 100);
		var numberEven = number % 2 == 0 ? "yes": "no";
		System.out.println("Answer 'yes' if the number is even otherwise answer 'no'.\n"
				+ "Question: " + number);
		String userChoice = "";
		if(!scan.hasNextLine()) {
			System.out.println("Incorrect input");
			return;
		}else {
			userChoice = scan.nextLine();
		}
		System.out.println("Your answer: " + userChoice);
		String correctAnswer = userChoice.equals(numberEven) ? "yes" : "no";
		if(userChoice.equals(numberEven)) {
			System.out.println("Correct!");
			result += 1;
		}else {
			System.out.println("'" + userChoice + "'" + "is wrong answer ;(. Correct answer was " + correctAnswer);
			System.out.println("Lets Try again!");
			result = 0;
		}
		if(result == 3) {
			System.out.println("Congratulations!");
			scan.close();
			return;
		}				
		}
	}
}
