package day9_package;

public class ContinueStatement {

	public static void main(String[] args) {
		
		int a =1;
		while (a<11);
		System.out.println(a);
		a++;
		
		while (a <11) {
			if (a==5) {
				continue;
				
			}
			System.out.println(a);
			a++;
		}
	}

	}


