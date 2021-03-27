package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the dollar price? U$");
		double priceDolar = input.nextDouble();
		
		CurrencyConverter.dolar(priceDolar);
		
		System.out.print("How many dollars will be bought? R$");
		double value =  input.nextDouble();
		
		CurrencyConverter.real(value);
		
		System.out.printf("Amount to be paid  in reais = %.2f", CurrencyConverter.convert());
		
		input.close();
		
	}

}
