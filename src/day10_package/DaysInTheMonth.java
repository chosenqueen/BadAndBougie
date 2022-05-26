package day10_package;

public class DaysInTheMonth {

	public static void main(String[] args) {
		//write a program that can find the number of days in a month.
		int month = 1;
        int days;
        
        switch(month) {
        case 1: 
            
        case 3:
        
        case 5:
        
        case 7:
        
        case 8:
            
        case 10:
        
        case 12:
            days = 31;
            System.out.printf("The number of days in this month is %d", days);
            break;
        case 4:
        
        case 6:
        
        case 9:
        
        case 11:
            days = 30;
            System.out.printf("The number of days in this month is %d", days);
            break;
        case 2:
            days = 28;
            System.out.printf("The number of days in this month is %d", days);
            break;
        
        default:
            System.out.println("Invalid Input");
        }
        

	}

}
