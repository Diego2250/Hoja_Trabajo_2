/**
 * @author Diego Morales
 */
public class nodo<E> {

	private E valor;
	nodo<E> sig;
	/***
	 * Constructor de clase
	 */
	public nodo() {
		sig = null;
	}

    /**
     * 
     * @param Value
     */
	public nodo(E Value) {
		this.valor = Value;
		sig = null;
	}

    /**
     * 
     * @return valor
     */
	public E getValue() {
		return valor;
	}

    /**
     * 
     * @param value
     */
	public void setValue(E value) {
		valor = value;
	}
	
    /**
     * 
     * @return siguiente
     */
	public nodo<E> getNext() {
		return sig;
	}
	
    /**
     * 
     * @param next
     */
	public void setNext(nodo<E> next) {
		this.sig = next;
	}

}
