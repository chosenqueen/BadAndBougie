package homework_0513;

import java.util.Scanner;

public class Solution_C {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int a = scanner.nextInt();
		
// no semicolon for if statement
//		if (numA >= -10 && numA < 11) {
//
//			System.out.println("true");
//		}
//		else {
//			System.out.println("False");
//		}

		scanner.close();

		

		boolean check = (a > -11 && a <11);
		System.out.println(check);
		
	}

}
