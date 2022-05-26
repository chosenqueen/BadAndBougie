package day6_contolflow;

import java.util.Scanner;

public class OmittingElsePart {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		
		int a = 4;

		if (a % 2 == 1) {
			System.out.println(a + " is odd number");

		}
		if (a % 2 == 0) {
			System.out.println(a + " is even number");

		}

		System.out.println("Line #24");

		int n1 = 300;
		int n2 = 4;

		if (n1 > n2) {
			System.out.println("Max number is " + n1);
			System.out.println("Min number is " + n2);

		}
		if (n1 < n2) {
			System.out.println("Max number is +n2");
			System.out.println("Min number is " + n1);

		}

		if (n1 == n2) {
			System.out.println("They are equal");
			
			
			System.out.println("Enter your bath temperature");
			
			int bathTemperature = scan.nextInt(); 
		}

		int temp =110;
	
	if (temp <90) {
		System.out.println("Brrr!"); 
	}
	
	if (temp < 90 && temp < 95) {
		System.out.println("That's lukewarm.");
	}
	
	if (temp >= 95 && temp <= 105) {
		System.out.println("Perfect");
	}
		if (temp>= 105 && temp <= 110) {
			System.out.println("This isn't a hot tub");
		}
	if (temp > 110) {
		System.out.println("Are you trying to boil a lobster?");
	}
	
	scan.close();
	
	}
}

