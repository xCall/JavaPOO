import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe dois numeros para A e B:");
		double a, b;
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são Multiplos");
		}
		
		sc.close();
	}

}
