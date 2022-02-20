/**
 * @author Diego Morales
 */
public interface IStack<E> 
{
  /**
   * 
   * @param item
   */
   public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push

   public E pull();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
 
   public boolean empty();

   
   public int size();
   // post: returns the number of elements in the stack

}