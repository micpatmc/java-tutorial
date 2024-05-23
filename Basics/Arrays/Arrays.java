// What you'll learn:
// How to create and use arrays inside Java.

public class Arrays {
    /*
     * Arrays are objects that hold multiple instances of variables
     * 
     * For example:
     * int[] arr = new int[5];
     * This creates an array of 5 int's
     * 
     * This is how it looks
     * [0, 0, 0, 0, 0] <-- Int array's are initialized with 0's if not told
     * otherwise
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * The way to change the elements in an array is to use [ARRAY_NAME][[INDEX]] =
     * [NEW_NUMBER]
     * 
     * In this example, that would look like
     * arr[0] = 1;
     * 
     * Now this is the new array
     * [1, 0, 0, 0, 0]
     * 
     * Let's try another one
     * arr[3] = 2;
     * 
     * Now this is the new array
     * [1, 0, 0, 2, 0]
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * To get the length of this array in code, you use [ARRAY_NAME].length
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * This function will print out the values of the array we went over previously
     */

    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 1;
        arr[3] = 2;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
