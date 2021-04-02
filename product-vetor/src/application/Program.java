package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		Products[] vect = new Products[n];

		for (int i = 0; i < vect.length; i++) {
			input.nextLine();
			String name = input.nextLine();
			double price = input.nextDouble();
			vect[i] = new Products(name, price);
		}

		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / n;
		System.out.printf("Average price: $%.2f", avg);
		input.close();
	}

}
