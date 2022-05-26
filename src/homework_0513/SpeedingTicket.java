package homework_0513;

import java.util.Scanner;

public class SpeedingTicket {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
		String ln = "";
		String fn = "";
		int age = 0;
		int speedLimit = 0;
		int actualSpeed = 0;
		int fine = 0;
		System.out.println("Is this a construction zone (Y/N)?");
		char construction = sc.next().charAt(0);
		//System.out.println(isConstructionZone);
		
		boolean isConstructionZone = true;
		
		//int overSpeedLimit = actualSpeed - speedLimit;
		int overSpeedLimit = 15;
		 if (overSpeedLimit > 5 && overSpeedLimit <= 20) {
			 fine = (overSpeedLimit/5)*30; //every 5mph over, charge 30 each
			 
		 }else if (overSpeedLimit > 20) { //over SpeedLimit greater 20mph
			 fine = (overSpeedLimit/5)*50; //every 5mph over, charge 50 each
		 }
		 if (isConstructionZone) fine = fine *2;
		 if (age <21 && overSpeedLimit > 20) fine= fine + 300;
		 
			System.out.println(fine);
			
}
}