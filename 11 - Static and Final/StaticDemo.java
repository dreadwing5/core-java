
class Test {
    static int x = 10;
    int y = 20;

    void show() {
        System.out.println(x);
        System.out.println(y);
    }

    static void display() {

        System.out.println(x);
        // System.out.println(y); // Error
    }
}

public class StaticDemo {

    public static void main(String[] args) {

        Test t1 = new Test();
        t1.x = 30;
        t1.y = 50;
        t1.show();

        Test t2 = new Test();
        t2.show();
    }

}
