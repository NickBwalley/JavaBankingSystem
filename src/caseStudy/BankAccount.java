package caseStudy;

public class BankAccount {

	public static void main(String[] args) {
		CurrentAccount acc1 = new CurrentAccount();	//instance of an object
		acc1.finalize();
		SavingsAccount acc2 = new SavingsAccount(); //instance of an object
		acc2.finalize();
		LoansAccount acc3 = new LoansAccount(); //instance of an object
		acc3.finalize();

	}

}
