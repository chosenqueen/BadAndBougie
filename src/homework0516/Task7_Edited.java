package homework0516;

import java.util.Scanner;

public class Task7_Edited {

	public static void main(String[] args) {
		
System.out.println("--------------------");
        
        int input = 5;
        int result =1;
        
        for (int i = input ; i >=1; i--) {
//            System.out.println(i);
            result = result * i;
        }
        
        System.out.println(result);
        
        
        
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
