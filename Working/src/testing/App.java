package testing;
import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		var userChoice = 0;
		System.out.println("Please enter the game number and press Enter.");
		System.out.println("1 - Greet\n2 - Even\n0 - Exit");
		if(scan.hasNextInt()) {
			userChoice = scan.nextInt();
		}else {
			System.out.println("Incorrect input, please enter the number!");
			userChoice = scan.nextInt();
		}
		System.out.println("Your choice is " + userChoice);
		switch(userChoice) {
		case 1 :
			Greeting.Hello();
			break;
		case 2 :
			Greeting.Hello();
			Randomizer.number();
			break;
		}
	}
}
