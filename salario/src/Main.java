import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o código do funcionário: ");
		int cod;
		double salario, horas, valor;
		cod = sc.nextInt();
		System.out.print("Informe as horas trabalhadas: ");
		horas = sc.nextDouble();
		System.out.print("Informe o valor da hora trabalhada R$:");
		valor = sc.nextDouble();
		salario = horas * valor;
		System.out.printf("Number %d%n", cod);
		System.out.printf("Salary: R$%.2f", salario);
		
		sc.close();
	}
}
