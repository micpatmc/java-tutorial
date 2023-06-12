package Basics.Conditional;
// What you'll learn:
// How to use "elseif" statements inside of Java.

// Simplified definition:
// "else if" statements allow you to execute a piece of code if
// all previous "if" OR "else if" condition were to be false.

public class ElseIfStatements 
{
    // To declare an "else if" statement, you use the keyword "else if"
    // followed by the code you'd like to run if all else fails

    // For example:

    // if (2 > 3)
    // {
    //    System.out.print("2 is more than 3"); <-- DOESN'T EXECUTE
    // }
    // else if (2 < 3)
    // {
    //    System.out.print("2 is less than 3"); <-- EXECUTES
    // }

    // The code above would not run at first, but because there is an "else if" statement,
    // it would eventually run because the first "if" statement wasn't true
    
    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // What if we had something different...

    // if (2 > 3)
    // {
    //    System.out.print("2 is less than 3"); <-- DOESN'T EXECUTE
    // }
    // else if (2 == 3)
    // {
    //    System.out.print("2 is more than 3"); <-- DOESN'T EXECUTE
    // }
    // else if (2 < 3)
    // {
    //    System.out.print("2 is more than 3"); <-- EXECUTES
    // }



    // This piece of code WOULD run the last portion the first or second portion statement
    // would NOT run

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // We will now print out an example of using multiple "if" and "else if" statements in different situations
    public static void main(String[] args)
    {
        int x = 2;
        int y = 3;
        char a = 'a';
        char b = 'b';

        if (x > y)
        {
            System.out.println("A-IF");
        }
        else if (x == y)
        {
            System.out.println("A-ELSEIF-1");
        }
        else if (x < y)
        {
            System.out.println("A-ELSEIF-2");
        }

        if (x < y)
        {
            System.out.println("B-IF");
        }
        else if (x == y)
        {
            System.out.println("B-ELSEIF-1");
        }
        else if (x > y)
        {
            System.out.println("B-ELSEIF-2");
        }

        if (a == b)
        {
            System.out.println("C-IF");
        }
        else if (a != b)
        {
            System.out.println("C-ELSEIF-1");
        }

        if (a != b)
        {
            System.out.println("D-IF");
        }
        else if (a == b)
        {
            System.out.println("D-ELSEIF-1");
        }
    }    
}
