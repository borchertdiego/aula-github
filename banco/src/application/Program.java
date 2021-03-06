package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double depositValue, withdrawValue;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char hasDeposit = sc.next().charAt(0);
			
		Account account = new Account(accountNumber, accountHolder);
		
		if (hasDeposit == 'y') {
			
			System.out.print("Enter initial deposit value: ");
			depositValue = sc.nextDouble();
			
			account.depositIntoAccount(depositValue);
		}
		
		System.out.println("\nAccount data:\n" + account);
		
		System.out.print("\nEnter a deposit value: ");
		depositValue = sc.nextDouble();
		account.depositIntoAccount(depositValue);
		
		System.out.println("Upate account data:\n" + account);

		System.out.print("\nEnter a withdraw value: ");
		withdrawValue = sc.nextDouble();
		account.withdrawFromAccount(withdrawValue);

		System.out.print("Upate account data:\n" + account);
		
		System.out.println("Testando git");
		
		sc.close();
	}
}
