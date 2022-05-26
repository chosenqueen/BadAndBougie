package homework_0513;

import java.util.Scanner;

public class SolutionB {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String str;
		int numA;
		int numB;
		// line is for string, int is for numbers
		System.out.println("Please enter greeting");
		str = scanner.nextLine();

		System.out.println("Please enter first number");
		numA = scanner.nextInt();
		System.out.println("Please enter second number");
		numB = scanner.nextInt();

		int total = numA + numB;
		System.out.println("My greeting is " + str);
		System.out.println("The sum of " + numA + " and " + numB + " is " + total);

	}

}
