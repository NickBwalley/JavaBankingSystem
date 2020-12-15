package caseStudy;

public class LoansAccount extends BankAccount {
	public LoansAccount() {
		System.out.println("This is the LoansAccount!..");
	}
	
	protected void finalize() {	//This is a de-constructor
		System.out.println("Object is destroyed by the CurrentAccount Class!..\n");
	}
}
