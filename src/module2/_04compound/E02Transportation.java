package module2._04compound;

public class E02Transportation {

	//Exercise 2: Try different combinations, what is necessary
	//for the program to print "You can go out"?
	public static void main(String[] args) {
		boolean walking = false;
		boolean carIsAvailable = true;
		if (walking || carIsAvailable) {
			System.out.println("You can go out");
		}
		else {
			System.out.println("No, you can't go out");
		}
	}
}
