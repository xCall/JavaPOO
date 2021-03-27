import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		System.out.println("Insira a senha: ");
		int senha = 2002;
		int testeSenha = input.nextInt();
		
		while(testeSenha != senha) {
			System.out.println("Senha invalida");
			testeSenha = input.nextInt();
		}
		System.out.println("Acesso Permitido");
		input.close();
	}
}
