import java.util.Scanner;

/**
 * 8. How to add two number Program.
 */
public class AddNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter the Two numbers for Sum : ");
		float  x = scan.nextFloat();
		float  y= scan.nextFloat();
			
		float  z= x + y;
		
		System.out.println("The Sum of Two Numbers are "+ z);
			
		} catch (Exception e) {
			System.out.println("Invalid Input !!!");
		}
	}

}
