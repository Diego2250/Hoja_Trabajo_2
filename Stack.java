/**
 * @author Diego Morales
 *
 */
public class Stack<E> implements IStack<E> {
	
	private nodo<E> top;
	private int size;
	public E tempo;
	
	public Stack() {
		top = null;
	}
	
    /**
     * 
     * @param value
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

	/**
     * 
     * @return saca el elemento del estack
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

	/**
     * 
     * @return primer valor
     */
	public E peek() {
		if (empty()) {
			return null;
		} else {
			return top.getValue();
		}
	}

    /**
     * 
     * @return tamaño de stack
     */
	public int size() {
		return size;
	}

    /**
     * 
     * @return primer elemento null
     */
	public boolean empty() {
		return (top == null);
	}

	
}
