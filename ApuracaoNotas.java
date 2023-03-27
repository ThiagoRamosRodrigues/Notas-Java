public class ApuracaoNotas {

	private double nota1;
	private double nota2;
	private double nota3;
	protected double media;

	public ApuracaoNotas(double n1, double n2, double n3) {
		super();
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;
		this.media = CalcularMedia(nota1, nota2, nota3);

	}

	public ApuracaoNotas(double n1, double n2) {
		super();
		this.nota1 = n1;
		this.nota2 = n2;
		this.media = CalcularMedia(n1, n2);
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double n1) {
		this.nota1= n1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double n2) {
		this.nota2 = n2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double n3) {
		this.nota3 = n3;
	}

	public double getMedia() {
		return media;
	}

	public double CalcularMedia(double n1, double n2, double n3) {

		this.media = (n1 + n2 + n3) / 3;
		return media;

	}

	public double CalcularMedia(double n1, double n2) {

		this.media = (n1 + n2 ) / 2;
		return media;

	}
}