package module2._03elseif;

public class E03BatteryTest {

	//Exercise 3: Finish this program so that it prints out
	//"plug in your phone!" if the battery is below 50,
	//"unplug your phone!" if it is above 100,
	//and "All okay!" otherwise. Test all three situations.
	public static void main(String[] args) {
		int battery = 13;
	if (battery <=20) {
		System.out.println("Charge Your Phone");
	}
	else if (battery > 20 && battery <= 100) {
		System.out.println("All okay!");
	}
	else {
		System.out.println("Unplug Your Phone");
	}
	}
}
