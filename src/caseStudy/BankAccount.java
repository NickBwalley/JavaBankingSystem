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
	//Data Abstraction
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


/*VERY IMPORTANT DEFINITIONS!..
 * Polymorphism: The ability of a message to be displayed in more than one form.
 * Encapsulation: Java mechanism of wrapping data (variables) and code acting on the data (methods) together as a single unit.
 * Abstraction: This is the process of hiding the implementation details from the user, only the functionality will be provided to the user
 * Inheritance: This is the mechanism in which one class acquires the property of another class. 
 * Overloading: Occurs when two or more methods in one class have the same methods name but different parameters.
 * Overriding: Occurs when two methods have the same method name and parameters.*/
