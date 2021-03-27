import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int soma = 0;

		for (int i = 0; i < n; i++) {
			int valor = input.nextInt();
			soma += valor;
		}
		
		System.out.println("Soma: " + soma);

		input.close();
	}
}
