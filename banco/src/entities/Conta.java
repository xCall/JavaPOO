package entities;

public class Conta {
	private String name;
	private int number;

	private double total;

	public Conta(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void addInitialDeposit(double initialDeposit) {
		total += initialDeposit;
	}

	public void addDeposit(double deposit) {
		total += deposit;
	}

	public void removeDeposit(double withdraw) {
		total -= withdraw;
		total -= 5;
	}

	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance: $" + String.format("%.2f", total);
	}

}
