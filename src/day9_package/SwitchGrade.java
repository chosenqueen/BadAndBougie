package day9_package;

public class SwitchGrade {

	public static void main(String[] args) {

		char grade = 'A';

		if (grade == 'A') {
			System.out.println("Pass");
		} else if (grade == 'B') {
			System.out.println("Pass");
		} else if (grade == 'C') {
			System.out.println("Pass");
		} else if (grade == 'D') {
			System.out.println("Pass");
		} else if (grade == 'W') {
			System.out.println("Withdraw");
		} else if (grade == 'I') {
			System.out.println("Incomplete");
		} else {
			System.out.println("Failed");
		}

		switch (grade) {
		case 'A':
			System.out.println("Pass");
		case 'B':
			System.out.println("Pass");
		case 'C':
			System.out.println("Pass");
		case 'D':

			System.out.println("Pass");
			break;
		case 'W':
			System.out.println("Withdraw");
		case 'I':
			System.out.println("Incomplete");
			break;
		default:
			System.out.println("Failed");

		}

	}

}