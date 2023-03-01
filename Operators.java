package firstjava;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 1st Number: ");
		int num1 = input.nextInt();
		System.out.println();
		System.out.print("Enter 2nd Number: ");
		int num2 = input.nextInt();
		System.out.println();

		int sum = num1 + num2;
		int mul = num1 * num2;

		System.out.println("SUM: " + sum);
		System.out.println("MUL: " + mul);

	}

}
