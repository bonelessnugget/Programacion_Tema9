
public class Main {

	public static void main(String[] args) {
		Pila pila = new Pila();
		pila.push(30);
		pila.push(20);
		pila.push(1);
		pila.pop();
		System.out.println("Tama�o: " + pila.size());
		pila.verPila();
	}

}
