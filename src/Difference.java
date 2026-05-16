/**
 * 37.Difference between Static and Instance method working in java Program
 */
public class Difference {
	public static void main(String[] args) {
		display(); // Calling without Object
		Difference object = new Difference();
		object.show(); // Calling Using Object
	}

	static void display() {
		System.out.println("This is Static Method");
	}

	void show() {
		System.out.println("THis is Non-Static Method");
	}
}
