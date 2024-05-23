// What you'll learn:
// How to implement polymorphism inside Java.

/*
    Simplified definition:
    Polymorphism is when we have multiple classes related to
    one another through inheritance.
*/

// This is our "Food" class
class Food {
    public void numCalories() {
        System.out.println("This food has calories.");
    }
}

// This "Chicken" class extends off of "Food"
// Notice we use the "extends" keyword to indicate that
class Chicken extends Food {
    public void numCalories() {
        System.out.println("Chicken calories: 200");
    }
}

// This "Steak" class also extends off of "Food"
// Notice we use the "extends" keyword yet again to indicate that
class Steak extends Food {
    public void numCalories() {
        System.out.println("Steak calories: 300");
    }
}

// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

// This class will print out the corresponding functions relative to the classes
public class Polymorphism {
    public static void main(String[] args) {
        // Here we create 3 different objects based on the classes we created previously
        Food food = new Food();
        Food chicken = new Chicken();
        Food steak = new Steak();

        // We will now print out the functions associated with the correct class
        food.numCalories();
        chicken.numCalories();
        steak.numCalories();
    }
}
