package Threads;

//we can do it with implementing the Runnable interface
//with slight differences
//this way we can implement more interfaces, and we can
//extend from a different class
public class Multithread extends Thread {
    //override the Thread class run() method

    private int threadNumber;

    //constructor so we can see which thread is used
    public Multithread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        //print 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber);

            //if we have an exception with a thread,
            //it won't affect the others
            if(threadNumber ==3){
                throw new RuntimeException();
            }
            try {
                //wait 1s between numbers
                Thread.sleep(1000);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
