package entities;

public class Account {

	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public Account() {
	}
	
	public Account(int accountNumber, String accountHolder) {
		
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
 	}
	
	public void depositIntoAccount(double depositValue) {
		
		accountBalance += depositValue;
	}
	
	public void withdrawFromAccount(double withdrawValue) {
		
		accountBalance = accountBalance - withdrawValue - 5.0;
	}
	
	public String toString() {
		
		return "Account "
			 + accountNumber
			 + ", Holder: "
			 + accountHolder
			 + ", Balance: $ "
			 + String.format("%.2f", accountBalance);
	}
}
