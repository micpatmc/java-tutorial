package Basics.UserInput;
import java.util.Scanner; // We have to import this to use a "Scanner"

// What you'll learn:
// How to create and work with Scanners inside Java.

/*
    Simplified definition:
    A Scanner is used to get user input, which can then
    be used to later or current use.
*/

public class ScannerInput 
{
    /*
        This is how you would create a Scanner object
        Ex: Scanner obj = new Scanner(System.in);

        This will create a new Scanner object to use later

        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        
        We can now use the Scanner object for user input
        Ex: String firstName = obj.nextLine();

        This will prompt the user to input their first name
        
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        Finally, we can try asking for a last name
        Ex: String lastName = obj.nextLine();

        Just like that, the user can input both their first and last name as variables

        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        We will now implement the Scanner object with some dialogue to follow along
    */
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = obj.nextLine();

        System.out.println("What is your last name?");
        String lastName = obj.nextLine();

        System.out.println("Hello " + firstName + " " + lastName + ", " + "nice to meet you!");
    }
}
