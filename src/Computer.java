/**
 * 38.How to create Multiple class in java Program
 */
public class Computer {
	Computer() {
		System.out.println("Construction  of Computer class.");
	}

	void computerMethod() {
		System.out.println("Non-Static method of computer class");
	}

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.computerMethod();

		Laptop laptop = new Laptop();
		laptop.laptopMethod();
	}
}

class Laptop {

	Laptop() {
		System.out.println("Constrution of Laptop class");
	}

	void laptopMethod() {
		System.out.println("Non-Static method of computer class");
	}
}
