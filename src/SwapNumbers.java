import java.util.Scanner;
/**
 * 6. How to swap 2 no using 3rd variable Program.
 */
public class SwapNumbers {

	public static void main(String[] args) {
		int firstNum;
		int secondNum;
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter the First Number : ");
			firstNum = scan.nextInt();
			System.out.println("Enter the Secod number : ");
			secondNum = scan.nextInt();
			
			firstNum = firstNum +secondNum; 
			secondNum = firstNum -secondNum; 
			firstNum = firstNum -secondNum; 
			
			System.out.println("First Number is " + firstNum + "\n"+"Second Number is " +secondNum);
		} catch (Exception e) {
			System.out.println("Invalid Input !!!");
		}
	}

}
