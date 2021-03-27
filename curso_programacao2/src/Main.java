import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		char a;
		String b, c;
		System.out.print("Digite um nome: ");
		x = sc.next();
		System.out.print("Digite a idade: ");
		y = sc.nextInt();
		System.out.print("Digite o seu peso: ");
		z = sc.nextDouble();
		System.out.print("Digite a letra equivalente ao sexo: ");
		a = sc.next().charAt(0);
		System.out.print("Digite o nome do seu pai e sua mae: ");
		sc.nextLine();
		b = sc.nextLine();
		c = sc.nextLine();

		System.out.println("Você digitou o valor: " + x);
		System.out.println("A idade é: " + y);
		System.out.println("O peso é: " + z + "kg");
		if (a == 'f') {
			System.out.println("O sexo é feminino");
		} else if (a == 'm') {
			System.out.println("O sexo é masculino");
		}
		System.out.println("Os nomes são: ");
		System.out.println(b);
		System.out.println(c);

		sc.close();

	}

}
