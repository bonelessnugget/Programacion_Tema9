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
	 * Número de elementos máximo que soporta la pila.
	 */
	public final int maxSize = 100;
	
	
	/**
	 * Inserta un entero en la pila
	 * @param x El número a insertar
	 */
	public abstract void push(int x);
	
	
	/**
	 * Extrar un entero de la pila
	 * @return El número extraido.
	 */
	public abstract int pop();
	
	
	/**
	 * Devuelve el número de elementos que hay en la pila
	 * @return El número de elementos en la pila.
	 */
	public abstract int size();
}
