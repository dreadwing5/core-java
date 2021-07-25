
class MyData1 {
    int value;
    boolean flag = true;

    synchronized public void set(int v) {
        while (flag == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        value = v;
        flag = false;
        notify(); // notify all waiting threads
    }

    synchronized public int get() {
        int x = 0;

        while (flag == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        x = value;
        flag = true;
        notify(); // notify all waiting threads
        return x;

    }
}

class Producer extends Thread {
    MyData1 data;

    Producer(MyData1 data) {
        this.data = data;
    }

    @Override
    public void run() {

        int count = 1;
        while (true) {
            data.set(count++);
            // try {
            // sleep(100);
            // } catch (InterruptedException e) {
            // e.printStackTrace();
            // }
            System.out.println("Producer : " + count);
        }

    }
}

class Consumer extends Thread {
    MyData1 data;

    Consumer(MyData1 data) {
        this.data = data;
    }

    @Override
    public void run() {
        int value;

        while (true) {
            // try {
            // sleep(100);
            // } catch (InterruptedException e) {
            // e.printStackTrace();
            // }
            value = data.get();
            System.out.println("Consumer : " + value);

        }

    }
}

public class InterProcess {
    public static void main(String[] args) {
        MyData1 data = new MyData1();

        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();

    }
}
