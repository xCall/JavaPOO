import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Informe um valor para (X,Y): ");
		double x, y;
		x = input.nextDouble();
		y = input.nextDouble();

		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x == 0) {
			System.out.println("Eixo Y");
		} else if (y == 0) {
			System.out.println("Eixo X");
		} else if (x > 0 && y > 0) {
			System.out.println("Quandrante 1");
		} else if (x < 0 && y > 0) {
			System.out.println("Quadrante 2");
		} else if (x < 0 && y < 0) {
			System.out.println("Quadrante 3");
		} else if (x > 0 && y < 0) {
			System.out.println("Quadrante 4");
		}

		input.close();
	}
}
