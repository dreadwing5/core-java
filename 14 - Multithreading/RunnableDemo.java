public class RunnableDemo implements Runnable {
    @Override
    public void run() {

        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        RunnableDemo thread = new RunnableDemo();
        Thread thread1 = new Thread(thread);
        thread1.start();
        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }
    }
}
