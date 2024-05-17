package Intermediate;
import java.util.HashSet; // We have to import this to use a "HashSet"

// What you'll learn:
// How to create and work with a HashSet inside Java.

/*
    Simplified definition:
    A hashset holds a set of items where each item is unique,
    meaning two of the same item can't be inside a hashet.
*/

public class Hashset
{
    /*
        To start off with a HashSet, it needs to be created first

        For example:
        HashSet<String> hashy = new HashSet<>();
        This will create a HashSet with the name "hashy" which will take in Strings

        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        To add anything inside of a HashSet, you have to use the "add" keyword

        For example:
        hashy.add("Food");
        "hashy" will now contain the word "Food"

        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        To check if a word is contained inside of a HashSet, you use the "contains" keyword

        For example:
        hashy.contains("Food");
        This would return TRUE since "Food" is contained inside the HashSet

        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        To remove anything from a HashSet, you have to use the "remove" keyword

        For example:
        hashy.remove("Food");
        This would remove the word "Food" from the HashSet

        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        Lastly, if you try to add in a word that the HashSet already contains,
        it won't make a new word, but replace the old word with the new word

        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        
        We will now print out a HashSet after using all of the functions above
    */
    public static void main(String[] args)
    {
        HashSet<String> hashy = new HashSet<>();

        hashy.add("Food");

        System.out.println("Contains the word Food?: " + hashy.contains("Food"));

        hashy.add("Chicken");
        hashy.add("Steak");
        hashy.add("Food");

        hashy.remove("Steak");

        System.out.println(hashy);
    }    
}
