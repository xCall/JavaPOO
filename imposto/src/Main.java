import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.print("Informe o salario para o calculo de imposto de renda: R$ ");
		double salario, imposto;
		imposto = 0;
		salario = input.nextDouble();
		if (salario <= 2000) {
			imposto = 0;
		} else if (salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
		} else if (salario <= 4500) {
			imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
		} else if (salario > 4500) {
			imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}
		if (imposto == 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		}

		input.close();
	}
}
