import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor do raio de um círculo");
		double raio, area;
		raio = sc.nextDouble();
		area = Math.PI * Math.pow(raio, 2);

		System.out.printf("O valor da área do cículo é: %.4f", area);
		sc.close();

	}
}
