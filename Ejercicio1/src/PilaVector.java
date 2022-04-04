/**
 * 
 */

/**
 * @author yszee
 *
 */
public class PilaVector extends Pila {
	//Vector que almacena la pila.
	private int[] pila = new int[maxSize]; 
	//Última posicion usada en el vector: cantidad de elementos en la pila.
	private int cima = 0;
	@Override
	public void push(int x) {
		//Si la pila no está llena
		if (cima < maxSize ) {
			pila[cima++] = x;
		}else {
			throw new IndexOutOfBoundsException("Pila llena");
		}
	}

	@Override
	public int pop() {
		//Si la pila no está vacía
		if (cima > 0) {
			return pila[--cima];
		}
		throw new IndexOutOfBoundsException("Pila vacia.");
		//return 0;
		
	}

	@Override
	public int size() {
		
		return cima;
	}

}
