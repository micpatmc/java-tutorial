// What you'll learn:
// How to implement Abstraction inside Java.

/*
    Simplified definition:
    Abstraction is the process of hiding certain details
    and then showing only essential information to the
    user.
*/

// This is called an "Abstract Class"
abstract class Food {
    // This is an "Abstract Method", which doesn't have a body, the body is provided
    // by the subclass
    public abstract int numCalories();
}

// This is the subclass that extends the superclass "Food"
class Chicken extends Food {
    // We define the body from the abstract method in the superclass
    public int numCalories() {
        return 100;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Create the "Chicken" object
        Chicken chicken = new Chicken();

        // Call the method from the class and print the result
        System.out.println(chicken.numCalories());
    }
}
