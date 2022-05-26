package homework_0513;

import java.util.Scanner;

public class Solution_A {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numA = scanner.nextInt();
		int numB = scanner.nextInt();
		int numC = scanner.nextInt();

		if (numA > numB && numA > numC && numB > numC) {

			System.out.println("true");

		} else {
			System.out.println("false");

		}

		scanner.close();
	}

}
