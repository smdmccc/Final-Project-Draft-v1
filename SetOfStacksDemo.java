import java.util.*;
public class SetOfStacksDemo  {

 public static void main(String[] args)   {
 
      Scanner keyboard = new Scanner();
      ArrayOfStacks<Integer> array = new ArrayOfStacks<Integer>();
      LListOfStacks<Integer> list = new LListOfStacks<Integer>();

      System.out.println("Welcome!");
      System.out.println("In this demo we will display our Set of Stacks in two forms.");
      System.out.println("The first utilizes the ArrayBoundedStack class,");
      System.out.println("and for the second we use a Linked List. ");
      System.out.println("Let's push 50 integers into the inner stacks to see what happens.");
      System.out.println("Every ten elements we'll call the top method to keep track of where we're at.");
      System.out.println("");
      // Promp the user to add more elements, if yes add 10 more & display the number of stacks, if no move onto part 2.
      
      for (int i = 0; i < 10; i++)      {

         array.push(i);
         list.push(i);
         // I would like to display the top value and the numbers of stacks every 10 pushes, getting a type error though so I'm confused.
         // Error message states that a variable is required, not a value but modulus is a mathematical operation on values so ???
         // disregard, changing methodology. see line 35
        // if(pushed % 10 = 0)  {
            System.out.println("Array : " + array.top());
            System.out.println("Linked List : " + list.top());
            System.out.println("The array contains : " + array.numStacks() + " stacks.");
            System.out.println("The list contains : " + list.numStacks() + " stacks.");
          //  }
      }
      System.out.println("As you can see, once the inner stack gets too large, we create a new stack inside the outer stack.");
      System.out.println("Now let's see begin to remove elements with 'pop' and watch the number of stacks shrink! ");
      // Implement a similar prompt to execute sets of 10 pops OR run the for loop given a certain number of times based on user input. Change part one to match
      for (int i = 0; i < 51; i++)
      {
         array.pop();
         list.pop();
         
      }
   }

}