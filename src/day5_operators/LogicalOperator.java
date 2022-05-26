package day5_operators;

public class LogicalOperator {

	public static void main(String[] args) {
		
		
		int a =10;
		int b =5;
		int c =15;
		
		boolean conditiona = a+b == c;
		boolean conditionb = c-b==a;
		
		System.out.println(conditiona && conditionb);
		System.out.println((a+b == c) && (c-b== a));
		
		conditiona = c/b >=3;
		conditionb = a+b>c;
		
		boolean result = conditiona && conditionb;
		System.out.println(result);
		
		String userName = "techcircle";
		String password = "abc123"; 
				
	System.out.println(userName=="techcircle" && password =="abc123");
	
	a= 1;
	b = 2;
	c =3;
	
	conditiona = a+b ==c;
	conditionb = a-b > c;
	
	System.out.println(conditiona || conditionb);
	
	System.out.println(true ||false);
	
	
	
		
				
				
		 
		
		
		
		
				

	}

}
