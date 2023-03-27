
public class ApuracaoNota2Chamada extends ApuracaoNotas {
	private double nota;

	public ApuracaoNota2Chamada(double n1, double n2, double n3, double n) {
		super(n1, n2, n3);
		this.nota = n;
		// Tres notas com segunda chamada
		if (n1 == 0) {
			CalcularMedia(n1,n2, n3, n);
		} else if (n2 == 0) {
			CalcularMedia(n1,n2, n3, n);
		}
		if (n3 == 0) {
			CalcularMedia(n1, n2,n3, n);
		}
		// tres notas sem segunda chamada
		else {
			CalcularMedia(n1, n2, n3, n );
		}
	}

	public ApuracaoNota2Chamada(double n1, double n2, double n) {
		super(n1, n2);
		this.nota = n;
		// Duas notas - Com segunda chamada

		if (n1 == 0) {
			CalcularMedia(n2, n);
		} else if (n2 == 0) {
			CalcularMedia(n1, n);
		}

		// Duas notas - sem segunda chamada

		else {
			CalcularMedia(n1, n2);
		}
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public double CalcularMedia(double n1, double n2, double n3 , double n) {

		return media = (n1 + n2 + n3 + n ) / 3;
	}

	public double CalcularMedia(double n1, double n2 , double n) {

		return media = (n1 + n2 ) / 2;
	}
}