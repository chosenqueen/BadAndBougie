package day14_StringReview;

public class ReverseOrder {

	public static void main(String[] args) {
		
		String word = "Jesus";
		
		if (word.length()==5) {
			//THE CODE BELOW WORKS
			
	//		System.out.print(word.charAt(4));
		//	System.out.print(word.charAt(3));
		//	System.out.print(word.charAt(2));
		//	System.out.print(word.charAt(1));
		//	System.out.print(word.charAt(0));
			
			
			for (int i = word.length()-1; i >=0 ; i--) {
//              System.out.println(i);
              System.out.print(word.charAt(i));
          
			}
		
		}else if (word.length() >5 ) {
		 System.out.println("TooLong!");
		 
		 }else
			 
			 if (word.length() <5) {
				 System.out.println("Too Short!");
			 }
		 
		 
		 
		 
		 
		 
		 

	}

}
