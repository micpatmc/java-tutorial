package Intermediate;
import java.util.Collections; // We have to import this to use "Max-Heaps"
import java.util.PriorityQueue; // We have to import this to use "Max-Heaps"
import java.util.Queue; // We have to import this to use "Max-Heaps"

// What you'll learn:
// How to implement Max-Heaps inside Java.
 
/*
    Simplified definition:
    Max-Heaps allow the storing of different data types
    in an ordered fashion from highest to lowest.
*/

public class MaxHeap 
{
    /*
        Regarding Max-Heaps, there are a multitude of different functions
        to operate with that serve different purposes

        This is how you would declare and initialize a Max-Heap
        
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Java doesn't have an actual "Max-Heap" interface, so a "PriorityQueue" is used instead

        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        Next, you'll be able to add into the Queue with [Max-Heap].add

        Example: maxHeap.add(42);

        ------42--------
        ----------------
        ----------------
        ----------------

        Now, the number "42" is at the top of the Max-Heap

        Let's try to add another number

        Example: maxHeap.add(12)

        ------42--------
        ------/---------
        ----12----------
        ----------------

        Now, the number "42" is at the top of the Max-Heap because it's larger than "12"
        and the Max-Heap is ordered so larger values are at the top and smaller on the bottom

        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        
        Another function we are able to do is "poll" the number from the Max-Heap, which will ALWAYS
        remove the item/number at the top of the Max-Heap

        This is where the FIFO (First-In First-Out) term comes into play,
        the FIRST item added is the FIRST item out
        
        Example: int num = maxHeap.poll();

        ------12--------
        ----------------
        ----------------
        ----------------

        "num" is now equal to "42" because that was the number at the top of the Max-Heap

        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        A function that Max-Heaps use that is also important is maxHeap.peek() to look at whatever
        is at the top of Max-Heap

        Example: int num = maxHeap.peek();

        ------12--------
        ----------------
        ----------------
        ----------------

        "num" is equal to "12", but "12" is still in the Max-Heap because it was only read and 
        not polled from the Max-Heap

        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        Lastly, an important function for Max-Heap is maxHeap.isEmpty() which will check if the Queue
        is empty or not

        Example: boolean isEmpty = maxHeap.isEmpty();

        ------12--------
        ----------------
        ----------------
        ----------------

        "isEmpty" is now set to false because the Max-Heap is not empty as of now

        We will now print out a Max-Heap after using all of the functions above
    */
    public static void main(String[] args)
    {
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(42);
        maxHeap.add(12);

        System.out.println("Popped number: " + maxHeap.poll());
        System.out.println("Top of the Max-Heap: " + maxHeap.peek());
        System.out.println("Is the Max-Heap empty?: " + maxHeap.isEmpty());
    }
}
