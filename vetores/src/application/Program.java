package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = input.nextDouble();

			System.out.println(vect[i]);
		}
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.printf("Average heigth: %.2f", avg);
		input.close();
	}
}
