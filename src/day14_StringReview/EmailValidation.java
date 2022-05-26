package day14_StringReview;


public class EmailValidation {

	public static void main(String[] args) {
		
		String email = "help@techcircle.com";
        boolean atIndexBigger = email.indexOf("@") > 0;
        boolean dotIndexBigger = email.indexOf("@") < email.indexOf(".com");
        
        if (atIndexBigger && dotIndexBigger) {
            System.out.println(true);
        } else {
            System.out.println(false);
		
		
	

	}

}
}
