package day12_NestedLoop;

import java.util.Scanner;

public class TimerNextLevel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("How long do you want to wait for?");
		
		int waitTime = 2;
		
		System.out.println( waitTime+" timer start!");
				for (int i = waitTime-1; i >=0 ; i--) {
					
					for (int j = 59 ; j >=0; j--) {
						System.out.println(i +":"+j);
					}
					
				}
				
				System.err.println("Time's UP!!!");
				
				

	}

}
