package homework0516;



public class Task4 {

	public static void main(String[] args) {
		
		  double salary= 66000;
		  double SalaryAfterTax = 0;
		  boolean married = false;
		  int taxRate =0;
		  
		  if (salary >= 130000) {
			  SalaryAfterTax=salary-(salary*0.35);
			  
		  }else if (salary >= 100000 && salary < 130000) {
			  SalaryAfterTax = salary-(salary * 0.30);
		  }else if (salary >= 80000 && salary <100000) {
			  SalaryAfterTax= salary-(salary*0.25);
			  
		  }else if (salary <80000) {
			  SalaryAfterTax= salary-(salary*0.20);
		  }
		  if(married){
			  SalaryAfterTax+=(salary*0.05);
			  
		  }else {
		  
		  }		  
				  
		System.out.println("Your salary after tax is $" +SalaryAfterTax);	

	}

}
