package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Account account;
		System.out.print("Enter account number:");
		int number = input.nextInt();

		System.out.print("Enter account holder: ");
		input.nextLine();
		String holder = input.nextLine();

		System.out.print("Is there an initial deposit (y/n)");
		char response = input.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initial deposit value: $");
			double initialDeposit = input.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(account.toString());

		System.out.println();
		System.out.print("Enter a deposit value: $");
		double deposit = input.nextDouble();
		account.deposit(deposit);
		System.out.println("Update account data:");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: $");
		double withdraw = input.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Update account data:");
		System.out.println(account.toString());

		input.close();
	}
}
