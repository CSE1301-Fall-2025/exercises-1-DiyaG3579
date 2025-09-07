package module2._07strings;

public class E02ReverseString {

	//Exercise 2: What would happen if you started the loop at 1 instead? 
	//What would happen if you used <= instead of <? 
	//What would happen if you changed the order in which you added the ithLetter in line 12?
	public static void main(String[] args) {
		String s = "Hello";
		String sReversed = "";
		String ithLetter;

		for(int i=1; i < s.length(); i++) {
			ithLetter = s.substring(i,i+1);
			// add the letter at index i to what's already reversed.
			sReversed = ithLetter + sReversed;
		}
		System.out.println(s + " reversed is " + sReversed);
	helppppp
	}
}

