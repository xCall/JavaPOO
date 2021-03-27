package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Salary;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Salary salary = new Salary();
		
		System.out.println("Name: ");
		salary.name = input.nextLine();
		System.out.print("Gross salary $ ");
		salary.grossSalary = input.nextDouble();
		System.out.print("Tax: $ ");
		salary.tax = input.nextDouble();
		
		System.out.printf("Employee: %s, $%.2f%n", salary.name, salary.netSalary());
		System.out.println("Wich percentage to increase salary? ");
		double increase = input.nextDouble();
		salary.increaseSalary(increase);

		System.out.printf("Update data: %s, $%.2f%n", salary.name, salary.netSalary());
		
		
		input.close();
		
	}

}
