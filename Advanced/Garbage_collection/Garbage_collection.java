package Garbage_collection;
/*
Java garbage collection is the process by which Java programs
perform automatic memory management. Java programs compile to
bytecode that can be run on a Java Virtual Machine, or JVM for short.
When Java programs run on the JVM, objects are created on the heap,
which is a portion of memory dedicated to the program.
Eventually, some objects will no longer be needed.
The garbage collector finds these unused objects
and deletes them to free up memory.
*/


/*
What Triggers Garbage Collection?

Allocation Failure: When an object cannot be allocated in the heap because there is not enough contiguous free space available, the JVM triggers the Garbage Collection to free up memory.
Heap Size: When the heap reaches a certain capacity threshold, the JVM triggers Garbage Collection to reclaim memory and prevent an OutOfMemoryError.
System.gc(): Calling the System.gc()  method can trigger Garbage Collection, although it does not guarantee that Garbage Collection will occur.
Time-Based: Some Garbage Collection algorithms, such as G1 Garbage Collection, use time-based triggers to initiate Garbage Collection.

 */

public class Garbage_collection {

    public static void main(String[] args) {

        //Calling this method is the most common way to request Garbage Collection in a Java application.
        //However, it does not guarantee that Garbage Collection will occur as it is only a suggestion to the JVM.
        System.gc();


        //This method provides another way to request Garbage Collection in a Java application.
        //This method is similar to the System.gc() method, and it also suggests that the JVM should
        //run Garbage Collector, but again it does not guarantee that Garbage Collection will occur.
        Runtime.getRuntime().gc();


    }

}
