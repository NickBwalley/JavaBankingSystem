package caseStudy;
import java.util.Scanner;
public class SavingsAccount extends BankAccount //inheritance
{
	private double balance;
	private double interest;
	//private String name;
	//private int accNo;
    //private final int PIN = 1234; 
    //private int PIN2;
	/*
	 * public void pinChecker() { Scanner input = new Scanner(System.in);
	 * System.out.println("******************************");
	 * System.out.println("I-LAB SAVINGS ACCOUNT!..");
	 * System.out.println("Enter Account No: "); accNo = input.nextInt(); do {
	 * System.out.println("Enter PIN: "); PIN2 = input.nextInt(); }while(PIN2 !=
	 * PIN);
	 * 
	 * }
	 */
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
	
	protected void finalize()
	{	//This is a de-constructor
		System.out.println("Object is destroyed by the CurrentAccount Class!..\n");
	}

}