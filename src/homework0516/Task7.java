package homework0516;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		/* Write a program that can return the factorial number of any given number
	            Ex:
	                input: 5
	                output: 120
	                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
	                	*/
		System.out.println("____________");
		int input =5;
		int result =1;
		for (int i = 4; i >= 1; i--) {
			//System.out.println(i);
			result= result * 1;
			
		}
		System.out.println(result);
		
		
		 System.out.println("--------------------");
	        
	        /*int input = 5;
	        int result =1;
	        
	        for (int i = input ; i >=1; i--) {
//	            System.out.println(i);
	            result = result * i;
	        }
	        
	       System.out.println(result);
	        */
	        
	        
	        Scanner scan = new Scanner(System.in);
	        int faktoriyel = 1;
	       
	        System.out.println("enter you numb: ");
	        int num = scan.nextInt();
	        
	        while(num  > 0) {
	            faktoriyel *= num;
	            num--;
	        } 
	        System.out.println("Faktoriyel = " + faktoriyel);
	        
	        
	        scan.close();
	}

}
