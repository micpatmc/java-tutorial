package Intermediate;

import java.util.HashMap; // We have to import this to use a "HashMap"

// What you'll learn:
// How to create and work with a HashMap inside Java.

/*
    Simplified definition:
    A hashmap stores items in a "key/value" pair, meaning that
    one object is used as a key to another object which would be the value
*/

public class Hashmap {
    /*
     * To start off with a HashMap, it needs to be created first
     * 
     * For example:
     * HashMap<Integer, String> hashy = new HashMap<>();
     * This will create a HashMap with the name "hashy" which will take in an
     * integer as the key, and a corresponding string as the value
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * To add anything inside of a HashSet, you have to use the "put" keyword
     * 
     * For example:
     * hashy.put(0, "Food");
     * "hashy" will now contain the word "Food" at key 0
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * To check if a value is contained inside of a HashMap, you use the
     * "containsValue" keyword
     * 
     * For example:
     * hashy.containsValue("Food");
     * This would return TRUE since "Food" is contained inside the HashMap
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * To remove anything from a HashMap, you have to use the "remove" keyword with
     * the key value
     * 
     * For example:
     * hashy.remove(0);
     * This would remove the word "Food" from the HashMap since its key is 0
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * We will now print out a HashMap after using all of the functions above
     */
    public static void main(String[] args) {
        HashMap<Integer, String> hashy = new HashMap<>();

        hashy.put(0, "Food");

        System.out.println("Contains the word Food?: " + hashy.containsValue("Food"));

        hashy.put(1, "Chicken");
        hashy.put(2, "Steak");
        hashy.put(3, "Food");

        hashy.remove(2);

        System.out.println(hashy);
    }
}
