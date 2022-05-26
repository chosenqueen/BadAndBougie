package day6_contolflow;

public class BathTemperature {

	import java.util.Scanner;

	    public static void main(String[] args) {
	        
	        Scanner bathTemperature = new Scanner(System.in);
	        
	        System.out.println("Enter a temperature");
	        
	        int n = bathTemperature.nextInt();
	        
	        if (bathTemperature < 90) {
	            System.out.println("Brrr!");
	        }
	        
	        if (bathTemperature > 90 && bathTemperature < 95) {
	            System.out.println("That's lukewarm!");
	        }
	        
	        if (bathTemperature >= 95 && bathTemperature <=105) {
	            System.out.println("Perfect!");
	        }
	        
	        if (bathTemperature >=105 && bathTemperature <=110) {
	            System.out.println("This isn't a hot tub!");
	        }
	        
	        if (bathTemperature >= 110) {
	            System.out.println("Are you trying to boil a lobster?");
	        }
	        
	        
	        
	        
	    }

	}

	}

}
