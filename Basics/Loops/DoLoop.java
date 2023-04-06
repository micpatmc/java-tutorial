// What you'll learn:
// How to do a Do-loop inside Java.

// Simplified definition:
// A do-loop is a type of loop in java that constantly
// runs code up until a certain condition is met

public class DoLoop
{
    // This is one of many structures of do-loops
    // -------------------------------------------
    // [STARTING VARIABLE]
    //
    // do{
    //  // Code.
    //  [INCREMENT]
    //  } while ([CONDITION]);
    // -------------------------------------------
    
    // This is how it looks with common variables filled inside
    // -------------------------------------------
    // int i = 0;
    //
    // do{
    //  // Code.
    //  i++;
    //  } while (i < 3);
    // -------------------------------------------

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // How this works:
    // 'i' will start at 0
    // the code will run
    // 'i' will increment by 1 (i++)

    // 'i' is now 1
    // the code will run
    // 'i' will increment by 1 (i++)
    
    // 'i' is now 2
    // the code will run
    // 'i' will increment by 1 (i++)
    
    // 'i' is now 3
    // Since 'i' is 3 and 3 IS NOT less than 3 (i < 3), the do-loop will stop

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // This function will use a do loop and print out the index values
    public static void main(String[] args)
    {
        // Run this to see the output
        int i = 0;

        do{
            System.out.println(i);
            i++;
        } while (i < 3);
    }
}
