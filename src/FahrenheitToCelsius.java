import java.util.Scanner;

/**
 * 5. How to convert Fahrenheit to Celsius Program in java.
 */

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float temp;
		
		System.out.println("Enter temperatue in Fahrenheit");
		temp = scan.nextFloat();
		
		temp = ((temp-32)*5)/9;
		
		System.out.println("Temperatue in Celsius = " + temp);

	}

}
