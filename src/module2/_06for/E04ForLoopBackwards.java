package module2._06for;

public class E04ForLoopBackwards {

	//Exercise 4: Edit the loop to count down from 5 to 1 by 2s. The result should be:

	//5
	//3
	//1
	public static void main(String[] args) {
		int count = 5;
		while (count <= -1) {
			System.out.println(count);
			count -=2
		}
		//for(int count = 1; count <= 5; count += 2) {
		//	System.out.println(count);
		//}
	}
}
