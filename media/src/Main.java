import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		double v1 = 0;
		double v2 = 0;
		double v3 = 0;

		for (int i = 0; i < n; i++) {
			v1 = input.nextDouble();
			v2 = input.nextDouble();
			v3 = input.nextDouble();

			double media = (v1 * 2 + v2 * 3 + v3 * 5) / 10;
			System.out.printf("%.2f%n", media);

		}

		input.close();
	}
}
