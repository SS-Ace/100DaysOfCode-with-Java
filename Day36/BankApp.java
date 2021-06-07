package bank;

public class BankApp {

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount(100.00);
		
		System.out.println("Before transactions: ");
		b1.display();
		
		b1.deposit(74.35);
		b1.withdraw(20.00);
		
		System.out.println("After transaction: ");
		b1.display();
	}

}
