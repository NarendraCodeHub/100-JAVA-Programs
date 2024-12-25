
/**
 * 25. Print reverse string in java Program
 */
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a string to reverse");
			String str = scan.next();
			String reverse = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				reverse = reverse + str.charAt(i);
			}
			System.out.println("Reverse of " + str + " string is: " + reverse);
		} catch (Exception e) {
			System.out.println("Unexpected error! Please try again.");
		}
	}
}
