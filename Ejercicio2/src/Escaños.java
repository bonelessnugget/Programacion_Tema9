import java.util.Scanner;

public class Esca�os {
	/*
	 * @param N N�mero de partidos que se presentan;
	 * @param M N�mero de esca�os por partido.
	 */
	private int[] N;
	private int[] M;
	private int[] votos;
	private Scanner teclado = new Scanner(System.in);
	public void datosEntrada() { 
		System.out.println("Cu�ntos partidos se presentan");
		int numPartidos;
		numPartidos = teclado.nextInt();
		N = new int[numPartidos +1];
		for (int i = 1; i<N.length; i++) {
			N[i] = i;
		}
		votos = new int[numPartidos];
		System.out.println("Cu�ntos votos ha conseguido cada partido");
		int partido = 1;
		for (int i = 0; i<numPartidos; i++) {
			System.out.println("Votos partido " + partido);
			votos[i] = teclado.nextInt();
		}
		
		System.out.println("Introduce el n�mero de esca�os");
		int numEsca�os = teclado.nextInt();
		
		
	}
}
