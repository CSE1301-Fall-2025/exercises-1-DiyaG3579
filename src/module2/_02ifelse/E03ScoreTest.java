package module2._02ifelse;
import java.util.Scanner;
public class E03ScoreTest {
	//Exercise 3: Add an else statement that prints out "good job!"
	//if the score is greater than 9.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What score did you get?");
		int score = scan.nextInt();
		if (score <= 9) {
			System.out.println("Try for a higher score");
		}
		else {
			System.out.println("Good Job!");
		}
	}
}
