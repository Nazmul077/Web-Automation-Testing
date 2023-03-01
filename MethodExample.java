package firstjava;

public class MethodExample {

	/*
	 * AccessModifier DataType methodName(){ Body }
	 */

	// Non static Access-> Static, Non Static
	
	int a = 50;
	static String name = "IT";

	public static void staticMethod() {
		System.out.println("This is Static Method");
	}

	public void nonStaticMethod() {
		System.out.println("This is Non Static Method");
	}

	public static void main(String[] args) {

		// Object: ClassName objName = new ClassName();
		MethodExample obj = new MethodExample();
		// Calling
		staticMethod();
		obj.nonStaticMethod();

	}

}
