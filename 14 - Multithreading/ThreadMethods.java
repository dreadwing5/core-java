
// class MyRun implements Runnable {

//     public void run() {
//     }
// }

class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // Calling the constructor of the super class Thread
        // setPriority(Thread.MAX_PRIORITY); // Setting the priority of the thread to
        // the maximum);
    }

    public void run() {
        int count = 1;
        while (true) {
            System.out.println("My Thread-> " + count++);
            // try {
            // Thread.sleep(100);
            // } catch (Exception e) {
            // System.out.println(e);
            // }

        }
    }

}

public class ThreadMethods {

    public static void main(String[] args) {

        // Thread t = new Thread(new MyRun(), "My Name");
        Thread t = new MyThread("My Thread 1");
        // System.out.println("Name -> " + t.getName());
        // System.out.println("ID -> " + t.getId());
        // t.setDaemon(true);
        t.start();

        int count = 1;
        while (true) {
            System.out.println("Main -> " + count++);
            Thread.yield();
            // try {
            // Thread.sleep(100);
            // } catch (Exception e) {
            // System.out.println(e);
            // }

        }

        // Thread mainThread = Thread.currentThread();

        // try {

        // mainThread.join();
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        // t.interrupt(); // Interrupt will wake up the thread

        // System.out.println("State -> " + t.getState());
        // System.out.println("Priority -> " + t.getPriority());
        // System.out.println("IsAlive -> " + t.isAlive());
    }

}
