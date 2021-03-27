package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Media;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Media media = new Media();
		
		System.out.println("Informe o nome do aluno: ");
		media.nome = input.next();
		System.out.println("Informe as 3 notas dos trimestres: ");
		media.nota1 = input.nextInt();
		media.nota2 = input.nextInt();
		media.nota3 = input.nextInt();
		double aux = media.calculaMedia();
		System.out.println(media.retornaNota(aux));
		
		
		input.close();
	}
}
