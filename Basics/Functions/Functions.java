package Basics.Functions;
// What you'll learn:

// How to implement functions inside Java

public class Functions {
    /*
     * "Functions" are blocks of code created for a specific purpose
     * which then can be used in other places repeatedly
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * Let's create a function that prints out the word "Apple"
     */

    static void printApple() {
        System.out.println("Apple");
    }

    // We now have this function that prints out the word "Apple" that we can use
    // anywhere
    // in our running code
    public static void main(String[] args) {
        printApple();
    }
}
