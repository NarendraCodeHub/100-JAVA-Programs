import java.util.Scanner;

/**
 * 9. Find Largest no in java Program.
 */
public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Three Numbers for Finding Largest of Three Number :");
		try {
			int X = scan.nextInt();
			int Y = scan.nextInt();
			int Z = scan.nextInt();
			
			if (X > Y && X > Z) {
				System.out.println("The largest number among the three numbers is " + X);
			}else if (Y > X && Y > Z) {
				System.out.println("The largest number among the three numbers is " + Y);
			}else if (Z > X && Z > X) {
				System.out.println("The largest number among the three numbers is " + Z);
			}
		} catch (Exception e) {
			System.out.println("Inavlid Input !!!");
		}
	}
}
