/*
 * 24. Find All substring of string in java Program
 */

import java.util.Scanner;

public class SubstringsOfAString {
	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			String string, sub;
			System.out.println("Enter a string to print it's all substrings");
			string = scan.nextLine();
			int length = string.length();
			System.out.println("Substrings of \"" + string + "\" are :-");
			for (int c = 0; c < length; c++) {
				for (int i = 1; i <= length - c; i++) {
					sub = string.substring(c, c + i);
					System.out.println(sub);
				}
				System.out.println("------------------");
			}
		} catch (Exception e) {
			System.out.println("Unexpected error! Please try again.");
		}

	}

}
