/**
 * Clase generica de defeinicion de una pila con sus operaciones asociadas.
 * Es un TAD LIFO
 */

/**
 * @author yszee
 *
 */
public abstract class Pila {
	
	
	/**
	 * N�mero de elementos m�ximo que soporta la pila.
	 */
	public final int maxSize = 100;
	
	
	/**
	 * Inserta un entero en la pila
	 * @param x El n�mero a insertar
	 */
	public abstract void push(int x);
	
	
	/**
	 * Extrar un entero de la pila
	 * @return El n�mero extraido.
	 */
	public abstract int pop();
	
	
	/**
	 * Devuelve el n�mero de elementos que hay en la pila
	 * @return El n�mero de elementos en la pila.
	 */
	public abstract int size();
}
