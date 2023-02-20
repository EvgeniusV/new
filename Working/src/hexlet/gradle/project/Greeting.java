package hexlet.gradle.project;
import java.util.Scanner;

public class Greeting {
	public static void hello() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Brain Games!\nMay I have your name?");
		String userName = "";
		if(scan.hasNextLine()) {
			userName = scan.nextLine();
			System.out.println("Hello " + userName);
		}else {
			System.out.println("Incorrect input");
		}
	}
}
