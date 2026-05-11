/**
 * 36.How Static block working in java Program
 *
 * Demonstrates: 1. Static block execution 2. OS validation using static block
 */

public class StaticBlock {

	// First static block
	static {
		System.out.println("Static block is executed before main method.");
	}

	// Second static block for OS validation
	static {

		String os = System.getProperty("os.name");

		if (os != null && os.toLowerCase().contains("windows")) {

			System.out.println("Operating System validated successfully.");
			System.out.println("Detected OS: " + os);

		} else {

			System.out.println("This application supports only Windows OS.");
			System.exit(1);
		}
	}

	// Main method
	public static void main(String[] args) {

		System.out.println("Main method is executed.");
	}
}