import java.util.Scanner;

/**
 * 32. How to remove space in string both end and middle extra space in java
 * Program
 * 
 */
public class StringTrimExample {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("=== String Trim Program ===");

			while (true) {

				System.out.print("\nEnter a sentence (type 'exit' to quit): ");
				String input = scanner.nextLine();

				// Exit condition
				if (input.equalsIgnoreCase("exit")) {
					System.out.println("Program terminated.");
					break;
				}

				// Remove leading and trailing spaces
				String trimmed = input.trim();
				System.out.println("Sentence with trim: " + trimmed);

				// Normalize spaces between words
				String normalized = trimmed.replaceAll("\\s+", " ");
				System.out.println("Sentence with single spaces: " + normalized);
			}

		} catch (Exception e) {
			System.out.println("Unexpected error occurred: " + e.getMessage());
		}
	}
}