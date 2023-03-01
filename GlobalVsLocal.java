package firstjava;

public class GlobalVsLocal {
	// Global Variable
	int a = 10;
	int b = 50;

	public void add() {
		// Local Variable
		int x = 20;
		int y = 40;
	}

	public void test() {
		System.out.println(a + b); // global variable
		// System.out.println(x+y); local variable
	}

	public static void main(String[] args) {

	}

}
