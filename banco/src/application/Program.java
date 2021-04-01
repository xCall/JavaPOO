package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = input.nextInt();
		System.out.print("Enter account holder: ");
		String name = input.next();
		System.out.println();
		System.out.println("Is there an initial deposit (Y/n): ");
		char yesNo = input.next().charAt(0);
		
		double initialDeposit = 0;

		if (yesNo == 'y') {
			System.out.print("Enter initial deposit value: $");
			initialDeposit = input.nextDouble();
		} else {
			System.out.println();
		}
		
		Conta conta = new Conta(name, number);
		
		conta.setName(name);
		conta.addInitialDeposit(initialDeposit);
		
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta.toString());

		System.out.println();
		System.out.print("Enter a deposit value: $");
		double temporaryValue = input.nextDouble();
		conta.addDeposit(temporaryValue);
		
		System.out.println("Update account data: ");
		System.out.println(conta.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: $");
		temporaryValue = input.nextDouble();
		conta.removeDeposit(temporaryValue);
		
		System.out.println("Update account data:");
		System.out.println(conta.toString());
		
		input.close();
	}

}
