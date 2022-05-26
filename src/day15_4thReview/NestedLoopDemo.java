package day15_4thReview;

public class NestedLoopDemo {

	public static void main(String[] args) {
		// while
		//do while
		//for
		//to access multi-dimension structure int [] [], table.
		
		for (int i = 0; i <10; i++) {
			System.out.println(i + "");
			for (int j = 0; j <10; j++) {
				System.out.print(j + "");
				
				
				
				
				 // to access multi-dimension structure int[][], table.

			      for (int row = 1; row <= 8; row++) { // row
			         for (int column = 0; column < 5; column++) { // column
			            System.out.print(column+" ");
			         }
			         System.out.println();
			      }
			}
		}
	}

}
