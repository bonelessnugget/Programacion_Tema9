
public class Pila {
	private int[] a;
	private int cima;
	private final int tama�o = 100;
	
	public Pila() {
		a = new int[tama�o];
	}
	
	public void push(int n) {
		if (llena()) {
			System.out.println("La pila esta llena.");
		}else {
			a[++cima] = n;
		}
	}
	
	public int pop() {
		if (vacia()) {
			System.out.println("La pila est� vac�a.");
		}
		return a[cima--];
	}
	
	
	public boolean vacia() {
		return cima == -1;
	}
	
	public boolean llena() {
		return cima == tama�o -1;
	}
	
	public int size() {
		return cima + 1;
	}
	
	public void verPila() {
		for (int i = 0; i<a.length; i++) {
			System.out.print(" " + a[i]);
		}
	}
	
}
