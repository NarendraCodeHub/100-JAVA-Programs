/**
 * 42. How to create an Interface in a Java Program
 */
interface Info {
	String LANGUAGE = "Java";

	void display();
}

public class ImplementsClass implements Info {
	public static void main(String[] args) {
		ImplementsClass obj = new ImplementsClass();
		obj.display();
	}

	@Override
	public void display() {
		System.out.println(LANGUAGE + " is awesome");
	}
}
