package caseStudy;

public class BankAccount {

	public static void main(String[] args) {
		/*************************************************/
		CurrentAccount acc1 = new CurrentAccount();	//instance of an object
		acc1.setName("Jay");
		System.out.println(acc1.getName());
		acc1.finalize(); // this is a deconstructor for the currentAccount class
		/*************************************************/
		SavingsAccount savings = new SavingsAccount(10000, 0.10); //instance of an object
		savings.withdraw(250);
		savings.deposit(400);
		savings.addInterest();
		System.out.println(savings.getBalance());
		savings.finalize(); //this is a deconstructor for the savings account
		/*************************************************/
		//LOANS ACCOUNT
		LoansAccount acc3 = new LoansAccount(); //instance of an object
		acc3.finalize(); //this is a deconstructor for the loans class
		/*************************************************/

	}

}
