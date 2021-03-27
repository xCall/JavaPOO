package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = input.nextLine();
		System.out.println("Price: ");
		product.price = input.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = input.nextInt(); 
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		
		
		int quantity = input.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = input.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		
		input.close();
	}
}
