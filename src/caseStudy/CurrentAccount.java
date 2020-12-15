package caseStudy;
import java.util.Scanner;
public class CurrentAccount extends BankAccount //inheritance
{
	private double balance = 400; //current balance stored in the database. The system computes and updates after user transaction
	//private String name;
	//private int accNo;
    //private final int PIN = 1234; //default PIN  stored in the database can be manipulated by the user
    //private int PIN2;
    private double deposit;
    private double withdraw;
    Scanner input = new Scanner(System.in);

	/*
	 * public void pinChecker() {
	 * 
	 * System.out.println("*******************************");
	 * System.out.println("I-LAB CURRENT ACCOUNT!..");
	 * System.out.println("Enter Account No: "); accNo = input.nextInt(); do {
	 * System.out.println("Enter PIN: "); PIN2 = input.nextInt(); }while(PIN2 !=
	 * PIN); //input.close();
	 * 
	 * }
	 */
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