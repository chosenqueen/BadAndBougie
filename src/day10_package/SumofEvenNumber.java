package day10_package;

public class SumofEvenNumber {

	public static void main(String[] args) {
	
		//write a java program to print sum of even number 1 to 100
		
		int sum = 0;
 for (int i = 1; i <= 100; i++) {
	 if (i % 2 ==0) {
		 System.out.println(i);
		 sum = sum + i;
		 
	 }
 }
 System.out.println(sum);
 // for odd number- change the if statement 0 to 1
		 
	}

}
