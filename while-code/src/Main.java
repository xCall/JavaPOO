import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		int y = x;
		while (x != 0) {

			x = input.nextInt();
			y += x;

		}
		System.out.println(y);
		input.close();
	}
}
