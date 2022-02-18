import java.util.ArrayList;
class Stack<E> implements IStack<E>{

    protected ArrayList<E> data;

	public void push(E item)
	{
		data.add(item);
	}

	public E pull()
	{
		return data.remove(size()-1);
	}

	public E peek()
	{
		return data.get(size() - 1);
	}
	
	public int size()
	{
		return data.size();
	}
  
	public boolean empty()
	{
		return size() == 0;
	}
}