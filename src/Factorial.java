import java.util.Scanner;
/**
 * 12. Find factorial for given no Program in Java
 */
public class Factorial {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter the Factorail Number: ");
			int num = scan.nextInt();
			if (num>=1) {
				int temp = 1;
				for (int i = num; i >= 1; i--) {
					temp = temp * i;
				}
				System.out.println("Factorial Number of "+ num +" is "+ temp);
			}else {
				System.out.println("The factorial of a number starts with an integer greater than or equal to one.");
			}
			
		} catch (Exception e) {
			System.out.println("Invalid Input !!!");	
			}
	}
}
