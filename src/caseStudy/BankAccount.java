package caseStudy;
import java.util.Scanner;

//ABSTRACTION
abstract class pinChecker{
	Scanner input = new Scanner(System.in);
	private final int PIN = 1234;
	private int accNo;
	private int PIN2;
	
	public void pinChecker() {    	
    	System.out.println("*******************************");
    	System.out.println("I-LAB CURRENT ACCOUNT!..");
		System.out.println("Enter Account No: ");
		accNo = input.nextInt();
		do {
		System.out.println("Enter PIN: ");
		PIN2 = input.nextInt();
		}while(PIN2 != PIN);	
    }
	
}
class Verification extends pinChecker{
	
}
public class BankAccount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*************************************************/
		Verification v = new Verification();
		v.pinChecker();
		CurrentAccount current = new CurrentAccount();	//instance of an object
		current.deposit();
		current.withdraw();
		//current.getBalance();
		current.finalize(); // this is a deconstructor for the currentAccount class	
		/*************************************************/
	/*	SavingsAccount savings = new SavingsAccount(10000, 0.10); //instance of an object
		savings.pinChecker(); //PIN VERIFICATION METHOD
		savings.withdraw(250);
		savings.deposit(400);
		savings.addInterest();
		System.out.println(savings.getBalance());
		savings.finalize(); //this is a deconstructor for the savings account		*/
		/*************************************************/
		//LOANS ACCOUNT
	/*	LoansAccount acc3 = new LoansAccount(); //instance of an object
		acc3.finalize(); //this is a deconstructor for the loans class		*/
		/*************************************************/
	}

}
