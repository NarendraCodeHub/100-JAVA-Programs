import java.util.Scanner;

/*
 * 23. Check no is Armstrong or not in java Program
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a number to check if it's an Armstrong number:");
			while (!scan.hasNextInt()) {
				System.out.println("Invalid input! Please enter a valid integer:");
				scan.next();
			}
			int num = scan.nextInt();
			int copy = num;
			int digits = String.valueOf(num).length();

			int temp = 0;
			while (num != 0) {
				int digit = num % 10;
				temp += Math.pow(digit, digits);
				num /= 10;

			}
			if (copy == temp) {
				System.out.println(copy + " is an Armstrong number.");
			} else {
				System.out.println(copy + " is not an Armstrong number.");
			}

		} catch (Exception e) {
			System.out.println("Unexpected error! Please try again.");
		}
	}

}
