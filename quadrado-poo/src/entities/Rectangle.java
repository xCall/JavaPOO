package entities;

public class Rectangle {
	public double widht;
	public double height;

	public double area() {
		double area;
		return area = widht * height;
	}

	public double perimeter() {
		double perimetro;
		return perimetro = widht + widht + height + height;
	}

	public double diagonal() {
		double diagonal;
		return diagonal = Math.sqrt((height * height)+(widht * widht));
	}
}
