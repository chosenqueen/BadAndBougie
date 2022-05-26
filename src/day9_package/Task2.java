package day9_package;

public class Task2 {

	public static void main(String[] args) {
		// write a program to calculate the sum of all the number between 1 to 100
		int x = 1;
        int y = 100;
        int sum = 0;

        while (x <= y) {
            x++;
            sum+=x;
        }
        System.out.println(sum);
        // for statement
        int sum = 0;
        for (int i = 1; i <101 ; i++) {
        	System.out.println(i);
        	sum = sum + i;
        	
        	
        }
System.out.println("Sum=" + sum);

	}

}
