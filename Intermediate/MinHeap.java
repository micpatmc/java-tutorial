package Intermediate;

import java.util.PriorityQueue; // We have to import this to use "Min-Heaps"
import java.util.Queue; // We have to import this to use "Min-Heaps"

// What you'll learn:
// How to implement Min-Heaps inside Java.

/*
    Simplified definition:
    Min-Heaps allow the storing of different data types
    in an ordered fashion from lowest to highest.
*/

public class MinHeap {
    /*
     * Regarding Min-Heaps, there are a multitude of different functions
     * to operate with that serve different purposes
     * 
     * This is how you would declare and initialize a Min-Heap
     * 
     * Queue<Integer> minHeap = new PriorityQueue<>(); // Java doesn't have an
     * actual "Min-Heap" interface, so a "PriorityQueue" is used instead
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * Next, you'll be able to add into the Queue with [Min-Heap].add
     * 
     * Example: minHeap.add(42);
     * 
     * ------42--------
     * ----------------
     * ----------------
     * ----------------
     * 
     * Now, the number "42" is at the top of the Min-Heap
     * 
     * Let's try to add another number
     * 
     * Example: minHeap.add(12)
     * 
     * ------12--------
     * ------/---------
     * ----42----------
     * ----------------
     * 
     * Now, the number "12" is at the top of the Min-Heap because it's smaller than
     * "42"
     * and the Min-Heap is ordered so smaller values are at the top and larger on
     * the bottom
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * Another function we are able to do is "poll" the number from the Min-Heap,
     * which will ALWAYS
     * remove the item/number at the top of the Min-Heap
     * 
     * This is where the FIFO (First-In First-Out) term comes into play,
     * the FIRST item added is the FIRST item out
     * 
     * Example: int num = minHeap.poll();
     * 
     * ------42--------
     * ----------------
     * ----------------
     * ----------------
     * 
     * "num" is now equal to "12" because that was the number at the top of the
     * Min-Heap
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * A function that Min-Heaps use that is also important is minHeap.peek() to
     * look at whatever
     * is at the top of Min-Heap
     * 
     * Example: int num = minHeap.peek();
     * 
     * ------42--------
     * ----------------
     * ----------------
     * ----------------
     * 
     * "num" is equal to "42", but "42" is still in the Min-Heap because it was only
     * read and
     * not polled from the Min-Heap
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * Lastly, an important function for Min-Heap is minHeap.isEmpty() which will
     * check if the Queue
     * is empty or not
     * 
     * Example: boolean isEmpty = minHeap.isEmpty();
     * 
     * ------42--------
     * ----------------
     * ----------------
     * ----------------
     * 
     * "isEmpty" is now set to false because the Min-Heap is not empty as of now
     * 
     * We will now print out a Min-Heap after using all of the functions above
     */
    public static void main(String[] args) {
        Queue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(42);
        minHeap.add(12);

        System.out.println("Popped number: " + minHeap.poll());
        System.out.println("Top of the Min-Heap: " + minHeap.peek());
        System.out.println("Is the Min-Heap empty?: " + minHeap.isEmpty());
    }
}
