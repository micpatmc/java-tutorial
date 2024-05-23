// What you'll learn:
// How to do a while-loop inside Java.

/*
    Simplified definition:
    A while-loop is a type of loop in java that constantly
    runs code up until a certain condition is met
*/

public class WhileLoop {
    /*
     * This is the universal structure of while-loops
     * -------------------------------------------
     * [STARTING VARIABLE]
     * 
     * ([CONDITION])
     * {
     * // Code.
     * [INCREMENT]
     * }
     * -------------------------------------------
     * 
     * This is how it looks with common variables filled inside
     * -------------------------------------------
     * int i = 0;
     * 
     * (i < 3)
     * {
     * // Code.
     * i++;
     * }
     * -------------------------------------------
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * How this works:
     * 'i' will start at 0
     * the code will run
     * 'i' will increment by 1 (i++)
     * 
     * 'i' is now 1
     * the code will run
     * 'i' will increment by 1 (i++)
     * 
     * 'i' is now 2
     * the code will run
     * 'i' will increment by 1 (i++)
     * 
     * 'i' is now 3
     * Since 'i' is 3 and 3 IS NOT less than 3 (i < 3), the for-loop will stop
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * This function will use a while loop and print out the index values
     */
    public static void main(String[] args) {
        // Run this to see the output
        int i = 0;

        while (i < 3) {
            System.out.println(i);
            i++;
        }
    }
}

/*
 * Additional takeaway(s):
 * 
 * Confusion arises whether to use for-loops or while-loops, there is no correct
 * answer, they serve the same purpose in different manners, it is up to
 * the programmer to choose
 */
