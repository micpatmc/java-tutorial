package Intermediate;
import java.util.Stack; // We have to import this to use "Stacks"

// What you'll learn:
// How to implement Stacks inside Java.
 
// Simplified definition:
// Stacks allow the storing of different data types
// which can be pushed and popped in a LAST-IN FIRST-OUT manner.

public class Stacks 
{
    // Regarding Stacks, there are a multitude of different functions
    // to operate with that serve different purposes

    // This is how you would declare and initialize a Stack
    
    // Stack<Integer> stack = new Stack<>();

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // Next, you'll be able to push onto the Stack with [STACK].push

    // Example: stack.push(42);

    // |    |
    // |    |
    // |    |
    // |    |
    // |    |
    // | 42 |
    // ------

    // Now, the number "42" is at the top of the Stack

    // Let's try to push another number

    // Example: stack.push(12)

    // |    |
    // |    |
    // |    |
    // |    |
    // | 12 |
    // | 42 |
    // ------

    // Now, the number "12" is at the top of Stack ABOVE "42"

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    // Another function we are able to do is "pop" the number from the Stack, which will ALWAYS
    // remove the item/number at the top of the stack

    // This is where the LIFO (Last-In First-Out) term comes into play,
    // the LAST item pushed is the FIRST item out
    
    // Example: int num = stack.pop();

    // |    |
    // |    |
    // |    |
    // |    |
    // |    |
    // | 42 |
    // ------

    // "num" is now equal to "12" because that was the number at the top of the Stack

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // A function that Stacks use that is also important is stack.peek() to look at whatever
    // is at the top of stack

    // Example: int num = stack.peek();

    // |    |
    // |    |
    // |    |
    // |    |
    // |    |
    // | 42 |
    // ------

    // "num" is equal to "42", but "42" is still in the Stack because it was only read and 
    // not popped from the Stack

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // Lastly, an important function for Stacks is stack.isEmpty() which will check if the Stack
    // is empty or not

    // Example: boolean isEmpty = stack.isEmpty();

    // |    |
    // |    |
    // |    |
    // |    |
    // |    |
    // | 42 |
    // ------

    // "isEmpty" is now set to false because the Stack is not empty as of now

    // We will now print out a Stack after using all of the functions above
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();

        stack.push(42);
        stack.push(12);

        System.out.println("Popped number: " + stack.pop());
        System.out.println("Top of the Stack: " + stack.peek());
        System.out.println("Is the Stack empty?: " + stack.isEmpty());
    }
}
