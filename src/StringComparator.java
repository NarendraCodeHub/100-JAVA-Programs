import java.util.Scanner;

/**
 * 27. How to compare 2 strings in Java Program
 */
public class StringComparator {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String firstString, secondString;

			// Input validation loop
			while (true) {
				System.out.print("Enter the First String: ");
				firstString = scanner.nextLine().trim();

				System.out.print("Enter the Second String: ");
				secondString = scanner.nextLine().trim();

				// Validate input: non-empty and alphabetic only
				if (firstString.isEmpty() || secondString.isEmpty()) {
					System.out.println("Error: Input cannot be empty. Please try again.");
				} else if (!firstString.matches("[a-zA-Z]+") || !secondString.matches("[a-zA-Z]+")) {
					System.out.println("Error: Input must contain only letters. Please try again.");
				} else {
					break;
				}
			}

			// Compare strings and display the result
			int comparisonResult = firstString.compareTo(secondString);
			if (comparisonResult == 0) {
				System.out.println("Result: The strings are equal.");
			} else if (comparisonResult < 0) {
				System.out.println("Result: The first string is lexicographically smaller than the second string.");
			} else {
				System.out.println("Result: The first string is lexicographically greater than the second string.");
			}
		} catch (Exception exception) {
			System.out.println("Unexpected error occurred: " + exception.getMessage());
		}
	}
}
