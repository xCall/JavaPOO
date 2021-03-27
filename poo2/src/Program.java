import java.util.Scanner;
import java.util.Locale;
import entity.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();

		char cont = 'n';
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.next();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		System.out.printf("Product data: " + product);

		do {
			System.out.println(" ");
			System.out.print("Enter the number of products to be add in stock: ");
			int quantity = sc.nextInt();
			product.addProducts(quantity);
			System.out.printf("Updated data: %s, $%.2f, %d units, Total: $%.2f%n", product.name, product.price,
					product.quantity, product.totalValueInStock());

			System.out.print("Enter the number of products to be remove in stock: ");
			quantity = sc.nextInt();
			product.removeProducts(quantity);
			System.out.printf("Updated data: %s, $%.2f, %d units, Total: $%.2f%n", product.name, product.price,
					product.quantity, product.totalValueInStock());

			System.out.print("Want to update the data? (S/N): ");

			cont = sc.next().charAt(0);
		} while (cont == 's');
		sc.close();
	}
}
