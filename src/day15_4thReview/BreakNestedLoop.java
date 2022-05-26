package day15_4thReview;

import java.util.Scanner;

public class BreakNestedLoop {

	public static void main(String[] args) {
		
		
		for (int row = 1; row <= 8; row++) {
			System.out.println(row);
			if (row ==5) break;
			
		}
Scanner sc = new Scanner(System.in);
		while (true) {
	         String input = sc.next();
	         // scanner take input from user
	         if (input.equals("exit")) break;
	         System.out.println(input);
	         System.out.println("======");
	      }
			
		}

	}


