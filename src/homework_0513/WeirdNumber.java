package homework_0513;

public class WeirdNumber {

	public static void main(String[] args) {
		//given integer 'n'
		int n = 99;
		//if n is odd
		if (n % 2 !=0) {
			System.out.println("Weird");
			
		}else {
		//if n is even and in the inclusive range of 2 to 5, print not weird
		//2 3 4 5
		if (n >= 2 && n <= 5) {
			System.out.println("Not Weird");
			
		}
		if (n >= 6 && n<= 20) {
			System.out.println("Weird");
			
		}
         if (n>20) {
        	 System.out.println("Not Weird");
        	 
         }
	}
	}
}
