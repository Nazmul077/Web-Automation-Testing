package firstjava;

public class StaticVsNonStatic extends MethodExample {
	
	/*
	 * Method -> StaticVsNonStatic
	 * 
	 */

	int a = 10;
	static int b = 20;

	public void add(int x, int y) {
		int sum = x + y;
		System.out.println("Sum " + sum);
	}

	public void add() {
		int sum = a + b;
		System.out.println("Sum " + sum);
	}

	public static void addS() {
		StaticVsNonStatic obj = new StaticVsNonStatic();
		int sum = obj.a + b;
		System.out.println("Sum " + (sum + 20));
	}

	public static void main(String[] args) {
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.add();
		addS();
	}

	static {
		System.out.println("This is only static");
		System.out.println("Sudhu static thakle setar kaj sobar age hbe");
		System.out.println("Then main medhod a jabe");
		System.out.println("Sudhu static na thakle normaly line by line hbe");
		int a = 100;
		int b = 200;
		System.out.println(a + b);
	}

}
