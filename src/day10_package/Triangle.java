package day10_package;

public class Triangle {

	public static void main(String[] args) {
		
		 final int VALID_TRIANGLE = 180;
	        int angleA = 60, angleB = 60, angleC = 60;
	        int sum = angleA + angleB + angleC;

	        if (sum == VALID_TRIANGLE) {
	            System.out.println("Valid Triagle!");
	        } else {
	            System.out.println("Not Valid Triangle");
	        }

	}

}
