package entities;

public class Media {
	public double n1, n2, n3, media;
	public String response = "";

	public double receiveNote() {

		return media = n1 + n2 + n3;
	}

	public String toString() {
		if (media >= 60) {
			response = "FINAL GRADE = " + String.format("%.2f%n", media) + "PASS";
		} else {
			double lack = 60 - media;
			response = "FINAL GRADE = " + String.format("%.2f%n", media) + "FAILED\n" + "MISSING "
					+ String.format("%.2f", lack) + " POINTS";
		}
		return response;
	}
}
