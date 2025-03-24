import java.util.Scanner;

public class ReplaceAllEnterString {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			String input, wordToReplace, replaceString;

			while (true) {
				System.out.print("Enter the sentence: ");
				input = scan.nextLine().trim();

				System.out.print("Enter the word/substring to replace: ");
				wordToReplace = scan.nextLine().trim();

				System.out.print("Enter the new replacement word: ");
				replaceString = scan.nextLine().trim();

				if (input.isEmpty() || wordToReplace.isEmpty() || replaceString.isEmpty()) {
					System.out.println("Error: Input cannot be empty. Please try again.");
					continue;
				}

				if (!input.matches("[a-zA-Z .,']+") || !wordToReplace.matches("[a-zA-Z .,']+")
						|| !replaceString.matches("[a-zA-Z .,']+")) {
					System.out.println(
							"Error: Input must contain only letters, spaces, '.', ',', or '''. Please try again.");
					continue;
				}

				if (!input.contains(wordToReplace)) {
					System.out.println(
							"Error: The word '" + wordToReplace + "' is not found in the sentence. Try again.");
					continue;
				}

				break;
			}

			String updatedSentence = input.replaceAll(wordToReplace, replaceString);

			System.out.println("Updated sentence: " + updatedSentence);

		} catch (Exception e) {
			System.out.println("Unexpected error occurred: " + e.getMessage());
		}
	}
}
