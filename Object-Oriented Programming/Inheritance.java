// What you'll learn:
// How to use inheritance inside Java.

/* 
    Simplified definition:
    Inheritance is the concept of using an element from one class
    to another class.
*/

// For example, we have this "Food" class
class Food
{
    // The number of calories the food has
    public int numCalories = 2;
}

// In our "Inheritance" class, we will now use an element from
// the "Food" class
public class Inheritance
{
    public static void main(String[] args)
    {
        // First, create an instance of the "Food" class, in this case we use chicken
        Food chicken = new Food();

        // Access the "numCalories" element from the Food class using the "chicken" variable
        chicken.numCalories = 200;

        // Print out the result
        System.out.println(chicken.numCalories); // Result: 200
    }
}