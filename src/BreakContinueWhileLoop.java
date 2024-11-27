import java.util.Scanner;

/**
 * 18. While loop using break and continue program in java
 */

public class BreakContinueWhileLoop {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter a positive number:");
                
                if (!scan.hasNextInt()) {     
                    System.out.println("Invalid input! Please enter a valid positive integer.");
                    scan.next();         
                    continue;
                }

                int num = scan.nextInt();
                if (num == 0 || num == 999) {
                    System.out.println("Entered number matched!");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Unexpected error! Please try again.");
        }
    }
}
