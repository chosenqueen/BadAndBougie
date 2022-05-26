package day15_4thReview;

public class ContinueStatement {

	public static void main(String[] args) {
		// Continue, takes java back to the beginning of the loop
		
		int n =10;
		for (int i = 0; i <n; i++) {
			if (i % 2 != 0) {
				continue; //go back to line 8, (not execute line 11)
			}
			System.out.print(i + " ");
			
			 //OR
		}
		for (int i = 0; i <n; i++) {
			if (i % 2 ==0) { // check even number
				System.out.print(i + " ");
			}
		}

	}

}
