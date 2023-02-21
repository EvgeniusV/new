package hexlet.gradle.project;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userChoice = 0;
		System.out.println("Please enter the game number and press Enter.\n"
				+ "1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Proggression\n"
				+ "6 - Prime\n0 - Exit");
		if(scan.hasNextInt()) {
			userChoice = scan.nextInt();
			if(userChoice <= 7 && userChoice > 0) {
			}else {
				while(userChoice > 7) {
					System.out.println("Incorrect input");
					userChoice = scan.nextInt();
				}
			}
		}else {
			System.out.println("Incorrect input. Restart the game.");
			return;
		}
		System.out.println("Your choice: " + userChoice);
		
		switch(userChoice){
			case 1:
				Greeting.hello();
				break;
			case 2:
				Greeting.hello();
				Even.evenNums();
				break;
			case 3:
				Greeting.hello();
				Calc.calcNums();
				break;
			case 4:
				Greeting.hello();
				Gcd.gcdNums();
				break;
			case 5:
				Greeting.hello();
				Progression.progresNums();
				break;
			case 6:
				Greeting.hello();
				Prime.primeNums();
				break;
			case 0:
				System.out.println("Good Bye!");
				return;
		}
		
		
	}
}