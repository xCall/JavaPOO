import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		System.out.println("Informe os minutos: ");
		int minutos = input.nextInt();
		double conta = 50;
		
		if (minutos > 100) {
			conta = conta + (minutos - 100) * 2;
		}
		System.out.printf("O valor da conta é: R$%.2f%n", conta);
		input.close();
		
	}
}
