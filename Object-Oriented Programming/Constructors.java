// What you'll learn:
// How to implement Constructors inside Java.

/*
    Simplified definition:
    Constructures are special methods that are used to initialize
    objects inside Java, typically used to set initial values
    for object attributes.
*/

class Food {
    int numCalories = 0;

    // You always have to name the Constructor the same name as the class, in this
    // case "Food"
    public Food(int numCal) {
        /*
         * We are setting our "numCalories" attribute above to
         * the input parameter "numCal", initializing the object
         */
        numCalories = numCal;
    }
}

// We will now initialize the "Food" object, giving it an arbitrary amount of
// calories
public class Constructors {
    public static void main(String[] args) {
        // Create an object of class "Food" (This calls the constructor)
        Food chicken = new Food(200);

        // Print out the value of "numCalories" from the newly created object
        System.out.println("The amount of calories in this chicken is: " + chicken.numCalories);
    }
}
