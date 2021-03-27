package entities;

public class Media {
	public String nome;
	public double nota1, nota2, nota3;

	public double calculaMedia() {
		double media = 0;

		if ((nota1 <= 30) && (nota2 <= 35) && (nota3 <= 35)) {
			double aux = (3 * nota1 + 3 * nota2 + 3 * nota3) / 3;

			if (aux >= 60) {
				media += aux;
			} else {
				media += aux;
			}
		}

		return media;
	}

	public String retornaNota(double media) {
		String text = "";
		if (media > 60) {
			text = "PASS -- Final Grade = " + String.format("%.2f", media);
		} else {
			double result = 60 - media;
			text = "FAILED --- Final Grade = " + String.format("%.2f", media) + " --- MISSING "
					+ String.format("%.2f", result) + " POINTS";
		}
		return text;
	}

}
