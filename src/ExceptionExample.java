import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			while (true) {

				try {
					System.out.println("\nEnter first number:");
					int firstNum = scanner.nextInt();

					System.out.println("Enter second number:");
					int secondNum = scanner.nextInt();

					int result = firstNum / secondNum;

					System.out.println("Result: " + result);

				} catch (ArithmeticException e) {
					System.out.println("Error: Cannot divide by zero.");
				} catch (InputMismatchException e) {
					System.out.println("Error: Please enter valid integers.");
					scanner.nextLine();
				}

				System.out.println("\nDo you want to continue? (yes/no)");
				String choice = scanner.next();

				if (choice.equalsIgnoreCase("no")) {
					System.out.println("Program terminated.");
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("Unexpected Error: " + e.getMessage());
		}
	}
}