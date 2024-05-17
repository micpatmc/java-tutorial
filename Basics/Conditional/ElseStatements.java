package Basics.Conditional;
// What you'll learn:
// How to use "else" statements inside of Java.

/*
    Simplified definition:
    "else" statements allow you to execute a piece of code if
    an "if" condition were to be false.
*/

public class ElseStatements 
{
    /*
        To declare an "else" statement, you use the keyword "else"
        followed by the code you'd like to run if all else fails

        For example:

        if (2 > 3)
        {
        System.out.print("2 is more than 3"); <-- DOESN'T EXECUTE
        }
        else
        {
        System.out.print("2 is less than 3"); <-- EXECUTES
        }

        The code above would not run at first, but because there is an "else" statement,
        it would eventually run regardless with whatever is inside that portion
        
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        What if we had something different...

        if (2 < 3)
        {
        System.out.print("2 is less than 3"); <-- EXECUTES
        }
        else
        {
        System.out.print("2 is more than 3"); <-- DOESN'T EXECUTE
        }


        This piece of code WOULD run the first portion, but since the first portion ran, the
        second portion or the "else" statement would NOT run

        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        We will now print out an example of using multiple "if" and "else" statements in different situations
    */
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
        else
        {
            System.out.println("A-ELSE");
        }

        if (x < y)
        {
            System.out.println("B-IF");
        }
        else
        {
            System.out.println("B-ELSE");
        }

        if (a == b)
        {
            System.out.println("C-IF");
        }
        else
        {
            System.out.println("C-ELSE");
        }

        if (a != b)
        {
            System.out.println("D-IF");
        }
        else
        {
            System.out.println("D-ELSE");
        }
    }    
}
