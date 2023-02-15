package testing;
import java.util.Scanner;

public class Greeting {
	
	public static void Hello() {
		Scanner scan = new Scanner(System.in);
		Greeting name = new Greeting();
		System.out.println("Welcome to the Brain Games!\nMay I have your name?");
		String userName;
		if(scan.hasNextLine()) {
			userName = scan.nextLine();
		}else {
			System.out.println("Incorrect input, please try again.");
			userName = scan.nextLine();
		}
		System.out.println("Hello " + userName);
	}

}
