package day10_package;

public class MultiplicationTable {

	public static void main(String[] args) {
		//write a program that ask the user to input a positive integer. 
		// it should then print the multiplication table of that number
int num = 5;


for(int i = 1; i < 11; i++) {
	System.out.println(i);
	int total = i * num;
	System.out.println(i + "X" + num + " = " + total);
	
	
}

		
	}

}
