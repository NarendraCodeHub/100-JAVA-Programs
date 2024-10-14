import java.util.Scanner;

/**
 * 7. How to swap 2 no without using 3rd variable.
 */
public class SwapNumbersWithout {

	public static void main(String[] args) {
		int firstNum;
		int secondNum;
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter the First Number : ");
			firstNum = scan.nextInt();
			System.out.println("Enter the Second Number : ");
			secondNum = scan.nextInt();
			
			int temp = firstNum;
			firstNum = secondNum;
			secondNum = temp;
			
			System.out.println("First Number is " + firstNum + "\n"+"Second Number is " +secondNum);
			
		} catch (Exception e) {
			System.out.println("Invalid Input !!!");
		}
		
		
		
	}

}
