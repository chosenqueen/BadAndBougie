package day6_contolflow;

public class Alcoholage {

	public static void main(String[] args) {
		
		String name = "James";
		int age = 19;
		String message = name + "is eligible to buy alochol?";
		boolean isEligible = age >=21;
		
		
		System.out.println(message);
		System.out.println(isEligible);
		
		if (age>=21) {
			System.out.print(name+ "is eligible to buy alcohol");
			System.out.println(true);
			
		}else {
			System.out.println(name + "is eligible to buy alcohol");
			System.out.println(false);
		}
		
		
				

	}

}
