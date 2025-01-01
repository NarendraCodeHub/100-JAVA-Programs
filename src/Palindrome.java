import java.util.Scanner;

/**
 * 26. Check Given No is palindrome or Not in java.
 */
public class Palindrome {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String input;
			while (true) {
				System.out.print("Enter a valid string to check if it is a palindrome: ");
				input = scan.nextLine();

				// Validate input: it should not be empty and must contain only letters
				if (input.isEmpty()) {
					System.out.println("Input cannot be empty. Please try again.");
				} else if (!input.matches("[a-zA-Z]+")) {
					System.out.println("Input must contain only letters. Please try again.");
				} else {
					break;
				}
			}
			String temp = input;
			String check_palindrome = "";
			for (int i = input.length() - 1; i >= 0; i--) {
				check_palindrome = check_palindrome + input.charAt(i);
			}
			// Also we can use
			// check_palindrome = new StringBuilder(input).reverse().toString();

			if (temp.equals(check_palindrome)) {
				System.out.println(temp + " is a Palindrome");
			} else {
				System.out.println(temp + " is not a Palindrome");
			}
		} catch (Exception e) {
			System.out.println("Unexpected error! Please try again.");
		}
	}
}
