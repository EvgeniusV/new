package hexlet.gradle.project;
import java.util.Scanner;
import java.lang.Math;

public class Progression {
	public static void progresNums() {
		var result = 0;
		while(result < 3) {
			
			int countNums = 5 + (int)(Math.random() * 6);
			int progression = 1 + (int)(Math.random() * 5);
			String numStr = "";
			int randomNums = 0;
					for(var i = 1; i < countNums; i += 1) {
						 randomNums += progression; 
						 numStr += randomNums + " ";
						 }
					
			String[] symbol = numStr.split(" ");
			var symbolLength = symbol.length;
			var randPointer = (int)(Math.random() * symbolLength);
			var tmp = symbol[randPointer];
			var tmpInt = Integer.parseInt(tmp);
			symbol[randPointer] = "..";
			
			String question = "";
			for(var i = 0; i < symbolLength; i++) {
				question += symbol[i] + " ";
			}
			
			System.out.println("What number is missing in the progression?\n"
					+ "Question: " + question);
			Scanner scan = new Scanner(System.in);
			int userAnswer = 0;
			
			if(!scan.hasNextInt()) {
				System.out.println("Incorrect input");
				return;
			}else {
				userAnswer = scan.nextInt();
			}
			
			if(userAnswer == tmpInt) {
				System.out.println("Correct.");
				result += 1;
			}else {
				System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + tmpInt + "'");
				result = 0;
			}
			
			if(result == 3) {
				System.out.println("Congratulations");
				return;
			}		
		}	
		}
}

