package caseStudy;

public class CurrentAccount {
	public CurrentAccount() {	//This is a constructor
		System.out.println("This is the Current Account!..");
	}
	protected void finalize() {	//This is a de-constructor
		System.out.println("Object is destroyed by the CurrentAccount Class!..\n");
	}
}
