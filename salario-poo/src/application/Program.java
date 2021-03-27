package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Salario salario = new Salario();
		int percentage;
		System.out.print("Name: ");
		salario.name = input.next();
		System.out.print("Gross Salary: R$");
		salario.grossSalary = input.nextDouble();
		System.out.print("Taxa: R$");
		salario.taxa = input.nextDouble();
		System.out.println();
		System.out.printf("Employee: %s, R$%.2f%n", salario.name, salario.netSalary());
		System.out.println("Which percentage to increase salary? ");
		percentage = input.nextInt();
		salario.increaseSalary(percentage);
		System.out.println();
		System.out.printf("Updated data: %s, R$%.2f%n", salario.name, salario.netSalary());
		input.close();
	}
}
