package Intermediate;

import java.util.Queue; // We have to import this to use "Heaps"
import java.util.PriorityQueue; // We have to import this to use "Heaps"

// What you'll learn:
// How to implement Heaps inside Java.

/*
    Simplified definition:
    Heaps allow the storing of different data types in a specific 
    sorted order during runtime (by default, smallest to largest, also called a min-heap).
*/

public class Heaps {
    /*
     * Regarding Heaps, there are a multitude of different functions
     * to operate with that serve different purposes
     * 
     * This is how you would declare and initialize a Heap (By default a min-heap)
     * 
     * Queue<Integer> heap = new LinkedList<>(); // Java doesn't have an actual
     * "Heap" interface, so a "PriorityQueue" is used
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * Next, you'll be able to add into the Heap with [Heap].add
     * 
     * Example: heap.add(42);
     * 
     * -------42-------
     * 
     * Now, the number "42" is at the top of the Heap
     * 
     * Let's try to add another number
     * 
     * Example: queue.add(12)
     * 
     * ----------------
     * 12 42 <-- front
     * ----------------
     * 
     * Now, the number "12" is at the front of Queue BEHIND "42"
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * Another function we are able to do is "poll" the number from the Queue, which
     * will ALWAYS
     * remove the item/number at the front of the queue
     * 
     * This is where the FIFO (First-In First-Out) term comes into play,
     * the FIRST item added is the FIRST item out
     * 
     * Example: int num = queue.poll();
     * 
     * ----------------
     * 12 <-- front
     * ----------------
     * 
     * "num" is now equal to "42" because that was the number at the front of the
     * Queue
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * A function that Queues use that is also important is queue.peek() to look at
     * whatever
     * is at the front of queue
     * 
     * Example: int num = queue.peek();
     * 
     * ----------------
     * 12 <-- front
     * ----------------
     * 
     * "num" is equal to "12", but "12" is still in the Queue because it was only
     * read and
     * not polled from the Queue
     * 
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
     * =-=-=-=-=-=-=-=
     * 
     * Lastly, an important function for Queues is queue.isEmpty() which will check
     * if the Queue
     * is empty or not
     * 
     * Example: boolean isEmpty = queue.isEmpty();
     * 
     * ----------------
     * 12 <-- front
     * ----------------
     * 
     * "isEmpty" is now set to false because the Queue is not empty as of now
     * 
     * We will now print out a Queue after using all of the functions above
     */
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(42);
        queue.add(12);

        System.out.println("Popped number: " + queue.poll());
        System.out.println("Top of the Queue: " + queue.peek());
        System.out.println("Is the Queue empty?: " + queue.isEmpty());
    }
}
