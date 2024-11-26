import java.util.Scanner;

/**
 * 15. While loop Program in Java
 */
public class WhileLoop {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n;
            System.out.println("Input an integer (Enter 0 to exit):");

            // Loop until the user enters 0
            while (true) {
                // Validate if the input is an integer
                if (scan.hasNextInt()) {
                    n = scan.nextInt();
                    if (n == 0) {
                        System.out.println("Exiting the loop. Goodbye!");
                        break; 
                    }
                    System.out.println("You entered: " + n);
                    System.out.println("Input another integer (Enter 0 to exit):");

                } else {
                    // Clear the invalid input
                    System.out.println("Invalid input! Please enter a valid integer.");
                    scan.next(); 
                }
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
    }
}
