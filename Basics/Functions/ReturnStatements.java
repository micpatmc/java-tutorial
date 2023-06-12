package Basics.Functions;
// What you'll learn:
// How to implement return statements inside Java

public class ReturnStatements 
{
    // Return statements are used to "return" a value
    // which then can be used in other places repeatedly
    
    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // Let's create a function that returns the number of calories in food
    static int foodCalories()
    {
        return 100;
    }

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // We now have this function that returns the number of calories in food that can
    // be used anywhere in our running code
    public static void main(String[] args)
    {
        System.out.println("Calories: " + foodCalories());
    }
}
