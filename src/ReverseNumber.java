import java.util.Scanner;

/**
 * 16. Print Reverse number in java program.
 */
public class ReverseNumber {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int temp = 0;
			System.out.println("Enter a Number: ");
			
            while (!scan.hasNextInt()) { 
                System.out.println("Invalid input! Please enter a valid integer :");
                scan.next(); 
            }
            int num = scan.nextInt();

			while (num !=0) {
				temp = temp * 10;
				temp = temp + num%10; 
				num = num/10;
			}
			System.out.println("The Reverse number of Enter Number is "+ temp);
		} catch (Exception e) {
            System.out.println("Unexpected Error! Please try again. !!!");
		}
	}

}
