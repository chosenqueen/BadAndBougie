package day8_control_flow;

import java.util.Scanner;

public class CalculatorHomeworkScanner {

	public static void main(String[] args) {
		
		Scanner cal = new Scanner(System.in);
		double numA, numB, answer, answer1, answer2, answer3;
		System.out.println("enter first number");
		numA = cal.nextDouble();
		System.out.println("enter second number");
		numB = cal.nextDouble();
		
		answer = numA + numB; //print answer for addition
		answer1 = numA - numB; //print answer1 for subtraction
		answer2 = numA * numB; //print answer2 for multiplication
		answer3 = numA / numB; //print answer3 for multiplication

		System.out.println(answer3);
		
		
	}

}
