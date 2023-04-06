// What you'll learn:
// How to use Strings inside of Java.

// Simplified definition (Strings):
// "Strings" in Java are just words (which could also include numbers)
// , "apple" is a string, "dog123" is a string, "b" is a string.

// Simplified definition (char):
// "char" in Java are just letters (which could also include numbers),
// "a" is a char, "c" is a char, "b" is a char, but "Bear" isn't a char.

public class Strings 
{
    // The way to create a string is by using the "String" keyword
    // String word = "Apple";

    // If you would like to use just a single letter, it'd be better
    // to use a "char" (short for character)
    // char ch = 'A';

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // This will print out our variables we have talked about
    public static void main(String[] args)
    {
        String word = "Apple";
        char ch = 'A';
        
        System.out.println("This is a string: " + word);
        System.out.println("This is a char: " + ch);
    }
}
