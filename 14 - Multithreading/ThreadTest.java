// class MyThread extends Thread {

//     @Override
//     public void run() {

//         int i = 1;
//         while (true) {
//             System.out.println(i + " Hello");
//             i++;
//         }
//     }

// }

public class ThreadTest extends Thread {
    @Override
    public void run() {

        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args) {

        // MyThread thread = new MyThread();
        ThreadTest thread = new ThreadTest();
        thread.start();
        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }
    }
}