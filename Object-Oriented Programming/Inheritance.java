// What you'll learn:
// How to use inheritance inside Java.

// Simplified definition:
// Inheritance is the concept of using an element from one class
// to another class.

// For example, we have this "Animal" class
class Animal
{
    // The number of legs the animal has
    public int numLegs = 2;
}

// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

// In our "Inheritance" class, we will now use an element from
// the "Animal" class
public class Inheritance
{
    public static void main(String[] args)
    {
        // First, create an instance of the "Animal" class, in this case we use a dog
        Animal dog = new Animal();

        // Access the "numLegs" element from the Animal class using the "dog" variable
        dog.numLegs = 4;

        // Print out the result
        System.out.println(dog.numLegs); // Result: 4
    }
}