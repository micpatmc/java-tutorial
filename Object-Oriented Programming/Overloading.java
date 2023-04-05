// What you'll learn:
// How to use overloading inside Java.

public class Overloading 
{
    // Inside Java, if you have two functions with the same name
    // that have different parameters, that is called "Overloading"

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

    // We will print out the sum of variables using the functions above
    public static void main(String[] args)
    {
        int a = 2, b = 2;
        double c = 2.5, d = 2.5f;

        System.out.println("Using the first function add: " + add(a, b)); // Result: 4
        System.out.println("Using the second function add: " + add(c, d)); // Result: 5
    }
}
