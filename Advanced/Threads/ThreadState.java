package Threads;

//with interface

class ThreadGetState implements Runnable {
    public void run() {

        //implemeting try-catch block to set sleep state
        // for inactive thread
        try {
            Thread.sleep(100);
        } catch (InterruptedException i1) {
            i1.printStackTrace();
        }
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
        ThreadGetState tgs1 = new ThreadGetState();
        Thread t2 = new Thread(tgs1);
        //Thread is created and its in new state
        t2.start();
        //Now t2 is moved to runnable state
        System.out.println(
                "State of t2 Thread, post calling of start() method is" +
                        " " + t2.getState());
        //create a try-catch block to set t1 in waiting state
        try {
            Thread.sleep(200);
        } catch (InterruptedException i2) {
            i2.printStackTrace();
        }
        System.out.println(
                "State of thread t2 after invoking to method sleep() is" +
                        " " + t2.getState());
        try {
            t2.join();
            System.out.println(
                    "State of Thread t2 after join() is" +
                            " " + t2.getState());
        } catch (InterruptedException i3) {
            i3.printStackTrace();
        }
        System.out.println(
                "State of thread t1 after completing execution is" +
                        " " + t1.getState());
    }
}
