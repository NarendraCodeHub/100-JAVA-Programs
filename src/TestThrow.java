/**
 * 41. How to throw exception in java Program.
 */
public class TestThrow {

	static void validateAge(int age) {

		if (age < 18) {
			throw new IllegalArgumentException("Age is not valid for voting.");
		} else {
			System.out.println("You are eligible.");
		}
	}

	public static void main(String[] args) {

		try {
			validateAge(20);

		} catch (IllegalArgumentException e) {
			System.out.println("Exception Caught: " + e.getMessage());
		}

	}
}