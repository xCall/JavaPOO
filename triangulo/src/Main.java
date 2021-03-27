import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe três valores");
		double a, b, c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		double trianguloRetangulo;
		trianguloRetangulo = (a * c) / 2;

		double circulo;
		circulo = Math.PI * c * c;

		double trapezio;
		trapezio = (a + b) * c / 2;

		double quadrado;
		quadrado = b * b;

		double retangulo;
		retangulo = a * b;

		System.out.printf("Triangulo: %.3f%n", trianguloRetangulo);
		System.out.printf("Circulo: %.3f%n", circulo);
		System.out.printf("Trapezio: %.3f%n", trapezio);
		System.out.printf("Quadrado %.3f%n", quadrado);
		System.out.printf("Retangulo: %.3f%n", retangulo);

		sc.close();
	}
}
