package Threads;

//with interface

class ThreadJoin implements Runnable {
    public void run() {

        //implemeting try-catch block to set sleep state
        // for inactive thread
        try {
            Thread.sleep(100);
        } catch (InterruptedException i1) {
            i1.printStackTrace();
        }
        //It happens because we invoked the join method on th t2 thread within the t1 thread
        //The join method forces the thread on which is called to wait for the other thread to finish
        System.out.println(
                "The state for t1 after it invoked join method() on thread t2"
                        + " " + ThreadState.t1.getState());
        //implementing try-catch block
        try {
            Thread.sleep(200);
        } catch (InterruptedException i2) {
            i2.printStackTrace();
        }
    }
}

//creation of ThreadState class
//to implement Runnable interface
public class ThreadState implements Runnable {
    public static Thread t1;
    public static ThreadState o1;

    public static void main(String[] args) {
        o1 = new ThreadState();
        t1 = new Thread(o1);

        //Here we created the thread so its going to be new
        System.out.println("post-spanning, state of t1 is"
                + " " + t1.getState());
        //lets invoke start() method on t1
        t1.start();
        //Now thread t1 is moved to runnable state
        System.out.println(
                "post invoking of start() method, state of t1 is" +
                        " " + t1.getState()
        );
    }

    public void run() {
        ThreadJoin tj1 = new ThreadJoin();
        //Here we passed the Thread object from t1 to t2
        Thread t2 = new Thread(tj1);
        //Thread is created and its in new state
        t2.start();
        //Now t2 is moved to runnable state
        //After start both of them is in the runnable state
        System.out.println(
                "State of t2 Thread, post calling of start() method is" +
                        " " + t2.getState());
        //create a try-catch block to set t1 in waiting state
        try {
            Thread.sleep(200);
        } catch (InterruptedException i2) {
            i2.printStackTrace();
        }
        //Because of the sleep method it will be in TIMED_WAITING state
        System.out.println(
                "State of thread t2 after invoking to method sleep() is" +
                        " " + t2.getState());
        try {
            t2.join();
            //When the t2.join() call is made, the t1 thread will wait for the t2 thread to finish.
            //Once the t2 thread completes its execution, it will transition to the TERMINATED state,
            //indicating that it has finished running. At this point, the t1 thread will resume its execution.
            System.out.println(
                    "State of Thread t2 after join() is" +
                            " " + t2.getState());
        } catch (InterruptedException i3) {
            i3.printStackTrace();
        }
        //the tun() method completes its execution and the t1 thread
        //will return to the RUNNABLE state
        System.out.println(
                "State of thread t1 after completing execution is" +
                        " " + t1.getState());
    }
}
