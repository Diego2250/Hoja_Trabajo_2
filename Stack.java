/**
 * @author MDiego Morales
 *
 */
public class Stack<E> implements IStack<E> {
	
	private nodo<E> top;
	private int size;
	public E tempo;
	
	public Stack() {
		top = null;
	}
	
	/***
	 * Hace un push de un valor dentro de un node
	 */
	public void push(E value) {
		nodo<E> newNode = new nodo<E>(value);
		
		if (empty()) {
			top = newNode;
		} else {
			newNode.setNext(top);
			top = newNode;
		}
		size++;
	}

	/***
	 * Hace un pull quitando un valor de la pila 
	 * @return el valor que fue retirado
	 */
	public E pull() {
		
		if (size() == 0) {
			return null;
		} else if(size() == 1) {
			nodo<E> temp = top;
			top = null;
			size--;
			return temp.getValue();
		} else {
			nodo<E> temp = top;
			top = temp.getNext();
			size--;
			return temp.getValue();
		}
		
	}

	/***
	 * Muestra un valor de la pila 
	 * @return valor escogido
	 */
	public E peek() {
		if (empty()) {
			return null;
		} else {
			return top.getValue();
		}
	}

	/***
	 * muestra cuantos valores hay en la pila
	 * @return cantidad de valores
	 */
	public int size() {
		return size;
	}

	/***
	 * muestra si la pila se encuntra vacia 
	 * @return boolean del estado de la pila
	 */
	public boolean empty() {
		return (top == null);
	}

	
}
