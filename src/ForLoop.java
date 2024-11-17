import java.util.Scanner;
/**
 * 14. Simple For Loop Program in Java
 */
public class ForLoop {
	
    public static void main(String[] args) {

    	try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the Start number of Loop: ");
            while (!scan.hasNextInt()) { // Ensure the input is a valid integer
                System.out.println("Invalid input! Please enter a valid integer for Start number:");
                scan.next(); 
            }
            int num1 = scan.nextInt();

            System.out.println("Enter the End number of Loop: ");
            while (!scan.hasNextInt()) { 
                System.out.println("Invalid input! Please enter a valid integer for End number:");
                scan.next(); 
            }
            int num2 = scan.nextInt();

            // Loop Logic
            if (num2 > num1) {
                System.out.println("Ascending Order:");
                for (int i = num1; i <= num2; i++) {
                    System.out.println(i);
                }
            } else {
                System.out.println("Descending Order:");
                for (int i = num1; i >= num2; i--) {
                    System.out.println(i);
                }
            }
        } catch (Exception e) {
            System.out.println("Unexpected Error! Please try again. !!!");
        }
    }
}
