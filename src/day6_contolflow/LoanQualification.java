package day6_contolflow;

public class LoanQualification {

	public static void main(String[] args) {

		double minimumSalary = 35000;
		int jobHistory = 15;
		int creditScore = 650;

		if (minimumSalary >= 30000) {
			if (jobHistory >= 2) {

				if (creditScore >= 680) {
					System.out.println("You are qualified for loan");
				} else {
					System.out.println("You must have at least 680 credit score");
				}
			} else {
				System.out.println("You must be on the job at leasr for 2 years");

			}
		} else {
			System.out.println("You must have a minimum of 30k salary first");
		}

	}

}
