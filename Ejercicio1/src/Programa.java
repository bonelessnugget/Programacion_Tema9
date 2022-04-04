import java.util.Random;

/**
 * Conductor para comprobar el funcionamiento del TAD Pila.
 */

/**
 * @author yszee
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Número de elementos a usar.
		final int maxOperaciones = 150;
		Pila p = new PilaVector();
		Random r = new Random(123456);
		
		for (int i = 0; i<maxOperaciones; i++) {
			int x = r.nextInt();
			boolean meter = r.nextBoolean();
			System.out.println("Operación " + i + ": " + (meter ? "meter" : "sacar"));
			if (meter || i < 20) {
				p.push(x);
			}else {
				p.pop();
			}
		}
		
//		for (; p.size()>0;) {
		while (p.size()>0) {
			int x = p.pop();
			System.out.print(x + " ");
		}
		System.out.println();
	}

}
