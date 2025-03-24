import java.util.Scanner;

public class IndexOfInput {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String input, searchString;

			while (true) {
				System.out.print("Enter the sentence: ");
				input = scan.nextLine().trim();

				System.out.print("Enter the word/substring to find its index: ");
				searchString = scan.nextLine().trim();

				if (input.isEmpty() || searchString.isEmpty()) {
					System.out.println("Error: Input cannot be empty. Please try again.");
					continue;
				}

				if (!input.matches("[a-zA-Z .,']+") || !searchString.matches("[a-zA-Z .,']+")) {
					System.out.println("Error: Input must contain only letters and spaces. Please try again.");
					continue;
				}

				break;
			}

			// Find the index of the search string in the input sentence
			int index = input.indexOf(searchString);

			if (index != -1) {
				System.out.println("The substring '" + searchString + "' starts at index: " + index);
			} else {
				System.out.println("The substring '" + searchString + "' was not found in the given sentence.");
			}

		} catch (Exception e) {
			System.out.println("Unexpected error occurred: " + e.getMessage());
		}
	}
}
