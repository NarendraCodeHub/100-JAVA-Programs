import java.util.Scanner;

/**
 * 11. How to check Odd and Even Number in java.
 */
public class OddOrEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	try {
		System.out.println("Enter the numbers: ");
		int  num = scan.nextInt();
		if (num>=1) {
			if (num%2==0) {
				System.out.println(num +" is Even Number.");
			}else {
				System.out.println(num +" is Odd Number.");
			}
		}else {
			System.out.println("Enter a Positive Number");
		}
		
	}catch (Exception e) {
			System.out.println("Invalid Input !!!");
		}
	}
}
