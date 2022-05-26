package homework_0521;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Base");
		int base = scan.nextInt();
		System.out.println("Enter Exponent");
		int exponent = scan.nextInt();
		
		long result =1;
		while (exponent != 0) {
			result = result * base;
			--exponent;
		}
		System.out.println("The Result is" +result);
		
		scan.close();
		

	}

}
