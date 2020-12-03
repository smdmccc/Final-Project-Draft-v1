import java.util.*;

public class SetOfStacksDemo  {

 public static void main(String[] args)   {
      Scanner keyboard = new Scanner(System.in);
      ArrayOfStacks<Integer> array = new ArrayOfStacks<Integer>();
      LListOfStacks<Integer> list = new LListOfStacks<Integer>();
      // Introduction to our program
      System.out.println("Welcome!" + "\nIn this demo we will display our Set of Stacks in two forms." + 
                          "\nWe utilize the ArrayBasedStack as well as the LinkedListStack provided in our textbook to contruct our Outer-Stacks." +
                          "\nEach of our Inner-Stacks can hold 10 elements. As each Inner-Stack reaches its limit, we create a new Inner-Stack and keep pushing!" +
                          "\nWatch the console to see the Stack Count change each time we need to alter the number of Inner-Stacks.");
      // Prompt user for ints to push & store
      System.out.println("How many integers would you like to push?");
      int toPush = keyboard.nextInt();
      System.out.println("Pushing ... ");
      int toPop = 0;
      // Loop & add elements to each Inner-Stack, displaying each int in a row
      for (int i = 1; i < toPush + 1; i++)      {
         System.out.print(i + ", ");
         array.push(i);
         list.push(i);
         toPop++;
        // Indicate each time a new Inner-Stack is created
        if(i != 0 && i % 10 == 0)  {
            System.out.println("Stack Full!" + 
                               "\nStack Counts - Array Bounded: " + array.numStacks() + " | Linked List : " + list.numStacks() + 
                               "\nNew Inner-Stack Created!");
        }
      }
      // Indicate the end of the push portion & provide statistics
      System.out.println("... Push complete!\n" + "\nWe've pushed " + toPush + " elements into each set of Stacks." + "\nThe current Stack Counts are - Array Bounded : " + array.numStacks() + " | Linked List : " + list.numStacks() + 
                         "\nThe top elements in each stack are - Array Bounded: " + array.top() + " | Linked List : " + list.top());
      // Begin second half of the program
      System.out.println("\nNow let's remove what's in both Stacks with 'pop' and watch the number of stacks shrink! ");
      System.out.println("Popping ... ");
      // Loop & count down the elements
      try   {
       for (int i = toPop; i >= 0; i--) {
          System.out.print(i + ", ");
          array.pop();
          list.pop();
         // Indicate each time a new Inner-Stack is created
         if(i != 0 && i % 10 == 0)  {
             System.out.println("Stack Empty! Removing Stack ..." + 
                                "\nStack Counts - Array Bounded: " + array.numStacks() + " | Linked List : " + list.numStacks() + 
                                "\nInner-Stack Removed!" + 
                                "\nTop Elements - Array Bounded: " + array.top() + " | Linked List : " + list.top());
         }
       }
     }   catch(Exception e)   {
            System.out.println("\n\nAll Stacks are Empty! Thanks for viewing our Demo!");
         }
   }  
   
}
