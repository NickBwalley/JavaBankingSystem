package caseStudy;

public class SavingsAccount {
	public SavingsAccount() {
		System.out.println("This is the Savings Account!..");
	}
	
	protected void finalize() {	//This is a de-constructor
		System.out.println("Object is destroyed by the CurrentAccount Class!..\n");
	}
}
