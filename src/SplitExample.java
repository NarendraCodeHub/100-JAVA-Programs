import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 31. How to split string in java Program.
 */
public class SplitExample {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {

			System.out.println("=== String Split Program ===");

			while (true) {

				System.out.print("\nEnter the sentence (type 'exit' to quit): ");
				String input = scan.nextLine().trim();

				// Exit condition
				if (input.equalsIgnoreCase("exit")) {
					System.out.println("Program terminated.");
					break;
				}

				System.out.print("Enter the split character/string: ");
				String split_val = scan.nextLine().trim();

				// Validation
				if (split_val.isEmpty()) {
					System.out.println("Delimiter cannot be empty. Try again.");
					continue;
				}

				// Safe split (handles regex special characters)
				String[] result = input.split(Pattern.quote(split_val));

				System.out.println("\nSplit Result:");
				for (String r : result) {
					System.out.println(r);
				}
			}

		} catch (Exception e) {
			System.out.println("Unexpected error occurred: " + e.getMessage());
		}
	}
}