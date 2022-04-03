import java.util.Scanner;

public class Escaños {
	/*
	 * @param N Número de partidos que se presentan;
	 * @param M Número de escaños por partido.
	 */
	private int[] N;
	private int[] M;
	private int[] votos;
	private Scanner teclado = new Scanner(System.in);
	public void datosEntrada() { 
		System.out.println("Cuántos partidos se presentan");
		int numPartidos;
		numPartidos = teclado.nextInt();
		N = new int[numPartidos +1];
		for (int i = 1; i<N.length; i++) {
			N[i] = i;
		}
		votos = new int[numPartidos];
		System.out.println("Cuántos votos ha conseguido cada partido");
		int partido = 1;
		for (int i = 0; i<numPartidos; i++) {
			System.out.println("Votos partido " + partido);
			votos[i] = teclado.nextInt();
		}
		
		System.out.println("Introduce el número de escaños");
		int numEscaños = teclado.nextInt();
		
		
	}
}
