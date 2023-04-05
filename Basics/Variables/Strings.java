// What you'll learn:
// How to use Strings inside of Java.

public class Strings 
{
    // "Strings" in Java are just words, "apple" is a string,
    // "dog" is a string, "b" is a string

    // The way to create a string is by using the "String" keyword
    // String word = "Apple";

    // If you would like to use just a single letter, it'd be better
    // to use a "char" (short for character)
    // char ch = 'A';

    // This will print out our variables we have talked about
    public static void main(String[] args)
    {
        String word = "Apple";
        char ch = 'A';
        
        System.out.println("This is a string: " + word);
        System.out.println("This is a char: " + ch);
    }
}
