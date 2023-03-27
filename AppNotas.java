
public class AppNotas {
	public static void main(String[] args) {

		// Cenario 1: sem segunda chamada		
		System.out.println("\nCenário 1: duas notas sem segunda chamada:");
		ApuracaoNotas apNotas = new ApuracaoNotas(8.5, 9.3);
		System.out.printf("Caso 01: %.1f", apNotas.getMedia());

		
		System.out.println("\n\nCenário 2: três notas sem segunda chamada:");
		apNotas = new ApuracaoNotas(8, 10, 6);
		System.out.printf("Caso 02: %.1f", apNotas.getMedia());

		
		System.out.println("\n\nCenário 3: duas notas com segunda chamada:");
		apNotas = new ApuracaoNota2Chamada(0, 5, 9);
		System.out.printf("Caso 03: %.1f", apNotas.getMedia());

		apNotas = new ApuracaoNota2Chamada(7, 0, 9);
		System.out.printf("\nCaso 04: %.1f", apNotas.getMedia());

		apNotas = new ApuracaoNota2Chamada(0, 0, 9);
		System.out.printf("\nCaso 05: %.1f", apNotas.getMedia());
 
		
		System.out.println("\n\nCenário 4: três notas com segunda chamada:");
		apNotas = new ApuracaoNota2Chamada(0, 8, 9, 7);
		System.out.printf("Caso 06: %.1f", apNotas.getMedia());
		
		apNotas = new ApuracaoNota2Chamada(4, 0, 9, 10);
		System.out.printf("\nCaso 07: %.1f", apNotas.getMedia());

		apNotas = new ApuracaoNota2Chamada(6, 8, 0, 8);
		System.out.printf("\nCaso 08: %.1f", apNotas.getMedia());
		
		apNotas = new ApuracaoNota2Chamada(0, 0, 9, 7);
		System.out.printf("\nCaso 09: %.1f", apNotas.getMedia());

		apNotas = new ApuracaoNota2Chamada(0, 8, 0, 7);
		System.out.printf("\nCaso 10: %.1f", apNotas.getMedia());

		apNotas = new ApuracaoNota2Chamada(8, 0, 0, 7);
		System.out.printf("\nCaso 11: %.1f", apNotas.getMedia());
		
		apNotas = new ApuracaoNota2Chamada(0, 0, 0, 7);
		System.out.printf("\nCaso 12: %.1f", apNotas.getMedia());
	}
}