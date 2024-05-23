package Basics.Conditional;
// What you'll learn:

// How to do switch statements inside Java.

/*
    Simplified definition:
    A switch statement allows blocks of code to execute
    based on if the specified condition is met.
*/

public class SwitchStatements {
    /*
     * This is how you declare and use a switch statement
     * 
     * int num = 10;
     * 
     * switch (num)
     * {
     * case 5:
     * System.out.println("num is 5"); <-- DOESN'T EXECUTE
     * break;
     * case 10:
     * System.out.println("num is 10"); <-- EXECUTES
     * break;
     * default:
     * System.out.println("**DING DING**"); <-- DOESN'T EXECUTE
     * }
     * 
     * In this statement, the condition variable is "num", and since it was
     * initialized as 10 beforehand, we are looking for an instance where
     * the case is equal to the set number in "num" which is 10
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * The default switch works in the sense that when none of the cases execute
     * before it,
     * that block of code will execute automatically
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * We will now print out an example of using a switches
     */
    public static void main(String[] args) {
        int num = 10;

        switch (num) {
            case 5:
                System.out.println("num is 5");
                break;
            case 10:
                System.out.println("num is 10");
                break;
            default:
                System.out.println("num is 10");
        }
    }
}
