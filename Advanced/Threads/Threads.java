package Threads;

/*
A thread in Java is the direction or path that is taken while a program is being executed.
Generally, all the programs have at least one thread, known as the main thread, that is
provided by the JVM or Java Virtual Machine at the starting of the program’s execution.
At this point, when the main thread is provided, the main() method is invoked by the main thread.
 */

/*
In Java, multithreading is the method of running two or more threads
at the same time to maximize CPU utilization.  As a result, it is
often referred to as Concurrency in Java. Each thread runs in parallel
with the others. Since several threads do not assign different memory areas,
they conserve memory. Furthermore, switching between threads takes less time.
 */

public class Threads {
    public static void main(String[] args) {

        //Create an object of the Multithread class
        // Multithread mT = new Multithread();
        // Multithread mT2 = new Multithread();

        //we do here five threads
        for (int i = 0; i < 5; i++) {
            Multithread mT = new Multithread(i);
            mT.start();


        }

        //other useful methods
    /*
            try {
                //it will wait until this thread terminate
                //only after that will the other thread start
                mT.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    */

        //returns a Boolean true or false
        //mT.isAlive();


        //even if we have trouble with the main thread
        // it won't affect the others
        throw new RuntimeException();


        //The number of services assigned to a given thread is referred to as its priority.
        //Any thread generated in the JVM is given a priority.
        //The priority scale runs from 1 to 10.
        // mT.setPriority(Thread.MAX_PRIORITY);
        //mT2.setPriority(Thread.MIN_PRIORITY);


        //java will start a new thread and will start the run() method
        //then a thread will start the main()
        // mT.start();

        //with this 2 different threads do the same counting
        //   mT2.start();


        //if we do this the program won't use separate threads
        //it will do run() twice
        //mT.run();
        //mT2.run();


    }
}
