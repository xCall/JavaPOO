import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Votação");
		int cod = input.nextInt();
		int gasolina, alcool, diesel;
		gasolina = 0;
		alcool = 0;
		diesel = 0;

		while (cod != 4) {
			if (cod == 1) {
				alcool += 1;
			} else if (cod == 2) {
				gasolina += 1;
			} else if (cod ==3) {
				diesel += 1;
			} else if(cod >4) {
				System.out.println("Informe um número de um a 4 para votar");
			}
			cod = input.nextInt();
		}
		System.out.println("Muito obrigado!!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		input.close();
	}
}
