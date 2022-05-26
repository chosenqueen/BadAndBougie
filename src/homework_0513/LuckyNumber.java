package homework_0513;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);


		System.out.println("Please enter 4 digit number");
		int a= scanner.nextInt();
		int b= scanner.nextInt();
		int c=scanner.nextInt();
		int d=scanner.nextInt();
		
		boolean isLuckyNo = a + b ==c + d;
		
		scanner.close();
		
		if(isLuckyNo) {
			System.out.println("Yay %d%d%%d%d is a lucky number!, a,b,c,d");
			
			
		}else {
			System.out.println("Nah %d %d %d %d is not a lucky number!, a,b,c,d");
		}
		
		
		

		

	}

}
