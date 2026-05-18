/**
 * 39. How to create constructor overloading in java Program
 */
public class Language {
	String name;

	Language() {
		System.out.println("Construction Method is called.");
	}

	Language(String t) {
		name = t;
	}

	public static void main(String[] args) {
		Language c = new Language();
		Language j = new Language("java");
		c.setName("C++");
		j.getName();
		c.getName();
	}

	void setName(String t) {
		name = t;
	}

	void getName() {
		System.out.println("Language Name " + name);
	}
}
