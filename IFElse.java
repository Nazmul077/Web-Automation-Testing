package firstjava;

import java.util.Scanner;

public class IFElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 1st Number: ");
		int num1 = input.nextInt();
		System.out.print("Enter 2nd Number: ");
		int num2 = input.nextInt();
		
		
		if (num1>num2) {
			System.out.println(num1+" is gratter than "+num2);
		}else if (num1 == num2) {
			System.out.println(num1+" is equal " +num2);
		}else if (num1<num2) {
			System.out.println(num1+" is less than "+num2);
		}
		else {
			System.out.println("Condition not match");
		}

	}

}
