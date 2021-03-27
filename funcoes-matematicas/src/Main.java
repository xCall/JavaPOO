import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a, b, soma;

		System.out.println("Informe os números para ser calculado: ");
		a = sc.nextInt();
		b = sc.nextInt();

		soma = a + b;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();

	}
}
