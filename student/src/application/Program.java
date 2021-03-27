package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Media;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Media media = new Media();
		
		
		System.out.println("Informe seu nome e a nota de cada trimestre: ");
		String name = input.nextLine();
		
		media.n1 = input.nextDouble();
		media.n2 = input.nextDouble();
		media.n3 = input.nextDouble();
		
		media.receiveNote();
	
		System.out.println(media.toString());
		
	
		input.close();
	}

}
