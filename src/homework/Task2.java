package homework;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner Age = new Scanner (System.in);
	 
		
		System.out.println ("Please enter your age");
		int t = Age.nextInt();
		
		if (t <=2 && t>=1) 
		{System.out.println("Infancy");
		
		}	
			int c =Age.nextInt();
			
		
		if (c<=4 && c>2) {
			System.out.println("Toddler");
		}
           int d =Age.nextInt();
           if (d<=7 && d>=5) {
        	   System.out.println("Early school age");
        	   
           }
           int e =Age.nextInt();
           if (e <=12 && e>=8) {
        	   System.out.println("Middle school age");
        	   
        	   
           }
           int f =Age.nextInt();
           if (f<=17 && f>=13) {
        	   System.out.println("Early Adolescence");
        	   
           }
           int g= Age.nextInt();
           if (g<=25 && g>=18) {
        	   System.out.println("Later Adolescence");
           }
           int h=Age.nextInt();
           if (h<=30 && h>=25) {
        	   System.out.println("Early Adulthood");
           }
        	   int i=Age.nextInt();
        	   if (i <=50 && i>=30) {
        		   System.out.println("Middle Adulthood");
        		  
        	   }
        	   int j=Age.nextInt();
        	   if(j>=50) {
        		   System.out.println("Later Adulthood");
        	   }
	}

}
