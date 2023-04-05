package Basics.Comments;

// What you'll learn:
// How to create comments inside of Java.

public class Comments
{
    // This is a single line comment

    /* While this is a 
    multi-line comment */

    // This is
    // also a multi-line
    // comment

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    // Comments are used to mainly express in short what your code does
    // Comments don't affect your code in any way, just to inform the user what it does

    // Ex:
    // This function increments the number of apples and prints it to the screen
    public static void main(String[] args)
    {
        int numOfApples = 0;
        numOfApples = numOfApples + 1;
        
        // counter = 5;

        System.out.println(numOfApples);
    }
}

// Additional takeaway(s):

// It is best to keep comments under 100 characters, anything more than that and your comment
// risks falling off the screen when there are others viewing your code from their
// own machines.

