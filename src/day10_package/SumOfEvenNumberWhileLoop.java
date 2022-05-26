package day10_package;

public class SumOfEvenNumberWhileLoop {

	public static void main(String[] args) {
		
		int total = 0;
		int  count = 1;
		while (count <101) {
			if (count % 2 ==0)
			{
				total+= count;
				
			}
			count++;
		}
System.out.println(total);
	}

}
