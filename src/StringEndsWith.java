import java.util.Scanner;

/**
 * 28.Program to check if a string ends with a specific substring in Java.
 */
public class StringEndsWith {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String inputStr, valEndStr;

			while (true) {
				System.out.print("Enter the main string: ");
				inputStr = scan.nextLine().trim();

				System.out.print("Enter the substring to check: ");
				valEndStr = scan.nextLine().trim();

				if (inputStr.isEmpty() || valEndStr.isEmpty()) {
					System.out.println("Error: Input cannot be empty. Please try again.");
					continue;
				}

				if (!inputStr.matches("[a-zA-Z ]+") || !valEndStr.matches("[a-zA-Z ]+")) {
					System.out.println("Error: Input must contain only letters and spaces. Please try again.");
					continue;
				}

				break; // Valid input, exit loop
			}

			// Checking if the input string ends with the specified substring
			boolean result = inputStr.endsWith(valEndStr);
			System.out.println("Does the string end with '" + valEndStr + "'?\n" + result);

		} catch (Exception e) {
			System.out.println("Unexpected error occurred: " + e.getMessage());
		}
	}
}
