import ch02.stacks.*;
   // If our Set of Stacks is an array, what structure is the Stack itself in?
   // I think this is why we should all the use of generics below, as T
public class ArrayOfStacks<T> extends ArrayBoundedStack<T> {

   ArrayOfStacks<ArrayBoundedStack> stackSet = new ArrayOfStacks<ArrayBoundedStack>();
   public int capacity;
   public ArrayOfStacks(int capacity) {
      this.capacity = capacity;
   }
   
   public ArrayBoundedStack getLastStack()   {
      if(stackSet.size() == 0) return null;
      return stackSet.get(stackSet.size() - 1);
   } 
   
   // Push should behave identically to a single stack, 
   // if Stack is at capacity then we must create a new stack.
   // toAdd is what is being added to the Stack
   public void push(int toAdd)   {
      // identify the bottom stack 
//      ArrayOfStacks<T> last = stackSet[topIndex];// get the last element in the array? or the last stack in this set?
      // 
//      T last = getLastStack();
      
      // if the last element of the stack does not equal null &&
         // is not at capacity, add the to the last stack
      if(last != null && !top.isFull()) {
         top.push(toPush);
      }
      // else create a new stack
      else{
         ArrayBoundedStack<T> stack = new ArrayBoundedStack(topIndex);
         stack.push(toPush);
         stackSet.push(stack);
      }      
   }
 /*  public int pop()  {
      
   } */
}