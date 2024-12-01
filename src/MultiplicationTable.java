import java.util.Scanner;

/**
 * 21. Print Multiplication table Program in java
 */

public class MultiplicationTable {
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
			
			 System.out.println("Enter an integer to print it's multiplication table");

			int num = scan.nextInt();
			
			 System.out.println("Multiplication table of "+ num +" is :-");

			for (int i = 1; i <= 10; i++) {
				
				int temp = num*i; 
				System.out.println(num + " X " + i + " = " + temp);
			}
		} catch (Exception e) {
            System.out.println("Unexpected error! Please try again.");
		}
	}
}
