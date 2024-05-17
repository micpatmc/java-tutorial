// What you'll learn:
// How to use overloading inside Java.

/*
    Simplified definition:
    If you have two functions with the same name
    that have different parameters (typically for different functionalities)
    , that is called "Overloading".
*/

public class Overloading 
{
    // This function takes 2 int's and returns the sum of them
    static int add(int a, int b)
    {
        return a + b;
    }

    // This function takes 2 double's and returns the sum of them
    static double add(double a, double b)
    {
        return a + b;
    }

    // Important note:
    // Both of these functions above use the same function name "add"

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // We will print out the sum of variables using the functions above
    public static void main(String[] args)
    {
        int a = 2, b = 2;
        double c = 2.5, d = 2.5f;

        // This will use the first function "add" automatically since the values we use are int's
        System.out.println("Using the first function add: " + add(a, b)); // Result: 4
        
        // This will use the second function "add" automatically since the values we use are double's
        System.out.println("Using the second function add: " + add(c, d)); // Result: 5
    }
}
