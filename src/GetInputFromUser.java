import java.util.Scanner;

/**
 * 4. How to get Using input using Scanner Program in java.
 */
public class GetInputFromUser {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the A Number : ");
		int number = input.nextInt();
		System.out.println("You entered integer "+ number);
		
		System.out.println("Enter a Decimal Number : ");
		double decimal_num = input.nextDouble();
		System.out.println("You entered Decimal Number "+ decimal_num);
		
		System.out.println("Enter the String : ");
		String word = input.next();
		System.out.println("You entered string "+word);
	}

}
