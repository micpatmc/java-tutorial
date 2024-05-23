package Intermediate;

// What you'll learn:
// How to create and use two-dimensional array inside Java.

public class TwoDimensionalArray {
    /*
     * A two-dimensional array (2d-array) does the same as an array but in
     * two-dimensions
     * 
     * For example (Array):
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
     * For example (Two-dimensonal array)
     * int[][] arr = new int[5][5];
     * This creates a 2d array of 25 int's
     * 
     * This is how it looks
     * [0, 0, 0, 0, 0]
     * [0, 0, 0, 0, 0]
     * [0, 0, 0, 0, 0]
     * [0, 0, 0, 0, 0]
     * [0, 0, 0, 0, 0] <-- Int array's are initialized with 0's if not told
     * otherwise
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * You can access index inside 2d array's the same as 1d array's but having to
     * use two index values
     * 
     * In this example, that would look like
     * arr[0][0] = 1;
     * (The first index is always going to the index of the ROW, and the second is
     * the COLUMN)
     * 
     * Now this is the new array
     * [1, 0, 0, 0, 0]
     * [0, 0, 0, 0, 0]
     * [0, 0, 0, 0, 0]
     * [0, 0, 0, 0, 0]
     * [0, 0, 0, 0, 0]
     * 
     * Let's try another one
     * arr[3][3] = 2;
     * 
     * Now this is the new array
     * [1, 0, 0, 0, 0]
     * [0, 0, 0, 0, 0]
     * [0, 0, 0, 0, 0]
     * [0, 0, 0, 2, 0]
     * [0, 0, 0, 0, 0]
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * To get the length of this 2d array in code, you use [ARRAY_NAME].length
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * This function will print out the values of the 2d array we went over
     * previously
     */
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[0][0] = 1;
        arr[3][3] = 2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
