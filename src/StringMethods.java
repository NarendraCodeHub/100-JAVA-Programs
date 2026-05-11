import java.util.Scanner;

/**
 * 35. A simple Java program to: 1. Find the length of a string 2. Replace part
 * of a string 3. Concatenate another string
 */

public class StringMethods {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {

			System.out.println("==================================");
			System.out.println(" String Methods Java Program ");
			System.out.println("==================================");

			// Input main string
			System.out.print("Enter a string: ");
			String input = scanner.nextLine().trim();

			// Find string
			System.out.print("Enter the word to replace: ");
			String findString = scanner.nextLine().trim();

			// Replace string
			System.out.print("Enter the replacement word: ");
			String replaceString = scanner.nextLine().trim();

			// Concatenate string
			System.out.print("Enter a string to concatenate: ");
			String concatenateString = scanner.nextLine().trim();

			// Find length
			int length = input.length();

			// Replace text
			String replacedString = input.replace(findString, replaceString);

			// Concatenate text
			String concatenatedString = input.concat(" " + concatenateString);

			// Output results
			System.out.println("\n========= OUTPUT =========");

			System.out.println("Original String      : " + input);
			System.out.println("String Length        : " + length);
			System.out.println("Replaced String      : " + replacedString);
			System.out.println("Concatenated String  : " + concatenatedString);

		} catch (Exception e) {

			System.out.println("An unexpected error occurred: " + e.getMessage());

		} finally {

			scanner.close();
		}
	}
}