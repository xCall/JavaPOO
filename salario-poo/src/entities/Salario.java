package entities;

public class Salario {

	public String name;
	public double grossSalary;
	public double taxa;

	public double netSalary() {
		return grossSalary - taxa;
	}

	public void increaseSalary(double porcentage) {
		this.grossSalary += (this.grossSalary * porcentage) / 100;
	}
}
