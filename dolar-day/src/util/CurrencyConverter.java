package util;

public class CurrencyConverter {
	public static double dolar;
	public static double real;

	public static void dolar(double value) {
		dolar = value;
	}

	public static void real(double value) {
		real = value;
	}

	public static double convert() {
		return (dolar * real) * 1.06;
	}
}
