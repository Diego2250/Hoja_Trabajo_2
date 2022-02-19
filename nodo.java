/**
 * @author Diego Morales
 */
public class nodo<E> {

	private E valor;
	nodo<E> sig;
	/***
	 * Constructor que instancia la variable next = null
	 */
	public nodo() {
		sig = null;
	}
	/***
	 * Crea un node e ingresa valor 
	 * @param valor valor para node
	 */
	public nodo(E Value) {
		this.valor = Value;
		sig = null;
	}
	/***
	 * Obtiene el valor de T
	 * @return valor 
	 */
	public E getValue() {
		return valor;
	}
	/***
	 * Modifica el valor de T
	 * @param value 
	 */
	public void setValue(E value) {
		valor = value;
	}
	/***
	 * cambia el valor de node al siguiente 
	 * @return el valor en next
	 */
	public nodo<E> getNext() {
		return sig;
	}
	/***
	 * Modifica el valor de next
	 * @param next
	 */
	public void setNext(nodo<E> next) {
		this.sig = next;
	}

}
