// What you'll learn:
// How to initiate specific loop statements inside Java.

/*
    Simplified definition:
    A loop statement makes it so you can control the loop,
    with special statements.
*/

public class LoopStatements 
{
    /*
        "break" will make it so the loop is instantly exited out of

        Ex:
        for (int i = 1; i <= 10; i++)
        {
            if (i == 5)
            {
                break;
            }
        
            System.out.println(i);
        }

        Based on the above block of code, the 'i' variable will go up to 5
        and then instantly break out of the loop because of the "if" statement

        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        "continue" will make it so the loop skips the current iteration
        and starts back at the top

        Ex:
        for (int i = 1; i <= 10; i++)
        {
            if (i == 5)
            {
                continue;
            }
        
            System.out.println(i);
        }

        Based on the above block of code, the 'i' variable will go up to 5
        and then instantly skip to the next iteration before printing out the
        5th iteration print statement

        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        We will now print out some of the above examples to supply a better visual
    */
    public static void main(String[] args)
    {
        System.out.println("Demonstrating the 'break' statement: ");
        for (int i = 1; i <= 10; i++)
        {
            if (i == 5)
            {
                break;
            }

            System.out.println(i);
        }

        System.out.println();

        System.out.println("Demonstrating the 'continue' statement: ");
        for (int i = 1; i <= 10; i++)
        {
            if (i == 5)
            {
                continue;
            }

            System.out.println(i);
        }
    }
}
