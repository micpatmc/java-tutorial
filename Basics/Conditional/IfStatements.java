package Basics.Conditional;
// What you'll learn:
// How to use "if" statements inside of Java.

/*
    Simplified definition:
    "if" statements allow you to execute a piece of code IF
    the condition is true and not execute otherwise.
*/

public class IfStatements 
{
    /*
        To declare an "if" statement, you use the keyword "if"
        followed by the code you'd like to run if the statement is true

        For example:

        if (2 > 3)
        {
        System.out.print("**DING DING**"); <-- DOESN'T EXECUTE
        }

        The code above would not run because 2 is NOT more than 3
        
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        What if we had something different...

        if (2 < 3)
        {
        System.out.print("**DING DING**"); <-- EXECUTES
        }

        This piece of code WOULD run because 2 IS less than 3

        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        We will now print out an example of using multiple "if" statements in different situations
    */
    public static void main(String[] args)
    {
        int x = 2;
        int y = 3;
        char a = 'a';
        char b = 'b';

        if (x > y)
        {
            System.out.println("A");
        }

        if (x < y)
        {
            System.out.println("B");
        }

        if (a == b)
        {
            System.out.println("C");
        }

        if (a != b)
        {
            System.out.println("D");
        }
    }    
}
