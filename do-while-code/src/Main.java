import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		char resp;
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double C = input.nextDouble();
			double F = 9 * C / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.println("Deseja repetir (S/N)?: ");
			resp = input.next().charAt(0);
		} while (resp != 'n');

		input.close();
	}
}
