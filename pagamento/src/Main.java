import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Informe o código do produto e a quantidade: ");
		int cod, qtd;

		cod = input.nextInt();
		qtd = input.nextInt();

		double total;

		if (cod == 1) {
			total = qtd * 4;
		} else if (cod == 2) {

			total = qtd * 4.5;

		} else if (cod == 3) {

			total = qtd * 5;

		} else if (cod == 4) {

			total = qtd * 2;

		} else if (cod == 5) {

			total = qtd * 1.5;

		} else {

			System.out.println("Não trabalhamos com esse produto");
			total = 0;

		}

		System.out.printf("Total: R$ %.2f%n", total);

		input.close();
	}
}
