import java.util.Arrays;
import java.util.Scanner;

/**
 * 10. If Else clause in java- Program.
 */

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num_1 = 10, num_2 = 100, num_3 = 786, num_4 = 1999, num_5 = 2, num_6 = 99, num_7 = 55, num_8 = 15, num_9 = 65, num_10 = 420;
		
		System.out.println("Enter numbers to check that the mentioned numbers match");
		
		try {
			int matchNum = scan.nextInt();
			if (Arrays.asList(num_1, num_2, num_3, num_4, num_5, num_6, num_7, num_8, num_9, num_10).contains(matchNum)) {
				System.out.println("*****************************************************************************");
				System.out.println("$$$ YOU WON THE MATCH , YOUR NUMBER IS MATCHED WITH MENTIONED NUMBERS $$$");
				System.out.println("*****************************************************************************");
			}else {
				System.out.println("$$$ YOU LOSE THE MATCH , YOUR NUMBER IS NOT MATCHED WITH MENTIONED NUMBERS. TRY AGAIN !!! $$$");
			}
			
		} catch (Exception e) {
			System.out.println("Invalid Input !!!");
		}
	}

}
