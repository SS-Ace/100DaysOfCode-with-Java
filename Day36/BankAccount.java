package bank;

public class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
        //balance = openingbalance;
	}
	
	public void deposit(double amount) {
		this.balance = balance + amount;
		//balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		this.balance = balance - amount;
		//balance = balance - amount;
		
	}
	
	public void display() {
		System.out.println("Current balance: "+this.balance);
	}
}
