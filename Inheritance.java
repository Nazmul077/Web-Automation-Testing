package firstjava;

public class Inheritance extends StaticVsNonStatic {
	/*
	 * Method -> StaticVSNonStatic -> Inheritance
	 * Dada   -> Baba              -> Chele
	 * 
	 */
	static Inheritance inheritance = new Inheritance();

	public String print(String value) {
		System.out.println(value);
		System.out.println("Result: " + (a + b));
		return value;
	}

	public static String print1(String value) {
		System.out.println(value);
		System.out.println("Result: " + (inheritance.a + b));
		return value;
	}

	public static void main(String[] args) {
		//MethodExample obj = new MethodExample();
		inheritance.nonStaticMethod();
		inheritance.add();
		print1("Test");
		staticMethod();
	
	}

}
