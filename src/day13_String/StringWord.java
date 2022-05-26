package day13_String;

public class StringWord {

	public static void main(String[] args) {

		
		String str1 = "Hello";
		String str2 = "hello";
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		if (str1.equals(str2)) {
			System.out.println("They are equal");
		}else {
			System.out.println("not equal");
		}
		
boolean result = str1.equals(str2);
System.out.println(result);

	}

}
