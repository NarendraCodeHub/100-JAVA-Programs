import java.util.Scanner;
/**
 * 17.While loop using break Program in java
 */

public class BreakWhileLoop {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter a positive number: ");
                while (!scan.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a valid positive integer:");
                    scan.next();
                }
                int num = scan.nextInt();

                if (num == 0 || num == 99 || num == 100 || num == 500 || num == 1001) {
                    System.out.println("Entered number matched!");
                    break;
                }
            }
		} catch (Exception e) {
            System.out.println("Unexpected Error! Please try again. !!!");
		}
	}
}
