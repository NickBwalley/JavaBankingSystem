package caseStudy;
import java.util.Scanner;
public class SavingsAccount extends BankAccount //inheritance
{
	private double balance;
	private double interest;
	
	public SavingsAccount() // this is a constructor
	{
		balance = 0;
		interest = 0;	
	}

	public SavingsAccount(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		interest = initialInterest;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public double getBalance()
	{
		return balance;
	}
	
	protected void finalize()	//This is a de-constructor
	{	
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
