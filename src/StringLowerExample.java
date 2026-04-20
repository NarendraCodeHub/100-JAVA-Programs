import java.util.Scanner;

/**
 * 33. How to convert all char in string lower case in java Program.
 */
public class StringLowerExample {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {

			System.out.println("=== String Lower Case Program ===");

			while (true) {
				System.out.print("\nEnter a sentence (type 'exit' to quit): ");
				String input = scan.nextLine();

				// Exit condition
				if (input.equalsIgnoreCase("exit")) {
					System.out.println("Program terminated.");
					break;
				}

				// Trim and convert to lowercase
				String lowerCase = input.trim().toLowerCase();

				System.out.println("Lowercase sentence: " + lowerCase);
			}

		} catch (Exception e) {
			System.out.println("Unexpected error occurred: " + e.getMessage());
		}
	}

}
