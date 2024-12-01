import java.util.Scanner;
/*
 * 22.Print prime no Program in java
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            // Input validation for starting number
            System.out.println("Enter the Starting Number: ");
            while (!scan.hasNextInt()) {
                System.out.println("Invalid Input! Enter a valid number:");
                scan.next();
            }
            int start_num = scan.nextInt();

            // Input validation for ending number
            System.out.println("Enter the Ending Number: ");
            while (!scan.hasNextInt()) {
                System.out.println("Invalid Input! Enter a valid number:");
                scan.next();
            }
            int end_num = scan.nextInt();

            // Checking if input numbers are greater than 1 and in correct range
            if (start_num > 1 && end_num > 1 && end_num >= start_num) {
                System.out.println("Prime numbers between " + start_num + " and " + end_num + " are:");
                
                for (int i = start_num; i <= end_num; i++) {
                    boolean isPrime = true;
                    for (int j = 2; j <= Math.sqrt(i); j++) { 
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.println(i + " is a Prime Number.");
                    }
                }
            } else {
                System.out.println("Starting and ending numbers must be greater than 1, and the ending number must be greater than or equal to the starting number.");
            }
        } catch (Exception e) {
            System.out.println("Unexpected error! Please try again.");
        }
    }
}
