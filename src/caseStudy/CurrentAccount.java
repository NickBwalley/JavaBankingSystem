package caseStudy;

public class CurrentAccount extends BankAccount  //inheritance
{
	private String name;
	private int accNo;
    private final int PIN = 1234; 
	public CurrentAccount() {	//This is a constructor
		System.out.println("This is the Current Account!..");
	}
	public void setName(String name) { //Abstraction/DataHiding
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getAccNo() {	//Abstraction/DataHiding
		return accNo;
	}
	
	
	protected void finalize() {	//This is a de-constructor
		System.out.println("Object is destroyed by the CurrentAccount Class!..\n");
	}
}
