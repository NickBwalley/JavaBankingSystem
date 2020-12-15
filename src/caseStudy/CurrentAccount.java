package caseStudy;
import java.util.Scanner;
public class CurrentAccount extends BankAccount //inheritance
{
	private double balance = 400; //current balance stored in the database. The system computes and updates after user transaction
    private double deposit;
    private double withdraw;
    Scanner input = new Scanner(System.in);

	public CurrentAccount() // this is a constructor
	{
		//balance = 0;
	}

	public CurrentAccount(double initialBalance)
	{
		balance = initialBalance;
	}	

	public void deposit()
	{
		System.out.println("How much money do you want to deposit: ");
		deposit = input.nextDouble();
		balance = balance + deposit;
		System.out.printf("Current Balance: " + balance );
		System.out.println();
	}

	public void withdraw()
	{
		System.out.println("How much money do you want to withdraw");
		withdraw = input.nextDouble();
		balance = balance-withdraw;
		System.out.printf("Current Balance: " +  balance);
		System.out.println();
	}

	/*
	 * public double getBalance() { return balance; }
	 */
	
	protected void finalize()
	{	//This is a de-constructor
		System.out.println("Object is destroyed by the CurrentAccount Class!..\n");
	}

}

/*VERY IMPORTANT DEFINITIONS!..
 * Polymorphism: The ability of a message to be displayed in more than one form.
 * Encapsulation: Java mechanism of wrapping data (variables) and code acting on the data (methods) together as a single unit.
 * Abstraction: This is the process of hiding the implementation details from the user, only the functionality will be provided to the user
 * Inheritance: This is the mechanism in which one class acquires the property of another class. 
 * Overloading: Occurs when two or more methods in one class have the same methods name but different parameters.
 * Overriding: Occurs when two methods have the same method name and parameters.*/
 */